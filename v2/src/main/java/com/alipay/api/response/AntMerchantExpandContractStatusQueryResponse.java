package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.contract.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:17
 */
public class AntMerchantExpandContractStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568794941859936845L;

	/** 
	 * 签约状态结果补充说明，如：账户被冻结，无法签约
	 */
	@ApiField("sign_result_desc")
	private String signResultDesc;

	/** 
	 * 签约状态描述：   
 SIGNED 已签约
 SIGNING 签约中
 NEVER_SIGNED 未签约 
 SIGN_FAILED  签约失败
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignResultDesc(String signResultDesc) {
		this.signResultDesc = signResultDesc;
	}
	public String getSignResultDesc( ) {
		return this.signResultDesc;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
