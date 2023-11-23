package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.payinst.equity.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 21:26:46
 */
public class AnttechMorseMarketingPayinstEquitySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6528922164566278197L;

	/** 
	 * 蚂蚁侧返回的唯一标识
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 发放成功后生成的发放凭证号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/** 
	 * 是否发放成功
	 */
	@ApiField("send_success")
	private Boolean sendSuccess;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}
	public String getSendOrderId( ) {
		return this.sendOrderId;
	}

	public void setSendSuccess(Boolean sendSuccess) {
		this.sendSuccess = sendSuccess;
	}
	public Boolean getSendSuccess( ) {
		return this.sendSuccess;
	}

}
