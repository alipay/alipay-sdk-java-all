package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生僻字信息
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:19:57
 */
public class RareNameInfo extends AlipayObject {

	private static final long serialVersionUID = 2365241689318837518L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
