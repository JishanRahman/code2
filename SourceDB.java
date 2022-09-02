package org.jishan.records;

public class SourceDB {
    private int ID;
    private String sourceID;
    private String name;
    private String description;
    private String url;
    private String category;
    private String language;
    private String country;

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static class SortSourcesByID implements Comparator<SourceDB> {
        @Override
        public int compare(SourceDB o1, SourceDB o2) {
            return o1.getID() - o2.getID();
        }
    }
    public static class SortSourcesByName implements Comparator<SourceDB> {
        @Override
        public int compare(SourceDB o1, SourceDB o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    public static class SortSourcesByLanguage implements Comparator<SourceDB> {
        @Override
        public int compare(SourceDB o1, SourceDB o2) {
            return o1.getLanguage().compareTo(o2.getLanguage());
        }
    }
    public static class SortSourcesByCategory implements Comparator<SourceDB> {
        @Override
        public int compare(SourceDB o1, SourceDB o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    }
    public static class SortSourcesByCountry implements Comparator<SourceDB> {
        @Override
        public int compare(SourceDB o1, SourceDB o2) {
            return o1.getCountry().compareTo(o2.getCountry());
        }
    }
}
