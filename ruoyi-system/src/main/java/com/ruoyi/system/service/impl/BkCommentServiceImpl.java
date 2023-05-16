package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkCommentMapper;
import com.ruoyi.system.domain.BkComment;
import com.ruoyi.system.service.IBkCommentService;

/**
 * commentService业务层处理
 *
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkCommentServiceImpl implements IBkCommentService
{
    @Autowired
    private BkCommentMapper bkCommentMapper;

    /**
     * 查询comment
     *
     * @param id comment主键
     * @return comment
     */
    @Override
    public BkComment selectBkCommentById(Long id)
    {
        return bkCommentMapper.selectBkCommentById(id);
    }

    /**
     * 查询comment列表
     *
     * @param bkComment comment
     * @return comment
     */
    @Override
    public List<BkComment> selectBkCommentList(BkComment bkComment)
    {
        return bkCommentMapper.selectBkCommentList(bkComment);
    }

    /**
     * 新增comment
     *
     * @param bkComment comment
     * @return 结果
     */
    @Override
    public int insertBkComment(BkComment bkComment)
    {
        return bkCommentMapper.insertBkComment(bkComment);
    }

    /**
     * 修改comment
     *
     * @param bkComment comment
     * @return 结果
     */
    @Override
    public int updateBkComment(BkComment bkComment)
    {
        return bkCommentMapper.updateBkComment(bkComment);
    }

    /**
     * 批量删除comment
     *
     * @param ids 需要删除的comment主键
     * @return 结果
     */
    @Override
    public int deleteBkCommentByIds(Long[] ids)
    {
        return bkCommentMapper.deleteBkCommentByIds(ids);
    }

    /**
     * 删除comment信息
     *
     * @param id comment主键
     * @return 结果
     */
    @Override
    public int deleteBkCommentById(Long id)
    {
        return bkCommentMapper.deleteBkCommentById(id);
    }
}
