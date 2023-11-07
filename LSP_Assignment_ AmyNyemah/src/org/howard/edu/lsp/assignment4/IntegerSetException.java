package org.howard.edu.lsp.assignment4;

import java.io.Serializable;

public class IntegerSetException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public IntegerSetException(String message) {
        super(message);
    }
}