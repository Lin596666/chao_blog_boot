package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BkVideo;
import com.ruoyi.system.service.IBkVideoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * videoController
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/video")
public class BkVideoController extends BaseController
{
    @Autowired
    private IBkVideoService bkVideoService;

    /**
     * 查询video列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkVideo bkVideo)
    {
        startPage();
        List<BkVideo> list = bkVideoService.selectBkVideoList(bkVideo);
        return getDataTable(list);
    }

    /**
     * 导出video列表
     */
    @PreAuthorize("@ss.hasPermi('system:video:export')")
    @Log(title = "video", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkVideo bkVideo)
    {
        List<BkVideo> list = bkVideoService.selectBkVideoList(bkVideo);
        ExcelUtil<BkVideo> util = new ExcelUtil<BkVideo>(BkVideo.class);
        util.exportExcel(response, list, "video数据");
    }

    /**
     * 获取video详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:video:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkVideoService.selectBkVideoById(id));
    }

    /**
     * 新增video
     */
    @PreAuthorize("@ss.hasPermi('system:video:add')")
    @Log(title = "video", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkVideo bkVideo)
    {
        return toAjax(bkVideoService.insertBkVideo(bkVideo));
    }

    /**
     * 修改video
     */
    @PreAuthorize("@ss.hasPermi('system:video:edit')")
    @Log(title = "video", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkVideo bkVideo)
    {
        return toAjax(bkVideoService.updateBkVideo(bkVideo));
    }

    /**
     * 删除video
     */
    @PreAuthorize("@ss.hasPermi('system:video:remove')")
    @Log(title = "video", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkVideoService.deleteBkVideoByIds(ids));
    }
}
