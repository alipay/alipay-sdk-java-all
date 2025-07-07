package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.register.cancelorder.notify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-04 19:02:32
 */
public class AlipayCommerceMedicalRegisterCancelorderNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7384862667567931386L;

	/** 
	 * 取消完成
	 */
	@ApiField("cancel_msg")
	private String cancelMsg;

	public void setCancelMsg(String cancelMsg) {
		this.cancelMsg = cancelMsg;
	}
	public String getCancelMsg( ) {
		return this.cancelMsg;
	}

}
