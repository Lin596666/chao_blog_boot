package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkReactOneMapper;
import com.ruoyi.system.domain.BkReactOne;
import com.ruoyi.system.service.IBkReactOneService;

/**
 * bkreactoneService业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkReactOneServiceImpl implements IBkReactOneService 
{
    @Autowired
    private BkReactOneMapper bkReactOneMapper;

    /**
     * 查询bkreactone
     * 
     * @param id bkreactone主键
     * @return bkreactone
     */
    @Override
    public BkReactOne selectBkReactOneById(Long id)
    {
        return bkReactOneMapper.selectBkReactOneById(id);
    }

    /**
     * 查询bkreactone列表
     * 
     * @param bkReactOne bkreactone
     * @return bkreactone
     */
    @Override
    public List<BkReactOne> selectBkReactOneList(BkReactOne bkReactOne)
    {
        return bkReactOneMapper.selectBkReactOneList(bkReactOne);
    }

    /**
     * 新增bkreactone
     * 
     * @param bkReactOne bkreactone
     * @return 结果
     */
    @Override
    public int insertBkReactOne(BkReactOne bkReactOne)
    {
        return bkReactOneMapper.insertBkReactOne(bkReactOne);
    }

    /**
     * 修改bkreactone
     * 
     * @param bkReactOne bkreactone
     * @return 结果
     */
    @Override
    public int updateBkReactOne(BkReactOne bkReactOne)
    {
        return bkReactOneMapper.updateBkReactOne(bkReactOne);
    }

    /**
     * 批量删除bkreactone
     * 
     * @param ids 需要删除的bkreactone主键
     * @return 结果
     */
    @Override
    public int deleteBkReactOneByIds(Long[] ids)
    {
        return bkReactOneMapper.deleteBkReactOneByIds(ids);
    }

    /**
     * 删除bkreactone信息
     * 
     * @param id bkreactone主键
     * @return 结果
     */
    @Override
    public int deleteBkReactOneById(Long id)
    {
        return bkReactOneMapper.deleteBkReactOneById(id);
    }
}
