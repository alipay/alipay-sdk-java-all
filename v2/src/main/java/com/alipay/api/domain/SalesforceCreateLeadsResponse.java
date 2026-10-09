package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建商机返回参数
 *
 * @author auto create
 * @since 1.0, 2026-09-22 14:29:24
 */
public class SalesforceCreateLeadsResponse extends AlipayObject {

	private static final long serialVersionUID = 7867955415959325682L;

	/**
	 * 商机id
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
