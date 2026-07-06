package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.bill.ereceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 12:32:55
 */
public class AlipayIserviceBillEreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5539769193897784571L;

	/** 
	 * PDF下载链接。当 status=SUCCESS 时返回，链接含电子章，可直接下载。链接有效期为20s，过期需重新申请。
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 参数校验失败，fileId为空
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 回单生成失败
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 回单文件ID，与请求参数相同。
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 回单状态。INIT/PROCESSING/SUCCESS/FAIL
	 */
	@ApiField("status")
	private String status;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
