package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:40:53
 */
public class AlipayVoyagerMarketingUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3841783754884535626L;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	/** 
	 * 解冻单号,UNFREEZE20260813001
	 */
	@ApiField("unfreeze_order_id")
	private String unfreezeOrderId;

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

	public void setUnfreezeOrderId(String unfreezeOrderId) {
		this.unfreezeOrderId = unfreezeOrderId;
	}
	public String getUnfreezeOrderId( ) {
		return this.unfreezeOrderId;
	}

}
