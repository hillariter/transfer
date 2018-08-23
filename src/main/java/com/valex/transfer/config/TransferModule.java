package com.valex.transfer.config;

import com.google.inject.AbstractModule;
import com.valex.transfer.processor.AccountProcessor;
import com.valex.transfer.processor.DebitAccountProcessor;

/**
 * Created by user on 8/23/18.
 */
public class TransferModule extends AbstractModule {

    @Override
    protected void configure() {
      bind(AccountProcessor.class).to(DebitAccountProcessor.class);
    }
}
