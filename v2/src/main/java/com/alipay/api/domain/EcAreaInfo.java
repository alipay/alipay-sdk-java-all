package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行政区划信息
 *
 * @author auto create
 * @since 1.0, 2023-08-01 14:55:47
 */
public class EcAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 7551324424596464992L;

	/**
	 * 行政编码
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 行政区划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父级行政编码
	 */
	@ApiField("parent_code")
	private String parentCode;

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

}
