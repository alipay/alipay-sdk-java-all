package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.canteen.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-02 14:47:25
 */
public class AlipayOpenSpCanteenOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2573877449995155287L;

	/** 
	 * 用于描述用户是否已经开通功能，如果没有开通，则需要跳转到签约页面，否则进入服务商小程序
	 */
	@ApiField("open_status")
	private String openStatus;

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}
	public String getOpenStatus( ) {
		return this.openStatus;
	}

}
