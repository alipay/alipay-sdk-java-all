package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:52
 */
public class AlipayInsSceneClaimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283121562255564217L;

	/** 
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/** 
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商户生成的理赔请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}
	public String getClaimReportNo( ) {
		return this.claimReportNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
