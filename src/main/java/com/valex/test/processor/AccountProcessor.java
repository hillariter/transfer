package com.valex.test.processor;

import com.valex.test.model.Account;

/**
 * Created by user on 8/23/18.
 */
public interface AccountProcessor {
    void sendTo(Account account);
}
