package org.jishan.records;

import java.util.ArrayList;

public class User {
    private double userID;
    private int appVote;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private String language;
    private String prefCategories;
    private String prefLanguages;
    private String prefFeed;
    private String likedArticles;
    private boolean notifications;
    private boolean receiveFiles;
    private boolean simpleMode;
    private boolean accessed;

    public User(){}

    public void setUserID(double userID) {
        this.userID = userID;
    }

    public void setAppVote(int appVote) {
        this.appVote = appVote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSimpleMode(boolean simpleMode) {
        this.simpleMode = simpleMode;
    }

    public void setPrefCategories(String prefCategories) {
        this.prefCategories = prefCategories;
    }

    public void setPrefLanguages(String prefLanguages) {
        this.prefLanguages = prefLanguages;
    }

    public void setPrefFeed(String prefFeed) {
        this.prefFeed = prefFeed;
    }

    public void setLikedArticles(String likedArticles) {
        this.likedArticles = likedArticles;
    }
    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public void setReceiveFiles(boolean receiveFiles) {
        this.receiveFiles = receiveFiles;
    }

    public double getUserID() {
        return userID;
    }

    public int getAppVote() {
        return appVote;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getLanguage() {
        return language;
    }

    public boolean simpleMode() {
        return simpleMode;
    }

    public String getPrefCategories() {
        return prefCategories;
    }

    public String getPrefLanguages() {
        return prefLanguages;
    }

    public String getPrefFeed() {
        return prefFeed;
    }

    public String getLikedArticles() {
        return likedArticles;
    }

    public boolean notifications() {
        return notifications;
    }

    public boolean receiveFiles() {
        return receiveFiles;
    }

    public boolean isAccessed() {
        return accessed;
    }

    public void setAccessed(boolean accessed) {
        this.accessed = accessed;
    }

    public static class SortUsersByID implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return (int)(o1.getUserID() - o2.getUserID());
        }
    }
    public static class SortUsersByAppVote implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o2.getAppVote() - o1.getAppVote();
        }
    }
    public static class SortUsersByUsername implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.getUsername().compareTo(o2.getUsername());
        }
    }
    public static class SortUsersByLanguage implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.getLanguage().compareTo(o2.getLanguage());
        }
    }
    public static class SortUsersByAccessed implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Boolean.compare(o2.isAccessed(),o1.isAccessed());
        }
    }
    public static class SortUsersByNotifications implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Boolean.compare(o2.notifications(),o1.notifications());
        }
    }
    public static class SortUsersBySimpleMode implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Boolean.compare(o1.simpleMode(),o2.simpleMode());
        }
    }
    public static class SortUsersByReceiveFiles implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return Boolean.compare(o2.receiveFiles(),o1.receiveFiles());
        }
    }
}
