package com.easyittech.phapriceservice.exception;

public class StockCannotInsertException extends RuntimeException {
    public StockCannotInsertException(String message) {
        super(message);
    }
}
