package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BkReactContent;

/**
 * twoService接口
 *
 * @author ruoyi
 * @date 2023-05-15
 */
public interface IBkReactContentService
{
    /**
     * 查询two
     *
     * @param id two主键
     * @return two
     */
    public BkReactContent selectBkReactContentById(Long id);

    /**
     * 查询two列表
     *
     * @param bkReactContent two
     * @return two集合
     */
    public List<BkReactContent> selectBkReactContentList(BkReactContent bkReactContent);

    /**
     * 新增two
     *
     * @param bkReactContent two
     * @return 结果
     */
    public int insertBkReactContent(BkReactContent bkReactContent);

    /**
     * 修改two
     *
     * @param bkReactContent two
     * @return 结果
     */
    public int updateBkReactContent(BkReactContent bkReactContent);

    /**
     * 批量删除two
     *
     * @param ids 需要删除的two主键集合
     * @return 结果
     */
    public int deleteBkReactContentByIds(Long[] ids);

    /**
     * 删除two信息
     *
     * @param id two主键
     * @return 结果
     */
    public int deleteBkReactContentById(Long id);
}
