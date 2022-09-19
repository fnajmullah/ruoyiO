package com.ruoyi.system.mapper.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 ulke
 *
 * @author ruoyi
 * @date 2022-09-16
 */
public class Ulke extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long ulkeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    public void setUlkeId(Long ulkeId)
    {
        this.ulkeId = ulkeId;
    }

    public Long getUlkeId()
    {
        return ulkeId;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("ulkeId", getUlkeId())
                .append("name", getName())
                .toString();
    }
}