package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证结果查询接口
 *
 * @author auto create
 * @since 1.0, 2025-11-21 17:27:41
 */
public class AlipayCommerceOperationCarservicesaastldcAuthenticationQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 2247673828217469318L;

	/**
	 * query请求返回的身份认证编号
	 */
	@ApiField("auth_no")
	private String authNo;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

}
