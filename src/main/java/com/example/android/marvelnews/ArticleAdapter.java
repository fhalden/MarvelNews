package com.example.android.marvelnews;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each article
 * in the data source (a list of {@link Article} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class ArticleAdapter extends ArrayAdapter<Article> {

;

    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context of the app
     * @param articles is the list of articles, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);

        // Find the TextView with view ID section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.article_section);
        // Display the section of the current article in that TextView
        sectionView.setText(currentArticle.getSection());

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        // Display the title of the article in that TextView
        titleView.setText(currentArticle.getTitle());

        // Find the TextView with publication date
        TextView publicationDateView = (TextView) listItemView.findViewById(R.id.article_publication_date);
        // Display the location offset of the current earthquake in that TextView
        publicationDateView.setText(currentArticle.getPublicationDate());




        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }






}

