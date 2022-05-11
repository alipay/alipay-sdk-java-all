package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查看antest云测用例列表
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:37
 */
public class AlipayCommerceAntestCaselistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2494639623538542434L;

	/**
	 * appId
	 */
	@ApiField("app_code")
	private String appCode;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

}
