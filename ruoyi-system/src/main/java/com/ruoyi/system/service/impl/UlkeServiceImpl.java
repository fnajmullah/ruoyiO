package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UlkeMapper;
import com.ruoyi.system.mapper.domain.Ulke;
import com.ruoyi.system.service.IUlkeService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2022-09-16
 */
@Service
public class UlkeServiceImpl implements IUlkeService
{
    @Autowired
    private UlkeMapper ulkeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param ulkeId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Ulke selectUlkeByUlkeId(Long ulkeId)
    {
        return ulkeMapper.selectUlkeByUlkeId(ulkeId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param ulke 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Ulke> selectUlkeList(Ulke ulke)
    {
        return ulkeMapper.selectUlkeList(ulke);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param ulke 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUlke(Ulke ulke)
    {
        return ulkeMapper.insertUlke(ulke);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param ulke 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUlke(Ulke ulke)
    {
        return ulkeMapper.updateUlke(ulke);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ulkeIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUlkeByUlkeIds(Long[] ulkeIds)
    {
        return ulkeMapper.deleteUlkeByUlkeIds(ulkeIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param ulkeId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUlkeByUlkeId(Long ulkeId)
    {
        return ulkeMapper.deleteUlkeByUlkeId(ulkeId);
    }
}