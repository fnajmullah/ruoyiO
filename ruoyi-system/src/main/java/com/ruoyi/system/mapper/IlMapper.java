package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Il;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2022-09-16
 */
public interface IlMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param ilId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Il selectIlByIlId(Long ilId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param il 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Il> selectIlList(Il il);

    /**
     * 新增【请填写功能名称】
     *
     * @param il 【请填写功能名称】
     * @return 结果
     */
    public int insertIl(Il il);

    /**
     * 修改【请填写功能名称】
     *
     * @param il 【请填写功能名称】
     * @return 结果
     */
    public int updateIl(Il il);

    /**
     * 删除【请填写功能名称】
     *
     * @param ilId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIlByIlId(Long ilId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ilIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIlByIlIds(Long[] ilIds);
}