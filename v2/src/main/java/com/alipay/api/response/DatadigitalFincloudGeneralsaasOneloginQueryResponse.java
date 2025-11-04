package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onelogin.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:55
 */
public class DatadigitalFincloudGeneralsaasOneloginQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1439368987611357833L;

	/** 
	 * 手机号码
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 一键登录状态。PROCESSING：初始化；SUCCESS：取号成功（返回手机号）；FAIL：取号失败。
	 */
	@ApiField("status")
	private String status;

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
