package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技智能客服小二信息查询
 *
 * @author auto create
 * @since 1.0, 2026-05-15 14:52:12
 */
public class AlipayIserviceIsresourceapiAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6354927885957739937L;

	/**
	 * 用于查询小二的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
