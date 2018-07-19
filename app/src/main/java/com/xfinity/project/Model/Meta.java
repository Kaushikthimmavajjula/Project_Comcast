package com.xfinity.project.Model;

/**
 * Created by kaushikramesh on 7/16/18.
 */

public class Meta {
    private String is_stackexchange;

    private String tab;

    private String src_url;

    private String src_id;

    private String id;

    private Src_options src_options;

    private String perl_module;

    private String repo;

    private String description;

    private String name;

    private String src_name;

    private String[] topic;

    private String created_date;

    private String status;

    private String dev_date;

    private String designer;

    private String signal_from;

    private String dev_milestone;

    private String live_date;

    private String src_domain;

    private Maintainer maintainer;

    private String blockgroup;

    private String production_state;

    private Developer[] developer;

    private String example_query;

    private String producer;

    private String js_callback_name;

    private String attribution;

    private String unsafe;

    public String getIs_stackexchange ()
    {
        return is_stackexchange;
    }

    public void setIs_stackexchange (String is_stackexchange)
    {
        this.is_stackexchange = is_stackexchange;
    }

    public String getTab ()
    {
        return tab;
    }

    public void setTab (String tab)
    {
        this.tab = tab;
    }

    public String getSrc_url ()
    {
        return src_url;
    }

    public void setSrc_url (String src_url)
    {
        this.src_url = src_url;
    }

    public String getSrc_id ()
    {
        return src_id;
    }

    public void setSrc_id (String src_id)
    {
        this.src_id = src_id;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Src_options getSrc_options ()
    {
        return src_options;
    }

    public void setSrc_options (Src_options src_options)
    {
        this.src_options = src_options;
    }

    public String getPerl_module ()
    {
        return perl_module;
    }

    public void setPerl_module (String perl_module)
    {
        this.perl_module = perl_module;
    }

    public String getRepo ()
    {
        return repo;
    }

    public void setRepo (String repo)
    {
        this.repo = repo;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getSrc_name ()
    {
        return src_name;
    }

    public void setSrc_name (String src_name)
    {
        this.src_name = src_name;
    }

    public String[] getTopic ()
    {
        return topic;
    }

    public void setTopic (String[] topic)
    {
        this.topic = topic;
    }

    public String getCreated_date ()
    {
        return created_date;
    }

    public void setCreated_date (String created_date)
    {
        this.created_date = created_date;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getDev_date ()
    {
        return dev_date;
    }

    public void setDev_date (String dev_date)
    {
        this.dev_date = dev_date;
    }

    public String getDesigner ()
    {
        return designer;
    }

    public void setDesigner (String designer)
    {
        this.designer = designer;
    }

    public String getSignal_from ()
    {
        return signal_from;
    }

    public void setSignal_from (String signal_from)
    {
        this.signal_from = signal_from;
    }

    public String getDev_milestone ()
    {
        return dev_milestone;
    }

    public void setDev_milestone (String dev_milestone)
    {
        this.dev_milestone = dev_milestone;
    }

    public String getLive_date ()
    {
        return live_date;
    }

    public void setLive_date (String live_date)
    {
        this.live_date = live_date;
    }

    public String getSrc_domain ()
    {
        return src_domain;
    }

    public void setSrc_domain (String src_domain)
    {
        this.src_domain = src_domain;
    }

    public Maintainer getMaintainer ()
    {
        return maintainer;
    }

    public void setMaintainer (Maintainer maintainer)
    {
        this.maintainer = maintainer;
    }

    public String getBlockgroup ()
    {
        return blockgroup;
    }

    public void setBlockgroup (String blockgroup)
    {
        this.blockgroup = blockgroup;
    }

    public String getProduction_state ()
    {
        return production_state;
    }

    public void setProduction_state (String production_state)
    {
        this.production_state = production_state;
    }

    public Developer[] getDeveloper ()
    {
        return developer;
    }

    public void setDeveloper (Developer[] developer)
    {
        this.developer = developer;
    }

    public String getExample_query ()
    {
        return example_query;
    }

    public void setExample_query (String example_query)
    {
        this.example_query = example_query;
    }

    public String getProducer ()
    {
        return producer;
    }

    public void setProducer (String producer)
    {
        this.producer = producer;
    }

    public String getJs_callback_name ()
    {
        return js_callback_name;
    }

    public void setJs_callback_name (String js_callback_name)
    {
        this.js_callback_name = js_callback_name;
    }

    public String getAttribution ()
    {
        return attribution;
    }

    public void setAttribution (String attribution)
    {
        this.attribution = attribution;
    }

    public String getUnsafe ()
    {
        return unsafe;
    }

    public void setUnsafe (String unsafe)
    {
        this.unsafe = unsafe;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [is_stackexchange = "+is_stackexchange+", tab = "+tab+", src_url = "+src_url+", src_id = "+src_id+", id = "+id+", src_options = "+src_options+", perl_module = "+perl_module+", repo = "+repo+", description = "+description+", name = "+name+", src_name = "+src_name+", topic = "+topic+", created_date = "+created_date+", status = "+status+", dev_date = "+dev_date+", designer = "+designer+", signal_from = "+signal_from+", dev_milestone = "+dev_milestone+", live_date = "+live_date+", src_domain = "+src_domain+", maintainer = "+maintainer+", blockgroup = "+blockgroup+", production_state = "+production_state+", developer = "+developer+", example_query = "+example_query+", producer = "+producer+", js_callback_name = "+js_callback_name+", attribution = "+attribution+", unsafe = "+unsafe+"]";
    }
}
