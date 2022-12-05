package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询antest挡板列表
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:47
 */
public class AlipayCommerceAntestMockgrouplistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7244851965391764995L;

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
