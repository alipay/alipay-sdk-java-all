package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.file.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-23 15:20:25
 */
public class AlipayCommerceEducateFacefeatureFileApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1559526138197248293L;

	/** 
	 * 文件下载url
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 文件日期
	 */
	@ApiField("file_date")
	private String fileDate;

	/** 
	 * 机构ID+ISV名称+BIZ_CODE+日期+特征版本
	 */
	@ApiField("file_name")
	private String fileName;

	/** 
	 * 文件生成状态
	 */
	@ApiField("file_status")
	private String fileStatus;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}
	public String getFileDate( ) {
		return this.fileDate;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName( ) {
		return this.fileName;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public String getFileStatus( ) {
		return this.fileStatus;
	}

}
