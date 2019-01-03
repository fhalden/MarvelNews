package com.example.android.marvelnews;

/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /** Name of the Section */
    private String mSection;

    /** Title of the article */
    private String mTitle;

    /** Article publication date */
    private String mPublicationDate;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param section is the magnitude (size) of the earthquake
     * @param title is the location where the earthquake happened
     * @param publicationDate is the date of publication of the article
     * @param url is the website URL of the article
     */
    public Article(String section, String title, String publicationDate, String url) {
        mSection = section;
        mTitle = title;
        mPublicationDate = publicationDate;
        mUrl = url;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the publication date of the article.
     */
    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the website URL for the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
