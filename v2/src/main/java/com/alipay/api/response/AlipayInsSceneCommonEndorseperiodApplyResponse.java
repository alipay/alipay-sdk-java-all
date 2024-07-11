package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.endorseperiod.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-29 11:57:03
 */
public class AlipayInsSceneCommonEndorseperiodApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1397431542715636269L;

	/** 
	 * 批单号
	 */
	@ApiField("endorse_no")
	private String endorseNo;

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	public String getEndorseNo( ) {
		return this.endorseNo;
	}

}
