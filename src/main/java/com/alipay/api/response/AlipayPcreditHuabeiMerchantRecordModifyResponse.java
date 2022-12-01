package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.record.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 15:01:43
 */
public class AlipayPcreditHuabeiMerchantRecordModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5695565226623339823L;

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
