package com.xfinity.project.Model;

import java.io.Serializable;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public class Icon implements Serializable{
    private String Height;

    private String Width;

    private String URL;

    public String getHeight ()
    {
        return Height;
    }

    public void setHeight (String Height)
    {
        this.Height = Height;
    }

    public String getWidth ()
    {
        return Width;
    }

    public void setWidth (String Width)
    {
        this.Width = Width;
    }

    public String getURL ()
    {
        return URL;
    }

    public void setURL (String URL)
    {
        this.URL = URL;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Height = "+Height+", Width = "+Width+", URL = "+URL+"]";
    }
}
