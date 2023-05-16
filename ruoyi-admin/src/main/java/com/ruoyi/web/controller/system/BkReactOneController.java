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
import com.ruoyi.system.domain.BkReactOne;
import com.ruoyi.system.service.IBkReactOneService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * bkreactoneController
 * 
 * @author ruoyi
 * @date 2023-05-15
 */
@RestController
@RequestMapping("/system/one")
public class BkReactOneController extends BaseController
{
    @Autowired
    private IBkReactOneService bkReactOneService;

    /**
     * 查询bkreactone列表
     */
    @PreAuthorize("@ss.hasPermi('system:one:list')")
    @GetMapping("/list")
    public TableDataInfo list(BkReactOne bkReactOne)
    {
        startPage();
        List<BkReactOne> list = bkReactOneService.selectBkReactOneList(bkReactOne);
        return getDataTable(list);
    }

    /**
     * 导出bkreactone列表
     */
    @PreAuthorize("@ss.hasPermi('system:one:export')")
    @Log(title = "bkreactone", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BkReactOne bkReactOne)
    {
        List<BkReactOne> list = bkReactOneService.selectBkReactOneList(bkReactOne);
        ExcelUtil<BkReactOne> util = new ExcelUtil<BkReactOne>(BkReactOne.class);
        util.exportExcel(response, list, "bkreactone数据");
    }

    /**
     * 获取bkreactone详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:one:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(bkReactOneService.selectBkReactOneById(id));
    }

    /**
     * 新增bkreactone
     */
    @PreAuthorize("@ss.hasPermi('system:one:add')")
    @Log(title = "bkreactone", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BkReactOne bkReactOne)
    {
        return toAjax(bkReactOneService.insertBkReactOne(bkReactOne));
    }

    /**
     * 修改bkreactone
     */
    @PreAuthorize("@ss.hasPermi('system:one:edit')")
    @Log(title = "bkreactone", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BkReactOne bkReactOne)
    {
        return toAjax(bkReactOneService.updateBkReactOne(bkReactOne));
    }

    /**
     * 删除bkreactone
     */
    @PreAuthorize("@ss.hasPermi('system:one:remove')")
    @Log(title = "bkreactone", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(bkReactOneService.deleteBkReactOneByIds(ids));
    }
}
