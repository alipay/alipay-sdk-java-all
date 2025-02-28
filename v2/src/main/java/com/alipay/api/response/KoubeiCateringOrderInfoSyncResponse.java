package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCateringOrderInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8828373231798563747L;

	/** 
	 * json结构化对象，部分退款场景：refund_amount=入参请求的退款金额，out_refund_no=入参请求的外部退款单号，buyer_real_amount=买家实际退金额，refund_real_amount=商家实际退款金额。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 是否需要重试，true-需要，false-不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
