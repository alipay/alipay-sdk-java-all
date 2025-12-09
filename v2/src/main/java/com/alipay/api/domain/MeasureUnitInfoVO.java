package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 属性度量衡单位信息
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:11:13
 */
public class MeasureUnitInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6276729792171222228L;

	/**
	 * 度量衡单位的模板id
	 */
	@ApiField("module_id")
	private String moduleId;

	/**
	 * 度量衡单位列表
	 */
	@ApiListField("units")
	@ApiField("measure_unit_v_o")
	private List<MeasureUnitVO> units;

	public String getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public List<MeasureUnitVO> getUnits() {
		return this.units;
	}
	public void setUnits(List<MeasureUnitVO> units) {
		this.units = units;
	}

}
