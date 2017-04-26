package com.example.android.githubsearch.utils;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by hessro on 4/25/17.
 */

public class GitHubUtils {

    private final static String GITHUB_SEARCH_BASE_URL = "https://api.github.com/search/repositories";
    private final static String GITHUB_SEARCH_QUERY_PARAM = "q";
    private final static String GITHUB_SEARCH_SORT_PARAM = "sort";
    private final static String GITHUB_SEARCH_DEFAULT_SORT = "stars";

    public static URL buildGitHubSearchURL(String searchQuery) {
        Uri gitHubSearchUri = Uri.parse(GITHUB_SEARCH_BASE_URL).buildUpon()
                .appendQueryParameter(GITHUB_SEARCH_QUERY_PARAM, searchQuery)
                .appendQueryParameter(GITHUB_SEARCH_SORT_PARAM, GITHUB_SEARCH_DEFAULT_SORT)
                .build();

        URL url = null;
        try {
            url = new URL(gitHubSearchUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
