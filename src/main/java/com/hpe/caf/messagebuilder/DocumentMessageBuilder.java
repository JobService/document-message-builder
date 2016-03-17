package com.hpe.caf.messagebuilder;

import java.util.Map;
/**
 * Defines the required methods on a class that constructs a specific task message type
 */
public interface DocumentMessageBuilder {
    /**
     * Constructs a task message.
     *
     * @param documentServices DocumentServices implementation providing access onto necessary document concepts for task.
     * @param taskMessageParams Task message parameters for use in constructing a specific task implementation.
     * @return The constructed task message.
     */
    TaskMessage buildMessage(DocumentServices documentServices, Map<String, String> taskMessageParams) throws DocumentMessageBuilderException;
}
