package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.message.notify response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-27 20:40:21
 */
public class AlipayEbppInstserviceMessageNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5586997863439449646L;

	/** 
	 * 机构传入的手机号，户号，卡号等
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 通知结果状态，S/F 成功/失败
	 */
	@ApiField("status")
	private String status;

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
