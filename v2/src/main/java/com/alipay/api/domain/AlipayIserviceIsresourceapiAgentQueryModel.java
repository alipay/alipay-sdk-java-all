package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字科技智能客服小二信息查询
 *
 * @author auto create
 * @since 1.0, 2026-05-08 16:51:24
 */
public class AlipayIserviceIsresourceapiAgentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2564732756727944848L;

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
