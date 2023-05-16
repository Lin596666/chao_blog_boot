package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BkComment;

/**
 * commentMapper接口
 *
 * @author ruoyi
 * @date 2023-05-15
 */
public interface BkCommentMapper
{
    /**
     * 查询comment
     *
     * @param id comment主键
     * @return comment
     */
    public BkComment selectBkCommentById(Long id);

    /**
     * 查询comment列表
     *
     * @param bkComment comment
     * @return comment集合
     */
    public List<BkComment> selectBkCommentList(BkComment bkComment);

    /**
     * 新增comment
     *
     * @param bkComment comment
     * @return 结果
     */
    public int insertBkComment(BkComment bkComment);

    /**
     * 修改comment
     *
     * @param bkComment comment
     * @return 结果
     */
    public int updateBkComment(BkComment bkComment);

    /**
     * 删除comment
     *
     * @param id comment主键
     * @return 结果
     */
    public int deleteBkCommentById(Long id);

    /**
     * 批量删除comment
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBkCommentByIds(Long[] ids);
}
