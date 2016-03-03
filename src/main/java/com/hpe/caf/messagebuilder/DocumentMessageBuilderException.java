package com.hpe.caf.messagebuilder;

/**
 * Exception thrown when a document message builder implementation is unable to build a message. *
 */
public class DocumentMessageBuilderException extends Exception{
    /*
        This allows control over handling of builder implementation specific exceptions by the caller.
        e.g. an ExampleWorker message builder may fail to serialize a task throwing a json processing exception,
        which we can have the implementation catch and throw as a DocumentMessageBuilderException for caller to handle
    */

    /**
     * Create a new DocumentMessageBuilderException when the issue was another exception thrown.
     * @param message the message indicating the problem
     * @param cause the exception cause
     */
    public DocumentMessageBuilderException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Create a new DocumentMessageBuilderException.
     * @param message the message indicating the problem
     */
    public DocumentMessageBuilderException(final String message)
    {
        super(message);
    }
}
