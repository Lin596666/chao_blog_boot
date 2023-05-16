package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkHtmlCssMapper;
import com.ruoyi.system.domain.BkHtmlCss;
import com.ruoyi.system.service.IBkHtmlCssService;

/**
 * htmlcssService业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkHtmlCssServiceImpl implements IBkHtmlCssService 
{
    @Autowired
    private BkHtmlCssMapper bkHtmlCssMapper;

    /**
     * 查询htmlcss
     * 
     * @param id htmlcss主键
     * @return htmlcss
     */
    @Override
    public BkHtmlCss selectBkHtmlCssById(Long id)
    {
        return bkHtmlCssMapper.selectBkHtmlCssById(id);
    }

    /**
     * 查询htmlcss列表
     * 
     * @param bkHtmlCss htmlcss
     * @return htmlcss
     */
    @Override
    public List<BkHtmlCss> selectBkHtmlCssList(BkHtmlCss bkHtmlCss)
    {
        return bkHtmlCssMapper.selectBkHtmlCssList(bkHtmlCss);
    }

    /**
     * 新增htmlcss
     * 
     * @param bkHtmlCss htmlcss
     * @return 结果
     */
    @Override
    public int insertBkHtmlCss(BkHtmlCss bkHtmlCss)
    {
        return bkHtmlCssMapper.insertBkHtmlCss(bkHtmlCss);
    }

    /**
     * 修改htmlcss
     * 
     * @param bkHtmlCss htmlcss
     * @return 结果
     */
    @Override
    public int updateBkHtmlCss(BkHtmlCss bkHtmlCss)
    {
        return bkHtmlCssMapper.updateBkHtmlCss(bkHtmlCss);
    }

    /**
     * 批量删除htmlcss
     * 
     * @param ids 需要删除的htmlcss主键
     * @return 结果
     */
    @Override
    public int deleteBkHtmlCssByIds(Long[] ids)
    {
        return bkHtmlCssMapper.deleteBkHtmlCssByIds(ids);
    }

    /**
     * 删除htmlcss信息
     * 
     * @param id htmlcss主键
     * @return 结果
     */
    @Override
    public int deleteBkHtmlCssById(Long id)
    {
        return bkHtmlCssMapper.deleteBkHtmlCssById(id);
    }
}
