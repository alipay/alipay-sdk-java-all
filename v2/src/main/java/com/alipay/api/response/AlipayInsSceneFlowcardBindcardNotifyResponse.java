package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.flowcard.bindcard.notify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 18:08:00
 */
public class AlipayInsSceneFlowcardBindcardNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8469937366863923167L;

	/** 
	 * 申请单号
	 */
	@ApiField("ant_ser_apply_no")
	private String antSerApplyNo;

	public void setAntSerApplyNo(String antSerApplyNo) {
		this.antSerApplyNo = antSerApplyNo;
	}
	public String getAntSerApplyNo( ) {
		return this.antSerApplyNo;
	}

}
