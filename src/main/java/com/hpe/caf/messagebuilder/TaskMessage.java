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
