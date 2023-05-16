package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BkVideo;

/**
 * videoService接口
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
public interface IBkVideoService 
{
    /**
     * 查询video
     * 
     * @param id video主键
     * @return video
     */
    public BkVideo selectBkVideoById(Long id);

    /**
     * 查询video列表
     * 
     * @param bkVideo video
     * @return video集合
     */
    public List<BkVideo> selectBkVideoList(BkVideo bkVideo);

    /**
     * 新增video
     * 
     * @param bkVideo video
     * @return 结果
     */
    public int insertBkVideo(BkVideo bkVideo);

    /**
     * 修改video
     * 
     * @param bkVideo video
     * @return 结果
     */
    public int updateBkVideo(BkVideo bkVideo);

    /**
     * 批量删除video
     * 
     * @param ids 需要删除的video主键集合
     * @return 结果
     */
    public int deleteBkVideoByIds(Long[] ids);

    /**
     * 删除video信息
     * 
     * @param id video主键
     * @return 结果
     */
    public int deleteBkVideoById(Long id);
}
