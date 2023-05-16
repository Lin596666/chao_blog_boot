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
import com.ruoyi.system.domain.BkReactContent;
import com.ruoyi.system.service.IBkReactContentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * twoController
 *
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/content")
public class BkReactContentController extends BaseController
{
    @Autowired
    private IBkReactContentService bkReactContentService;

    /**
     * 查询two列表
     */
    @PreAuthorize("@ss.hasPermi('system:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkReactContent bkReactContent)
    {
        startPage();
        List<BkReactContent> list = bkReactContentService.selectBkReactContentList(bkReactContent);
        return getDataTable(list);
    }

    /**
     * 导出two列表
     */
    @PreAuthorize("@ss.hasPermi('system:content:export')")
    @Log(title = "two", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkReactContent bkReactContent)
    {
        List<BkReactContent> list = bkReactContentService.selectBkReactContentList(bkReactContent);
        ExcelUtil<BkReactContent> util = new ExcelUtil<BkReactContent>(BkReactContent.class);
        util.exportExcel(response, list, "two数据");
    }

    /**
     * 获取two详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:content:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkReactContentService.selectBkReactContentById(id));
    }

    /**
     * 新增two
     */
    @PreAuthorize("@ss.hasPermi('system:content:add')")
    @Log(title = "two", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkReactContent bkReactContent)
    {
        return toAjax(bkReactContentService.insertBkReactContent(bkReactContent));
    }

    /**
     * 修改two
     */
    @PreAuthorize("@ss.hasPermi('system:content:edit')")
    @Log(title = "two", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkReactContent bkReactContent)
    {
        return toAjax(bkReactContentService.updateBkReactContent(bkReactContent));
    }

    /**
     * 删除two
     */
    @PreAuthorize("@ss.hasPermi('system:content:remove')")
    @Log(title = "two", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkReactContentService.deleteBkReactContentByIds(ids));
    }
}
