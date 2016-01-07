package org.com.restapi.Bundle;

import javax.ws.rs.QueryParam;

/**
 * Created by Lyes CHIOUKH on 07/01/2016.
 */
public class MessageBeanParam {

    private @QueryParam("year") int year;
    private @QueryParam("limit") int limit;
    private @QueryParam("offset") int offset;

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets limit.
     *
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public int getOffset() {
        return offset;
    }
}
