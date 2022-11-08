package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-24 16:11:54
 */
public class AlipayEbppIndustryJobContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2655321361511893435L;

	/** 
	 * 合同状态：签署中，已签署，已失效
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/** 
	 * 合同下载地址，注：有1小时的时效性
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 电子合同用户签署地址，企业已自动签署
	 */
	@ApiField("sign_url")
	private String signUrl;

	/** 
	 * 电子合同上链后存证hash值
	 */
	@ApiField("tx_hash")
	private String txHash;

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
	public String getContractStatus( ) {
		return this.contractStatus;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	public String getTxHash( ) {
		return this.txHash;
	}

}
