package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性度量衡单位
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:11:13
 */
public class MeasureUnitVO extends AlipayObject {

	private static final long serialVersionUID = 6636954269249963551L;

	/**
	 * 单位id，单位属性的属性值id
	 */
	@ApiField("unit_id")
	private String unitId;

	/**
	 * 度量衡单位名称
	 */
	@ApiField("unit_name")
	private String unitName;

	/**
	 * 属性单位名称
	 */
	@ApiField("unit_name_alias")
	private String unitNameAlias;

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return this.unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitNameAlias() {
		return this.unitNameAlias;
	}
	public void setUnitNameAlias(String unitNameAlias) {
		this.unitNameAlias = unitNameAlias;
	}

}
