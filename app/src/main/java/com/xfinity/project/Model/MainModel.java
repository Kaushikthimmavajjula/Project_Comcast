package com.xfinity.project.Model;

import java.util.ArrayList;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public class MainModel {
    private String AbstractText;

    private String ImageIsLogo;

    private String Answer;

    private String Type;

    private String Heading;

    private String Infobox;

    private String DefinitionSource;

    private String AbstractSource;

    private String DefinitionURL;

    private Meta meta;

    private String Redirect;

    private String Image;

    private String AbstractURL;

    private String ImageWidth;

    private ArrayList<RelatedTopics> RelatedTopics;

    private String[] Results;

    private String AnswerType;

    private String Definition;

    private String Entity;

    private String Abstract;

    private String ImageHeight;

    public String getAbstractText ()
    {
        return AbstractText;
    }

    public void setAbstractText (String AbstractText)
    {
        this.AbstractText = AbstractText;
    }

    public String getImageIsLogo ()
    {
        return ImageIsLogo;
    }

    public void setImageIsLogo (String ImageIsLogo)
    {
        this.ImageIsLogo = ImageIsLogo;
    }

    public String getAnswer ()
    {
        return Answer;
    }

    public void setAnswer (String Answer)
    {
        this.Answer = Answer;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getHeading ()
    {
        return Heading;
    }

    public void setHeading (String Heading)
    {
        this.Heading = Heading;
    }

    public String getInfobox ()
    {
        return Infobox;
    }

    public void setInfobox (String Infobox)
    {
        this.Infobox = Infobox;
    }

    public String getDefinitionSource ()
    {
        return DefinitionSource;
    }

    public void setDefinitionSource (String DefinitionSource)
    {
        this.DefinitionSource = DefinitionSource;
    }

    public String getAbstractSource ()
    {
        return AbstractSource;
    }

    public void setAbstractSource (String AbstractSource)
    {
        this.AbstractSource = AbstractSource;
    }

    public String getDefinitionURL ()
    {
        return DefinitionURL;
    }

    public void setDefinitionURL (String DefinitionURL)
    {
        this.DefinitionURL = DefinitionURL;
    }

    public Meta getMeta ()
    {
        return meta;
    }

    public void setMeta (Meta meta)
    {
        this.meta = meta;
    }

    public String getRedirect ()
    {
        return Redirect;
    }

    public void setRedirect (String Redirect)
    {
        this.Redirect = Redirect;
    }

    public String getImage ()
    {
        return Image;
    }

    public void setImage (String Image)
    {
        this.Image = Image;
    }

    public String getAbstractURL ()
    {
        return AbstractURL;
    }

    public void setAbstractURL (String AbstractURL)
    {
        this.AbstractURL = AbstractURL;
    }

    public String getImageWidth ()
    {
        return ImageWidth;
    }

    public void setImageWidth (String ImageWidth)
    {
        this.ImageWidth = ImageWidth;
    }

    public ArrayList<RelatedTopics> getRelatedTopics ()
    {
        return RelatedTopics;
    }

    public void setRelatedTopics (ArrayList<RelatedTopics> RelatedTopics)
    {
        this.RelatedTopics = RelatedTopics;
    }

    public String[] getResults ()
    {
        return Results;
    }

    public void setResults (String[] Results)
    {
        this.Results = Results;
    }

    public String getAnswerType ()
    {
        return AnswerType;
    }

    public void setAnswerType (String AnswerType)
    {
        this.AnswerType = AnswerType;
    }

    public String getDefinition ()
    {
        return Definition;
    }

    public void setDefinition (String Definition)
    {
        this.Definition = Definition;
    }

    public String getEntity ()
    {
        return Entity;
    }

    public void setEntity (String Entity)
    {
        this.Entity = Entity;
    }

    public String getAbstract ()
    {
        return Abstract;
    }

    public void setAbstract (String Abstract)
    {
        this.Abstract = Abstract;
    }

    public String getImageHeight ()
    {
        return ImageHeight;
    }

    public void setImageHeight (String ImageHeight)
    {
        this.ImageHeight = ImageHeight;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [AbstractText = "+AbstractText+", ImageIsLogo = "+ImageIsLogo+", Answer = "+Answer+", Type = "+Type+", Heading = "+Heading+", Infobox = "+Infobox+", DefinitionSource = "+DefinitionSource+", AbstractSource = "+AbstractSource+", DefinitionURL = "+DefinitionURL+", meta = "+meta+", Redirect = "+Redirect+", Image = "+Image+", AbstractURL = "+AbstractURL+", ImageWidth = "+ImageWidth+", RelatedTopics = "+RelatedTopics+", Results = "+Results+", AnswerType = "+AnswerType+", Definition = "+Definition+", Entity = "+Entity+", Abstract = "+Abstract+", ImageHeight = "+ImageHeight+"]";
    }

}
