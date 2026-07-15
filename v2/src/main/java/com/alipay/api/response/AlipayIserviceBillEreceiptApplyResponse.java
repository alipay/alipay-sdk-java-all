package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.bill.ereceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 12:32:55
 */
public class AlipayIserviceBillEreceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1429645859239635789L;

	/** 
	 * 错误码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误提示
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 回单文件ID。申请成功时返回，用于调用查询接口获取下载链接。
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 回单申请状态。SUCCESS：申请成功；FAIL：申请失败。
	 */
	@ApiField("status")
	private String status;

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
