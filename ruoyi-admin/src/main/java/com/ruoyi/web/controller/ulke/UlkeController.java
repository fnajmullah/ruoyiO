package com.ruoyi.web.controller.ulke;

import java.util.List;
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
import com.ruoyi.system.domain.Ulke;
import com.ruoyi.system.service.IUlkeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2022-09-16
 */
@RestController
@RequestMapping("/system/ulke")
public class UlkeController extends BaseController
{
    @Autowired
    private IUlkeService ulkeService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ulke ulke)
    {
        startPage();
        List<Ulke> list = ulkeService.selectUlkeList(ulke);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Ulke ulke)
    {
        List<Ulke> list = ulkeService.selectUlkeList(ulke);
        ExcelUtil<Ulke> util = new ExcelUtil<Ulke>(Ulke.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:query')")
    @GetMapping(value = "/{ulkeId}")
    public AjaxResult getInfo(@PathVariable("ulkeId") Long ulkeId)
    {
        return AjaxResult.success(ulkeService.selectUlkeByUlkeId(ulkeId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ulke ulke)
    {
        return toAjax(ulkeService.insertUlke(ulke));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ulke ulke)
    {
        return toAjax(ulkeService.updateUlke(ulke));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:ulke:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ulkeIds}")
    public AjaxResult remove(@PathVariable Long[] ulkeIds)
    {
        return toAjax(ulkeService.deleteUlkeByUlkeIds(ulkeIds));
    }
}