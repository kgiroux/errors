package com.giroux.kevin.dofustuff.error;

/**
 * ErrorWrapper
 *
 * @author Kévin Giroux
 */
public class ErrorWrapper {
    /**
     * Timestamp
     */
    private long timestamp;
    /**
     * Status
     */
    private int status;
    /**
     * Error
     */
    private String error;
    /**
     * Message
     */
    private String message;
    /**
     * Path
     */
    private String path;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
