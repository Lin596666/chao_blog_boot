package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BkJavascript;

/**
 * javascriptMapper接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface BkJavascriptMapper 
{
    /**
     * 查询javascript
     * 
     * @param id javascript主键
     * @return javascript
     */
    public BkJavascript selectBkJavascriptById(Long id);

    /**
     * 查询javascript列表
     * 
     * @param bkJavascript javascript
     * @return javascript集合
     */
    public List<BkJavascript> selectBkJavascriptList(BkJavascript bkJavascript);

    /**
     * 新增javascript
     * 
     * @param bkJavascript javascript
     * @return 结果
     */
    public int insertBkJavascript(BkJavascript bkJavascript);

    /**
     * 修改javascript
     * 
     * @param bkJavascript javascript
     * @return 结果
     */
    public int updateBkJavascript(BkJavascript bkJavascript);

    /**
     * 删除javascript
     * 
     * @param id javascript主键
     * @return 结果
     */
    public int deleteBkJavascriptById(Long id);

    /**
     * 批量删除javascript
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBkJavascriptByIds(Long[] ids);
}
