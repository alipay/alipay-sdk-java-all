package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.live.itemplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:01:57
 */
public class AlipayMerchantLiveItemplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8437489927627578173L;

	/** 
	 * 针对操作结果的说明
	 */
	@ApiField("msg_info")
	private String msgInfo;

	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}
	public String getMsgInfo( ) {
		return this.msgInfo;
	}

}
