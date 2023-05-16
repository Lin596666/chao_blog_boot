package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * htmlcss对象 bk_html_css
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public class BkHtmlCss extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 自定义内容 */
    @Excel(name = "自定义内容")
    private String contenta;

    /** 自定义内容 */
    @Excel(name = "自定义内容")
    private String contentb;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContenta(String contenta) 
    {
        this.contenta = contenta;
    }

    public String getContenta() 
    {
        return contenta;
    }
    public void setContentb(String contentb) 
    {
        this.contentb = contentb;
    }

    public String getContentb() 
    {
        return contentb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("contenta", getContenta())
            .append("contentb", getContentb())
            .toString();
    }
}
