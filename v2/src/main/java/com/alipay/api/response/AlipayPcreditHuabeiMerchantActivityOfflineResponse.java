package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.activity.offline response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:02:21
 */
public class AlipayPcreditHuabeiMerchantActivityOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 7243157683961866698L;

	/** 
	 * 商户活动ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/** 
	 * 外部请求号
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
