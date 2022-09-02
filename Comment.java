package org.jishan.records;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Comment {
    private int articleID;
    private int commentID;
    private double userID;
    private int likes;
    private int dislikes;
    private String commentText;
    private String answersToComment;
    private String dateTime;

    public Comment(){}

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public double getUserID() {
        return userID;
    }

    public void setUserID(double userID) {
        this.userID = userID;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getAnswersToComment() {
        return answersToComment;
    }

    public void setAnswersToComment(String answersToComment) {
        this.answersToComment = answersToComment;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    public static class SortCommentsByLikes implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return o2.getLikes()- o1.getLikes();
        }
    }
    public static class SortCommentsByDisikes implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return o2.getDislikes()- o1.getDislikes();
        }
    }
    public static class SortCommentsByID implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return o1.getCommentID() - o2.getCommentID();
        }
    }
    public static class SortCommentsByDate implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return o2.getDateTime().compareTo(o1.getDateTime());
        }
    }
    public static class SortCommentsByUserID implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return (int)(o1.getUserID() - o2.getUserID());
        }
    }
    public static class SortCommentsByArticleID implements Comparator<Comment> {
        @Override
        public int compare(Comment o1, Comment o2) {
            return o1.getArticleID() - o2.getArticleID();
        }
    }
}
