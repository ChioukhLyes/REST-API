package org.com.restapi.service;

import org.com.restapi.Bundle.Database;
import org.com.restapi.model.Comment;
import org.com.restapi.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Lyes CHIOUKH on 28/12/2015.
 */
public class CommentService {


    private Map<Long, Message> messages = Database.getMessages();

    /**
     * Get all messages list.
     *
     * @param messageId the message id
     * @return the list
     */
    public List<Comment> getAllComments(long messageId) {
        Map<Long, Comment> comments = messages.get(messageId).getComments();
        return new ArrayList<>(comments.values());
    }

    /**
     * Get mesage message.
     *
     * @param messageId the message id
     * @param commentId the comment id
     * @return the message
     */
    public Comment getComment(long messageId, long commentId) {
        return messages.get(messageId).getComments().get(commentId);
    }

    /**
     * Add message message.
     *
     * @param messageId the message id
     * @param comment   the comment
     * @return the message
     */
    public Comment addComment(Long messageId, Comment comment) {
        Map<Long, Comment>  comments = messages.get(messageId).getComments();
        comment.setId(comments.size() + 1);
        comments.put(comment.getId(), comment);
        return comment;
    }

    /**
     * Update message message.
     *
     * @param messageId the message id
     * @param comment   the comment
     * @return the message
     */
    public Comment updateComment(long messageId, Comment comment) {
        if (comment.getId() <= 0) {
            return null;
        }
        Map<Long, Comment> comments = messages.get(messageId).getComments();
        comments.put(comment.getId(), comment);
        return comment;
    }

    /**
     * Delete message message.
     *
     * @param messageId the message id
     * @param commentId the comment id
     * @return the message
     */
    public Comment deleteComment(long messageId, long commentId) {
        Map<Long, Comment> comments = messages.get(messageId).getComments();
        return comments.remove(commentId);
    }
}
