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
import com.ruoyi.system.domain.BkHtmlCss;
import com.ruoyi.system.service.IBkHtmlCssService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * htmlcssController
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/htmlcss")
public class BkHtmlCssController extends BaseController
{
    @Autowired
    private IBkHtmlCssService bkHtmlCssService;

    /**
     * 查询htmlcss列表
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkHtmlCss bkHtmlCss)
    {
        startPage();
        List<BkHtmlCss> list = bkHtmlCssService.selectBkHtmlCssList(bkHtmlCss);
        return getDataTable(list);
    }

    /**
     * 导出htmlcss列表
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:export')")
    @Log(title = "htmlcss", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkHtmlCss bkHtmlCss)
    {
        List<BkHtmlCss> list = bkHtmlCssService.selectBkHtmlCssList(bkHtmlCss);
        ExcelUtil<BkHtmlCss> util = new ExcelUtil<BkHtmlCss>(BkHtmlCss.class);
        util.exportExcel(response, list, "htmlcss数据");
    }

    /**
     * 获取htmlcss详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkHtmlCssService.selectBkHtmlCssById(id));
    }

    /**
     * 新增htmlcss
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:add')")
    @Log(title = "htmlcss", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkHtmlCss bkHtmlCss)
    {
        return toAjax(bkHtmlCssService.insertBkHtmlCss(bkHtmlCss));
    }

    /**
     * 修改htmlcss
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:edit')")
    @Log(title = "htmlcss", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkHtmlCss bkHtmlCss)
    {
        return toAjax(bkHtmlCssService.updateBkHtmlCss(bkHtmlCss));
    }

    /**
     * 删除htmlcss
     */
    @PreAuthorize("@ss.hasPermi('system:htmlcss:remove')")
    @Log(title = "htmlcss", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkHtmlCssService.deleteBkHtmlCssByIds(ids));
    }
}
