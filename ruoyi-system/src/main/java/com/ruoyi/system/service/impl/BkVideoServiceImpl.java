package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BkVideoMapper;
import com.ruoyi.system.domain.BkVideo;
import com.ruoyi.system.service.IBkVideoService;

/**
 * videoService业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@Service
public class BkVideoServiceImpl implements IBkVideoService 
{
    @Autowired
    private BkVideoMapper bkVideoMapper;

    /**
     * 查询video
     * 
     * @param id video主键
     * @return video
     */
    @Override
    public BkVideo selectBkVideoById(Long id)
    {
        return bkVideoMapper.selectBkVideoById(id);
    }

    /**
     * 查询video列表
     * 
     * @param bkVideo video
     * @return video
     */
    @Override
    public List<BkVideo> selectBkVideoList(BkVideo bkVideo)
    {
        return bkVideoMapper.selectBkVideoList(bkVideo);
    }

    /**
     * 新增video
     * 
     * @param bkVideo video
     * @return 结果
     */
    @Override
    public int insertBkVideo(BkVideo bkVideo)
    {
        return bkVideoMapper.insertBkVideo(bkVideo);
    }

    /**
     * 修改video
     * 
     * @param bkVideo video
     * @return 结果
     */
    @Override
    public int updateBkVideo(BkVideo bkVideo)
    {
        return bkVideoMapper.updateBkVideo(bkVideo);
    }

    /**
     * 批量删除video
     * 
     * @param ids 需要删除的video主键
     * @return 结果
     */
    @Override
    public int deleteBkVideoByIds(Long[] ids)
    {
        return bkVideoMapper.deleteBkVideoByIds(ids);
    }

    /**
     * 删除video信息
     * 
     * @param id video主键
     * @return 结果
     */
    @Override
    public int deleteBkVideoById(Long id)
    {
        return bkVideoMapper.deleteBkVideoById(id);
    }
}
