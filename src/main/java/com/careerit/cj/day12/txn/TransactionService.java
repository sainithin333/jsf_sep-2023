package com.careerit.cj.day12.txn;

import java.util.List;

public class TransactionService {

        private List<TransactionDetails> txnList;

        public TransactionService(){
            txnList = TransactionReaderUtil.loadTransactionDetails();
        }

        public void showTransactions(String mobile) {

        }
        public void showSuccessTransactions() {

        }
        public void showFailedTransactions() {

        }
        public void showTransactionStats() {
            // how many transactions are success and how many are failed
        }

}
