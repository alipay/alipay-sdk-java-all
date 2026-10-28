package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PolicyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.hkpolicy.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-21 20:07:58
 */
public class AlipayCommerceMedicalInsuranceHkpolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2824358922617534654L;

	/** 
	 * null
	 */
	@ApiListField("policy_info_list")
	@ApiField("policy_info")
	private List<PolicyInfo> policyInfoList;

	public void setPolicyInfoList(List<PolicyInfo> policyInfoList) {
		this.policyInfoList = policyInfoList;
	}
	public List<PolicyInfo> getPolicyInfoList( ) {
		return this.policyInfoList;
	}

}
