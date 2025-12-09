package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.businessid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-29 09:47:40
 */
public class AlipayBossProdContractBusinessidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1851152997291337119L;

	/** 
	 * 合同状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 业务id
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 合同编号
	 */
	@ApiField("contract_code")
	private String contractCode;

	/** 
	 * 合同名称
	 */
	@ApiField("contract_name")
	private String contractName;

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getContractCode( ) {
		return this.contractCode;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public String getContractName( ) {
		return this.contractName;
	}

}
