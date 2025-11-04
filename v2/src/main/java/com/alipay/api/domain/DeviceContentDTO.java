package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class DeviceContentDTO extends AlipayObject {

	private static final long serialVersionUID = 6339929174249361311L;

	/**
	 * 支付宝内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 内容物抓取时间,格式
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("content_time")
	private Date contentTime;

	/**
	 * 内容格式：PIC
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 上传时间
yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("content_upload_time")
	private Date contentUploadTime;

	/**
	 * null
	 */
	@ApiListField("detect_results")
	@ApiField("detect_result")
	private List<DetectResult> detectResults;

	/**
	 * 内容访问Url
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 外部内容唯一ID
	 */
	@ApiField("out_content_id")
	private String outContentId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Date getContentTime() {
		return this.contentTime;
	}
	public void setContentTime(Date contentTime) {
		this.contentTime = contentTime;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getContentUploadTime() {
		return this.contentUploadTime;
	}
	public void setContentUploadTime(Date contentUploadTime) {
		this.contentUploadTime = contentUploadTime;
	}

	public List<DetectResult> getDetectResults() {
		return this.detectResults;
	}
	public void setDetectResults(List<DetectResult> detectResults) {
		this.detectResults = detectResults;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

}
