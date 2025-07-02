package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.sign.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 10:52:27
 */
public class AlipayFincoreComplianceSignStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3674552866242197289L;

	/** 
	 * 用印归档文件下载地址，有效期12小时
	 */
	@ApiField("archived_file_http_url")
	private String archivedFileHttpUrl;

	/** 
	 * 业务单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 备注
	 */
	@ApiField("comment")
	private String comment;

	/** 
	 * 用印状态
	 */
	@ApiField("status")
	private String status;

	public void setArchivedFileHttpUrl(String archivedFileHttpUrl) {
		this.archivedFileHttpUrl = archivedFileHttpUrl;
	}
	public String getArchivedFileHttpUrl( ) {
		return this.archivedFileHttpUrl;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getComment( ) {
		return this.comment;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
