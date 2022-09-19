package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IlMapper;
import com.ruoyi.system.mapper.domain.Il;
import com.ruoyi.system.service.IIlService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2022-09-16
 */
@Service
public class IlServiceImpl implements IIlService
{
    @Autowired
    private IlMapper ilMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param ilId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Il selectIlByIlId(Long ilId)
    {
        return ilMapper.selectIlByIlId(ilId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param il 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Il> selectIlList(Il il)
    {
        return ilMapper.selectIlList(il);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param il 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertIl(Il il)
    {
        return ilMapper.insertIl(il);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param il 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateIl(Il il)
    {
        return ilMapper.updateIl(il);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ilIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIlByIlIds(Long[] ilIds)
    {
        return ilMapper.deleteIlByIlIds(ilIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param ilId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIlByIlId(Long ilId)
    {
        return ilMapper.deleteIlByIlId(ilId);
    }
}