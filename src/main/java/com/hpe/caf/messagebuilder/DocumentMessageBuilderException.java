/*
 * Copyright 2016-2024 Open Text.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
