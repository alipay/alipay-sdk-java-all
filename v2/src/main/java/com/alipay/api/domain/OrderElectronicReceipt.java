package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子回单信息
 *
 * @author auto create
 * @since 1.0, 2026-04-16 15:31:21
 */
public class OrderElectronicReceipt extends AlipayObject {

	private static final long serialVersionUID = 4413231548136317336L;

	/**
	 * 下载链接。status为SUCCESS时返回。用户可以使用此http链接下载文件内容，电子回单文件为pdf格式。
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 状态为FAILED，可联系业务人员处理
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 处理状态 INIT - 初始化 PROCESSING - 处理中 SUCCESS - 成功 FAILED - 失败
	 */
	@ApiField("status")
	private String status;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
