package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.activity.pause response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 22:59:52
 */
public class AlipayPcreditHuabeiMerchantActivityPauseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833871347826566187L;

	/** 
	 * 商户活动ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/** 
	 * 外部请求号,用于幂等管理
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}
	public String getAggrId( ) {
		return this.aggrId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
