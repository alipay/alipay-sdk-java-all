package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.service.available.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 14:27:28
 */
public class AlipayInsSceneServiceAvailableQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5544699948565466383L;

	/** 
	 * true 可用，false 不可用
	 */
	@ApiField("available_flag")
	private Boolean availableFlag;

	/** 
	 * 服务合约编号
	 */
	@ApiField("ser_contract_no")
	private String serContractNo;

	public void setAvailableFlag(Boolean availableFlag) {
		this.availableFlag = availableFlag;
	}
	public Boolean getAvailableFlag( ) {
		return this.availableFlag;
	}

	public void setSerContractNo(String serContractNo) {
		this.serContractNo = serContractNo;
	}
	public String getSerContractNo( ) {
		return this.serContractNo;
	}

}
