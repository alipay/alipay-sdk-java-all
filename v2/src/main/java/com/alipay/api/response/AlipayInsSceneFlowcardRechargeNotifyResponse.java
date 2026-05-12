package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.flowcard.recharge.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-25 14:47:44
 */
public class AlipayInsSceneFlowcardRechargeNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8336331978898237873L;

	/** 
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 流量卡iccid
	 */
	@ApiField("iccid")
	private String iccid;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getIccid( ) {
		return this.iccid;
	}

}
