package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntSignResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.healthca.applyantsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-09 15:02:43
 */
public class AlipayCommerceMedicalHealthcaApplyantsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5276898461311596451L;

	/** 
	 * null
	 */
	@ApiListField("ant_sign_result_list")
	@ApiField("ant_sign_result")
	private List<AntSignResult> antSignResultList;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用印流程受理流水号
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public void setAntSignResultList(List<AntSignResult> antSignResultList) {
		this.antSignResultList = antSignResultList;
	}
	public List<AntSignResult> getAntSignResultList( ) {
		return this.antSignResultList;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

}
