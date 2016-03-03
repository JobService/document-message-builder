package com.hpe.caf.messagebuilder;

/**
 * Simple interface onto a document representation
 */
public interface Document {
    void setStorageReference(String storageReference);
    String getStorageReference();
}
