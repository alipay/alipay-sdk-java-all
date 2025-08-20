package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.underwrite.mutual.policy.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class AlipayInsUnderwriteMutualPolicyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6294827344298574528L;

	/** 
	 * 宝贝计划ID
	 */
	@ApiField("plan_no")
	private String planNo;

	/** 
	 * 保单ID列表,json格式
	 */
	@ApiListField("policy_nos")
	@ApiField("string")
	private List<String> policyNos;

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}
	public String getPlanNo( ) {
		return this.planNo;
	}

	public void setPolicyNos(List<String> policyNos) {
		this.policyNos = policyNos;
	}
	public List<String> getPolicyNos( ) {
		return this.policyNos;
	}

}
