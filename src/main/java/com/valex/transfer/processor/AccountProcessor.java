package com.valex.transfer.processor;

import com.valex.transfer.model.Account;

/**
 * Created by user on 8/23/18.
 */
public interface AccountProcessor {
    void sendTo(Account account);
}
