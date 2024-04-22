package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ContractSignRsp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.contract.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:28
 */
public class AlipayEbppIndustryJobContractCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2516661848411225775L;

	/** 
	 * 电子合同签署信息返回结果，如果是自动签署场景下无返回内容，可通过查询接口(alipay.ebpp.industry.job.contract.query) 获取签署内容
	 */
	@ApiListField("sign_rsp_list")
	@ApiField("contract_sign_rsp")
	private List<ContractSignRsp> signRspList;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSignRspList(List<ContractSignRsp> signRspList) {
		this.signRspList = signRspList;
	}
	public List<ContractSignRsp> getSignRspList( ) {
		return this.signRspList;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
