package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 豆沙包信息
 *
 * @author auto create
 * @since 1.0, 2023-07-17 11:26:52
 */
public class Dowsure extends AlipayObject {

	private static final long serialVersionUID = 1136247469685591952L;

	/**
	 * 豆沙包卖家申请单编号
	 */
	@ApiField("application_code")
	private String applicationCode;

	public String getApplicationCode() {
		return this.applicationCode;
	}
	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

}
