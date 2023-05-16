package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BkReactOne;

/**
 * bkreactoneService接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface IBkReactOneService 
{
    /**
     * 查询bkreactone
     * 
     * @param id bkreactone主键
     * @return bkreactone
     */
    public BkReactOne selectBkReactOneById(Long id);

    /**
     * 查询bkreactone列表
     * 
     * @param bkReactOne bkreactone
     * @return bkreactone集合
     */
    public List<BkReactOne> selectBkReactOneList(BkReactOne bkReactOne);

    /**
     * 新增bkreactone
     * 
     * @param bkReactOne bkreactone
     * @return 结果
     */
    public int insertBkReactOne(BkReactOne bkReactOne);

    /**
     * 修改bkreactone
     * 
     * @param bkReactOne bkreactone
     * @return 结果
     */
    public int updateBkReactOne(BkReactOne bkReactOne);

    /**
     * 批量删除bkreactone
     * 
     * @param ids 需要删除的bkreactone主键集合
     * @return 结果
     */
    public int deleteBkReactOneByIds(Long[] ids);

    /**
     * 删除bkreactone信息
     * 
     * @param id bkreactone主键
     * @return 结果
     */
    public int deleteBkReactOneById(Long id);
}
