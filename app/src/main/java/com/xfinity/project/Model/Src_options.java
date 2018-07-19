package com.xfinity.project.Model;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public class Src_options {
    private String src_info;

    private String skip_qr;

    private String skip_abstract;

    private String is_fanon;

    private String source_skip;

    private String skip_image_name;

    private String min_abstract_length;

    private String directory;

    private String is_wikipedia;

    private String language;

    private String skip_end;

    private String skip_abstract_paren;

    private String is_mediawiki;

    private String skip_icon;

    public String getSrc_info ()
    {
        return src_info;
    }

    public void setSrc_info (String src_info)
    {
        this.src_info = src_info;
    }

    public String getSkip_qr ()
    {
        return skip_qr;
    }

    public void setSkip_qr (String skip_qr)
    {
        this.skip_qr = skip_qr;
    }

    public String getSkip_abstract ()
    {
        return skip_abstract;
    }

    public void setSkip_abstract (String skip_abstract)
    {
        this.skip_abstract = skip_abstract;
    }

    public String getIs_fanon ()
    {
        return is_fanon;
    }

    public void setIs_fanon (String is_fanon)
    {
        this.is_fanon = is_fanon;
    }

    public String getSource_skip ()
    {
        return source_skip;
    }

    public void setSource_skip (String source_skip)
    {
        this.source_skip = source_skip;
    }

    public String getSkip_image_name ()
    {
        return skip_image_name;
    }

    public void setSkip_image_name (String skip_image_name)
    {
        this.skip_image_name = skip_image_name;
    }

    public String getMin_abstract_length ()
    {
        return min_abstract_length;
    }

    public void setMin_abstract_length (String min_abstract_length)
    {
        this.min_abstract_length = min_abstract_length;
    }

    public String getDirectory ()
    {
        return directory;
    }

    public void setDirectory (String directory)
    {
        this.directory = directory;
    }

    public String getIs_wikipedia ()
    {
        return is_wikipedia;
    }

    public void setIs_wikipedia (String is_wikipedia)
    {
        this.is_wikipedia = is_wikipedia;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getSkip_end ()
    {
        return skip_end;
    }

    public void setSkip_end (String skip_end)
    {
        this.skip_end = skip_end;
    }

    public String getSkip_abstract_paren ()
    {
        return skip_abstract_paren;
    }

    public void setSkip_abstract_paren (String skip_abstract_paren)
    {
        this.skip_abstract_paren = skip_abstract_paren;
    }

    public String getIs_mediawiki ()
    {
        return is_mediawiki;
    }

    public void setIs_mediawiki (String is_mediawiki)
    {
        this.is_mediawiki = is_mediawiki;
    }

    public String getSkip_icon ()
    {
        return skip_icon;
    }

    public void setSkip_icon (String skip_icon)
    {
        this.skip_icon = skip_icon;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [src_info = "+src_info+", skip_qr = "+skip_qr+", skip_abstract = "+skip_abstract+", is_fanon = "+is_fanon+", source_skip = "+source_skip+", skip_image_name = "+skip_image_name+", min_abstract_length = "+min_abstract_length+", directory = "+directory+", is_wikipedia = "+is_wikipedia+", language = "+language+", skip_end = "+skip_end+", skip_abstract_paren = "+skip_abstract_paren+", is_mediawiki = "+is_mediawiki+", skip_icon = "+skip_icon+"]";
    }
}
