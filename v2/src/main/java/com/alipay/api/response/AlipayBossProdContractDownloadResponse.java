package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.download response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:15:50
 */
public class AlipayBossProdContractDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5134476853444784466L;

	/** 
	 * 请求单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 文件的下载地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 请求处理结果code 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 接口操作描述(失败原因等)
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 接口执行结果 true 成功 false 失败
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setResultSuccess(Boolean resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public Boolean getResultSuccess( ) {
		return this.resultSuccess;
	}

}
