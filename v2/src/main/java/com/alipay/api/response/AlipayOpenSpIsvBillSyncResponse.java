package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.isv.bill.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 10:56:59
 */
public class AlipayOpenSpIsvBillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3463275985287559344L;

	/** 
	 * 返回true或者flase，ture代表账单回传成功，false表示账单回传失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
