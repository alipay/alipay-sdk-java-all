package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 19:02:04
 */
public class AlipayMerchantSolutionBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4225411237698843256L;

	/** 
	 * 提报成功后，支付宝侧生成的提报批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 标识当前该批次的处理状态
	 */
	@ApiField("batch_status_code")
	private String batchStatusCode;

	/** 
	 * 当前批次处理状态的中文描述
	 */
	@ApiField("batch_status_desc")
	private String batchStatusDesc;

	/** 
	 * 使用文件下载链接下载文件时，需要在header中带上返回的token，设置为x-mass-token:${token}。为保证数据安全，不要对外泄露该字段。
	 */
	@ApiField("file_token")
	private String fileToken;

	/** 
	 * 批次提报结果文件的下载链接，需结合file_token字段一起使用。链接有效时间默认1小时，超时需重新获取。
	 */
	@ApiField("file_url")
	private String fileUrl;

	/** 
	 * 外部批次号，在外部系统中唯一标识一个提报批次
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchStatusCode(String batchStatusCode) {
		this.batchStatusCode = batchStatusCode;
	}
	public String getBatchStatusCode( ) {
		return this.batchStatusCode;
	}

	public void setBatchStatusDesc(String batchStatusDesc) {
		this.batchStatusDesc = batchStatusDesc;
	}
	public String getBatchStatusDesc( ) {
		return this.batchStatusDesc;
	}

	public void setFileToken(String fileToken) {
		this.fileToken = fileToken;
	}
	public String getFileToken( ) {
		return this.fileToken;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileUrl( ) {
		return this.fileUrl;
	}

	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}
	public String getOutBatchNo( ) {
		return this.outBatchNo;
	}

}
