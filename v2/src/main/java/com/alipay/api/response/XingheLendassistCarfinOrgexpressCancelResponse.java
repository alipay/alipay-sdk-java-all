package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.orgexpress.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 13:52:55
 */
public class XingheLendassistCarfinOrgexpressCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2248332733648479233L;

	/** 
	 * 取消失败原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 取消成功：1
取消失败：2
	 */
	@ApiField("status")
	private String status;

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
