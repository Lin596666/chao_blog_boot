package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkJavascriptMapper;
import com.ruoyi.system.domain.BkJavascript;
import com.ruoyi.system.service.IBkJavascriptService;

/**
 * javascriptService业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkJavascriptServiceImpl implements IBkJavascriptService 
{
    @Autowired
    private BkJavascriptMapper bkJavascriptMapper;

    /**
     * 查询javascript
     * 
     * @param id javascript主键
     * @return javascript
     */
    @Override
    public BkJavascript selectBkJavascriptById(Long id)
    {
        return bkJavascriptMapper.selectBkJavascriptById(id);
    }

    /**
     * 查询javascript列表
     * 
     * @param bkJavascript javascript
     * @return javascript
     */
    @Override
    public List<BkJavascript> selectBkJavascriptList(BkJavascript bkJavascript)
    {
        return bkJavascriptMapper.selectBkJavascriptList(bkJavascript);
    }

    /**
     * 新增javascript
     * 
     * @param bkJavascript javascript
     * @return 结果
     */
    @Override
    public int insertBkJavascript(BkJavascript bkJavascript)
    {
        return bkJavascriptMapper.insertBkJavascript(bkJavascript);
    }

    /**
     * 修改javascript
     * 
     * @param bkJavascript javascript
     * @return 结果
     */
    @Override
    public int updateBkJavascript(BkJavascript bkJavascript)
    {
        return bkJavascriptMapper.updateBkJavascript(bkJavascript);
    }

    /**
     * 批量删除javascript
     * 
     * @param ids 需要删除的javascript主键
     * @return 结果
     */
    @Override
    public int deleteBkJavascriptByIds(Long[] ids)
    {
        return bkJavascriptMapper.deleteBkJavascriptByIds(ids);
    }

    /**
     * 删除javascript信息
     * 
     * @param id javascript主键
     * @return 结果
     */
    @Override
    public int deleteBkJavascriptById(Long id)
    {
        return bkJavascriptMapper.deleteBkJavascriptById(id);
    }
}
