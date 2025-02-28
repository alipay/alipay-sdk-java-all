package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.version.audit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-27 15:02:26
 */
public class AlipayOpenMiniVersionAuditApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6836354556922787345L;

	/** 
	 * 是否加速审核
加速：true；
不加速：false
	 */
	@ApiField("speed_up")
	private String speedUp;

	/** 
	 * 提审加速审核说明
	 */
	@ApiField("speed_up_memo")
	private String speedUpMemo;

	public void setSpeedUp(String speedUp) {
		this.speedUp = speedUp;
	}
	public String getSpeedUp( ) {
		return this.speedUp;
	}

	public void setSpeedUpMemo(String speedUpMemo) {
		this.speedUpMemo = speedUpMemo;
	}
	public String getSpeedUpMemo( ) {
		return this.speedUpMemo;
	}

}
