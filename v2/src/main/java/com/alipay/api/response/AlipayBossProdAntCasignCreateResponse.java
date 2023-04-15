package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAntSignResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.ant.casign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:35:51
 */
public class AlipayBossProdAntCasignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2189534869122566324L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 签约流程id
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/** 
	 * 用印子任务受理流水
	 */
	@ApiField("sub_ant_sign_result_list")
	private SubAntSignResult subAntSignResultList;

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

	public void setSubAntSignResultList(SubAntSignResult subAntSignResultList) {
		this.subAntSignResultList = subAntSignResultList;
	}
	public SubAntSignResult getSubAntSignResultList( ) {
		return this.subAntSignResultList;
	}

}
