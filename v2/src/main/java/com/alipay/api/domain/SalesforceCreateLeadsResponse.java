package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建商机返回参数
 *
 * @author auto create
 * @since 1.0, 2026-10-10 11:47:59
 */
public class SalesforceCreateLeadsResponse extends AlipayObject {

	private static final long serialVersionUID = 5334347975195587489L;

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
