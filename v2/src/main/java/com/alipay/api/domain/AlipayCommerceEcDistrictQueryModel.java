package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行政区划查询
 *
 * @author auto create
 * @since 1.0, 2023-04-23 10:55:00
 */
public class AlipayCommerceEcDistrictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5213498513346281191L;

	/**
	 * 行政区划等级
	 */
	@ApiField("area_level")
	private String areaLevel;

	/**
	 * 父级行政编码
	 */
	@ApiField("parent_code")
	private String parentCode;

	public String getAreaLevel() {
		return this.areaLevel;
	}
	public void setAreaLevel(String areaLevel) {
		this.areaLevel = areaLevel;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

}
