/*
 * Copyright 2015-2017 EntIT Software LLC, a Micro Focus company.
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
