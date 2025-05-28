package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.wufufuka.aliyun.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:45:50
 */
public class AlipayUserWufufukaAliyunExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4486441813276773497L;

	/** 
	 * 是否需要回退+否+业务方判断是否回退+true/false+支付宝判断+失败情况判断
	 */
	@ApiField("refund_flag")
	private Boolean refundFlag;

	public void setRefundFlag(Boolean refundFlag) {
		this.refundFlag = refundFlag;
	}
	public Boolean getRefundFlag( ) {
		return this.refundFlag;
	}

}
