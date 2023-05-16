package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.BkComment;
import com.ruoyi.system.service.IBkCommentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * commentController
 *
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/comment")
public class BkCommentController extends BaseController
{
    @Autowired
    private IBkCommentService bkCommentService;

    /**
     * 查询comment列表
     */
    @PreAuthorize("@ss.hasPermi('system:comment:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkComment bkComment)
    {
        startPage();
        List<BkComment> list = bkCommentService.selectBkCommentList(bkComment);
        return getDataTable(list);
    }

    /**
     * 导出comment列表
     */
    @PreAuthorize("@ss.hasPermi('system:comment:export')")
    @Log(title = "comment", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkComment bkComment)
    {
        List<BkComment> list = bkCommentService.selectBkCommentList(bkComment);
        ExcelUtil<BkComment> util = new ExcelUtil<BkComment>(BkComment.class);
        util.exportExcel(response, list, "comment数据");
    }

    /**
     * 获取comment详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:comment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkCommentService.selectBkCommentById(id));
    }

    /**
     * 新增comment
     */
    @PreAuthorize("@ss.hasPermi('system:comment:add')")
    @Log(title = "comment", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkComment bkComment)
    {
        return toAjax(bkCommentService.insertBkComment(bkComment));
    }

    /**
     * 修改comment
     */
    @PreAuthorize("@ss.hasPermi('system:comment:edit')")
    @Log(title = "comment", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkComment bkComment)
    {
        return toAjax(bkCommentService.updateBkComment(bkComment));
    }

    /**
     * 删除comment
     */
    @PreAuthorize("@ss.hasPermi('system:comment:remove')")
    @Log(title = "comment", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkCommentService.deleteBkCommentByIds(ids));
    }
}
