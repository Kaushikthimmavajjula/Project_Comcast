package com.xfinity.project.Model;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public class Maintainer {
    private String github;

    public String getGithub ()
    {
        return github;
    }

    public void setGithub (String github)
    {
        this.github = github;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [github = "+github+"]";
    }

}
