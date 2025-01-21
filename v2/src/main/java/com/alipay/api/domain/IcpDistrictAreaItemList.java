package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询地区列表
 *
 * @author auto create
 * @since 1.0, 2024-01-19 17:02:58
 */
public class IcpDistrictAreaItemList extends AlipayObject {

	private static final long serialVersionUID = 1725124572687398797L;

	/**
	 * 东城区
	 */
	@ApiField("code")
	private String code;

	/**
	 * 地区中文名称
	 */
	@ApiField("name")
	private String name;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
