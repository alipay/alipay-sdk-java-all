package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.esignresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 16:34:52
 */
public class AlipayBossProdAntlescenterEsignresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3418849451498793771L;

	/** 
	 * 系统来源名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 业务唯一流水id
	 */
	@ApiField("business_unique_id")
	private String businessUniqueId;

	/** 
	 * 用印数字加签完成文件的下载地址
	 */
	@ApiField("oss_file_addr")
	private String ossFileAddr;

	/** 
	 * 发起电子签署成功返回的流水id
	 */
	@ApiField("seal_request_id")
	private String sealRequestId;

	/** 
	 * 业务用印处理状态
	 */
	@ApiField("status")
	private String status;

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setBusinessUniqueId(String businessUniqueId) {
		this.businessUniqueId = businessUniqueId;
	}
	public String getBusinessUniqueId( ) {
		return this.businessUniqueId;
	}

	public void setOssFileAddr(String ossFileAddr) {
		this.ossFileAddr = ossFileAddr;
	}
	public String getOssFileAddr( ) {
		return this.ossFileAddr;
	}

	public void setSealRequestId(String sealRequestId) {
		this.sealRequestId = sealRequestId;
	}
	public String getSealRequestId( ) {
		return this.sealRequestId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
