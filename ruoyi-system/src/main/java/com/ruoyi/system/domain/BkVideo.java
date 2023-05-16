package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * video对象 bk_video
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public class BkVideo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 资源地址 */
    @Excel(name = "资源地址")
    private String videourl;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setVideourl(String videourl) 
    {
        this.videourl = videourl;
    }

    public String getVideourl() 
    {
        return videourl;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("videourl", getVideourl())
            .append("password", getPassword())
            .append("title", getTitle())
            .toString();
    }
}
