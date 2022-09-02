package org.jishan.records;

public class Report {
    private int reportID;
    private int articleID;
    private int commentID;
    private double userID;
    private String reportText;
    private String dateTime;

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

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

    public String getReportText() {
        return reportText;
    }

    public void setReportText(String reportText) {
        this.reportText = reportText;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public static class SortReportsByID implements Comparator<Report> {
        @Override
        public int compare(Report o1, Report o2) {
            return o1.getReportID() - o2.getReportID();
        }
    }
    public static class SortReportsByUserID implements Comparator<Report> {
        @Override
        public int compare(Report o1, Report o2) {
            return (int)(o1.getUserID() - o2.getUserID());
        }
    }
    public static class SortReportsByCommentID implements Comparator<Report> {
        @Override
        public int compare(Report o1, Report o2) {
            return o1.getCommentID() - o2.getCommentID();
        }
    }
    public static class SortReportsByDate implements Comparator<Report> {
        @Override
        public int compare(Report o1, Report o2) {
            return o2.getDateTime().compareTo(o1.getDateTime());
        }
    }
    public static class SortReportsByArticleID implements Comparator<Report> {
        @Override
        public int compare(Report o1, Report o2) {
            return o1.getArticleID() - o2.getArticleID();
        }
    }
}
