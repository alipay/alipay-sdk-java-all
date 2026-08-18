package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.invoice.download response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:48
 */
public class AlipayTradeSaasInvoiceDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8311267214921789484L;

	/** 
	 * 代理短期下载地址，默认 300 秒有效；不得持久化或长期复用
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 下载地址失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 下载文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件内容 SHA-256 十六进制摘要，供商户校验完整性
	 */
	@ApiField("file_sha_256")
	private String fileSha256;

	/** 
	 * 文件字节数
	 */
	@ApiField("file_size")
	private String fileSize;

	/** 
	 * 实际返回的文件类型：1=PDF、2=OFD、
	 */
	@ApiField("file_type")
	private String fileType;

	/** 
	 * SaaS 平台发票申请单号
	 */
	@ApiField("saas_invoice_order_no")
	private String saasInvoiceOrderNo;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setFileSha256(String fileSha256) {
		this.fileSha256 = fileSha256;
	}
	public String getFileSha256( ) {
		return this.fileSha256;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileSize( ) {
		return this.fileSize;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType( ) {
		return this.fileType;
	}

	public void setSaasInvoiceOrderNo(String saasInvoiceOrderNo) {
		this.saasInvoiceOrderNo = saasInvoiceOrderNo;
	}
	public String getSaasInvoiceOrderNo( ) {
		return this.saasInvoiceOrderNo;
	}

}
