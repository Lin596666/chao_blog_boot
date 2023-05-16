package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkReactContentMapper;
import com.ruoyi.system.domain.BkReactContent;
import com.ruoyi.system.service.IBkReactContentService;

/**
 * twoService业务层处理
 *
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkReactContentServiceImpl implements IBkReactContentService
{
    @Autowired
    private BkReactContentMapper bkReactContentMapper;

    /**
     * 查询two
     *
     * @param id two主键
     * @return two
     */
    @Override
    public BkReactContent selectBkReactContentById(Long id)
    {
        return bkReactContentMapper.selectBkReactContentById(id);
    }

    /**
     * 查询two列表
     *
     * @param bkReactContent two
     * @return two
     */
    @Override
    public List<BkReactContent> selectBkReactContentList(BkReactContent bkReactContent)
    {
        return bkReactContentMapper.selectBkReactContentList(bkReactContent);
    }

    /**
     * 新增two
     *
     * @param bkReactContent two
     * @return 结果
     */
    @Override
    public int insertBkReactContent(BkReactContent bkReactContent)
    {
        return bkReactContentMapper.insertBkReactContent(bkReactContent);
    }

    /**
     * 修改two
     *
     * @param bkReactContent two
     * @return 结果
     */
    @Override
    public int updateBkReactContent(BkReactContent bkReactContent)
    {
        return bkReactContentMapper.updateBkReactContent(bkReactContent);
    }

    /**
     * 批量删除two
     *
     * @param ids 需要删除的two主键
     * @return 结果
     */
    @Override
    public int deleteBkReactContentByIds(Long[] ids)
    {
        return bkReactContentMapper.deleteBkReactContentByIds(ids);
    }

    /**
     * 删除two信息
     *
     * @param id two主键
     * @return 结果
     */
    @Override
    public int deleteBkReactContentById(Long id)
    {
        return bkReactContentMapper.deleteBkReactContentById(id);
    }
}
