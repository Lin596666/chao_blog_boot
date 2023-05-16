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
import com.ruoyi.system.domain.BkJavascript;
import com.ruoyi.system.service.IBkJavascriptService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * javascriptController
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/javascript")
public class BkJavascriptController extends BaseController
{
    @Autowired
    private IBkJavascriptService bkJavascriptService;

    /**
     * 查询javascript列表
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkJavascript bkJavascript)
    {
        startPage();
        List<BkJavascript> list = bkJavascriptService.selectBkJavascriptList(bkJavascript);
        return getDataTable(list);
    }

    /**
     * 导出javascript列表
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:export')")
    @Log(title = "javascript", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkJavascript bkJavascript)
    {
        List<BkJavascript> list = bkJavascriptService.selectBkJavascriptList(bkJavascript);
        ExcelUtil<BkJavascript> util = new ExcelUtil<BkJavascript>(BkJavascript.class);
        util.exportExcel(response, list, "javascript数据");
    }

    /**
     * 获取javascript详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkJavascriptService.selectBkJavascriptById(id));
    }

    /**
     * 新增javascript
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:add')")
    @Log(title = "javascript", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkJavascript bkJavascript)
    {
        return toAjax(bkJavascriptService.insertBkJavascript(bkJavascript));
    }

    /**
     * 修改javascript
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:edit')")
    @Log(title = "javascript", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkJavascript bkJavascript)
    {
        return toAjax(bkJavascriptService.updateBkJavascript(bkJavascript));
    }

    /**
     * 删除javascript
     */
    @PreAuthorize("@ss.hasPermi('system:javascript:remove')")
    @Log(title = "javascript", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkJavascriptService.deleteBkJavascriptByIds(ids));
    }
}
