package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单上传电子合同
 *
 * @author auto create
 * @since 1.0, 2026-07-03 16:28:44
 */
public class RentMerchantUploadContractVO extends AlipayObject {

	private static final long serialVersionUID = 7513127986273567198L;

	/**
	 * 合同文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 合同文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 合同上传时间
	 */
	@ApiField("upload_time")
	private Date uploadTime;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

}
