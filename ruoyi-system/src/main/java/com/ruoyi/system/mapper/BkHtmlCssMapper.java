package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BkHtmlCss;

/**
 * htmlcssMapper接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface BkHtmlCssMapper 
{
    /**
     * 查询htmlcss
     * 
     * @param id htmlcss主键
     * @return htmlcss
     */
    public BkHtmlCss selectBkHtmlCssById(Long id);

    /**
     * 查询htmlcss列表
     * 
     * @param bkHtmlCss htmlcss
     * @return htmlcss集合
     */
    public List<BkHtmlCss> selectBkHtmlCssList(BkHtmlCss bkHtmlCss);

    /**
     * 新增htmlcss
     * 
     * @param bkHtmlCss htmlcss
     * @return 结果
     */
    public int insertBkHtmlCss(BkHtmlCss bkHtmlCss);

    /**
     * 修改htmlcss
     * 
     * @param bkHtmlCss htmlcss
     * @return 结果
     */
    public int updateBkHtmlCss(BkHtmlCss bkHtmlCss);

    /**
     * 删除htmlcss
     * 
     * @param id htmlcss主键
     * @return 结果
     */
    public int deleteBkHtmlCssById(Long id);

    /**
     * 批量删除htmlcss
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBkHtmlCssByIds(Long[] ids);
}
