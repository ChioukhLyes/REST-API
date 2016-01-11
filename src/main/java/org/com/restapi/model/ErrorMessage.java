package org.com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lyes CHIOUKH on 11/01/2016.
 */

@XmlRootElement
public class ErrorMessage {

    private int errorCode;
    private String errorMessage;
    private String documentation;

    /**
     * Instantiates a new Error message.
     */
    public ErrorMessage() {
    }

    /**
     * Instantiates a new Error message.
     *
     * @param errorCode     the error code
     * @param errorMessage  the error message
     * @param documentation the documentation
     */
    public ErrorMessage(int errorCode, String errorMessage, String documentation) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.documentation = documentation;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Gets documentation.
     *
     * @return the documentation
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets error message.
     *
     * @param errorMessage the error message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets documentation.
     *
     * @param documentation the documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", documentation='" + documentation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ErrorMessage)) return false;

        ErrorMessage that = (ErrorMessage) o;

        if (getErrorCode() != that.getErrorCode()) return false;
        if (getErrorMessage() != null ? !getErrorMessage().equals(that.getErrorMessage()) : that.getErrorMessage() != null)
            return false;
        return getDocumentation() != null ? getDocumentation().equals(that.getDocumentation()) : that.getDocumentation() == null;

    }

    @Override
    public int hashCode() {
        int result = getErrorCode();
        result = 31 * result + (getErrorMessage() != null ? getErrorMessage().hashCode() : 0);
        result = 31 * result + (getDocumentation() != null ? getDocumentation().hashCode() : 0);
        return result;
    }
}

