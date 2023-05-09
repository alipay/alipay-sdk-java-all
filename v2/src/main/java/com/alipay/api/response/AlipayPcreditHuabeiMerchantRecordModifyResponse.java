package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.record.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:32:20
 */
public class AlipayPcreditHuabeiMerchantRecordModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7878695561465162971L;

	/** 
	 * 商户贴息活动ID
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
