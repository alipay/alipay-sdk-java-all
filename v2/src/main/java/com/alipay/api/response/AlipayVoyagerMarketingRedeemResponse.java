package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.redeem response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:00
 */
public class AlipayVoyagerMarketingRedeemResponse extends AlipayResponse {

	private static final long serialVersionUID = 8516437297319814732L;

	/** 
	 * 核销单号，三方用于对账和后续退款
	 */
	@ApiField("redeem_order_id")
	private String redeemOrderId;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setRedeemOrderId(String redeemOrderId) {
		this.redeemOrderId = redeemOrderId;
	}
	public String getRedeemOrderId( ) {
		return this.redeemOrderId;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
