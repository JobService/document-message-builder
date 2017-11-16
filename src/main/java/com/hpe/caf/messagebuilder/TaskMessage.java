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

/**
 * A stripped down version of the CAF task message holding the minimal amount of information required to represent a built task message.
 */
public final class TaskMessage {
    private String taskClassifier;
    private int taskApiVersion;
    private Object taskData;

    public String getTaskClassifier() {
        return taskClassifier;
    }

    public void setTaskClassifier(String taskClassifier) {
        this.taskClassifier = taskClassifier;
    }

    public int getTaskApiVersion() {
        return taskApiVersion;
    }

    public void setTaskApiVersion(int taskApiVersion) {
        this.taskApiVersion = taskApiVersion;
    }

    public Object getTaskData() {
        return taskData;
    }

    public void setTaskData(Object taskData) {
        this.taskData = taskData;
    }
}
