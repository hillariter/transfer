package com.valex.test.config;

import com.google.inject.AbstractModule;
import com.valex.test.processor.AccountProcessor;
import com.valex.test.processor.DebitAccountProcessor;

/**
 * Created by user on 8/23/18.
 */
public class TransferModule extends AbstractModule {

    @Override
    protected void configure() {
      bind(AccountProcessor.class).to(DebitAccountProcessor.class);
    }
}
