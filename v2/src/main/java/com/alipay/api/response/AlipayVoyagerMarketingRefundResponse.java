package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5814187877783772271L;

	/** 
	 * 退款单号，三方用于对账
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
