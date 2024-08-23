package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubAntSignResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.ant.casign.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-16 17:47:15
 */
public class AlipayBossProdAntCasignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1761486716823154661L;

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
	@ApiListField("sub_ant_sign_result_list")
	@ApiField("sub_ant_sign_result")
	private List<SubAntSignResult> subAntSignResultList;

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

	public void setSubAntSignResultList(List<SubAntSignResult> subAntSignResultList) {
		this.subAntSignResultList = subAntSignResultList;
	}
	public List<SubAntSignResult> getSubAntSignResultList( ) {
		return this.subAntSignResultList;
	}

}
