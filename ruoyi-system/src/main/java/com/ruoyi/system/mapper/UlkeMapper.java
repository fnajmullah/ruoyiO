package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.mapper.domain.Ulke;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2022-09-16
 */
public interface UlkeMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param ulkeId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Ulke selectUlkeByUlkeId(Long ulkeId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param ulke 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Ulke> selectUlkeList(Ulke ulke);

    /**
     * 新增【请填写功能名称】
     *
     * @param ulke 【请填写功能名称】
     * @return 结果
     */
    public int insertUlke(Ulke ulke);

    /**
     * 修改【请填写功能名称】
     *
     * @param ulke 【请填写功能名称】
     * @return 结果
     */
    public int updateUlke(Ulke ulke);

    /**
     * 删除【请填写功能名称】
     *
     * @param ulkeId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUlkeByUlkeId(Long ulkeId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ulkeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUlkeByUlkeIds(Long[] ulkeIds);
}