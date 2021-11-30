package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlaw.manualfile.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-04 15:24:11
 */
public class AlipayBossProdAntlawManualfileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6864595912162711483L;

	/** 
	 * 业务编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 智能撰写生成的合同ID,用于查询合同详情
	 */
	@ApiField("smart_contract_id")
	private String smartContractId;

	/** 
	 * 来源系统
	 */
	@ApiField("source_sys")
	private String sourceSys;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setSmartContractId(String smartContractId) {
		this.smartContractId = smartContractId;
	}
	public String getSmartContractId( ) {
		return this.smartContractId;
	}

	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}
	public String getSourceSys( ) {
		return this.sourceSys;
	}

}
