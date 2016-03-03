package com.hpe.caf.messagebuilder;

/**
 * Defines required document services that should be available for document centric concepts
 */
public interface DocumentServices {
    /**
     * Return the simple document POJO containing information about a document.
     * @return Document object.
     */
    Document getDocument();
}
