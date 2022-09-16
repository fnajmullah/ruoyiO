package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 il
 *
 * @author ruoyi
 * @date 2022-09-16
 */
public class Il extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long ilId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ulkeId;

    public void setIlId(Long ilId)
    {
        this.ilId = ilId;
    }

    public Long getIlId()
    {
        return ilId;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setUlkeId(Long ulkeId)
    {
        this.ulkeId = ulkeId;
    }

    public Long getUlkeId()
    {
        return ulkeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("ilId", getIlId())
                .append("name", getName())
                .append("ulkeId", getUlkeId())
                .toString();
    }
}