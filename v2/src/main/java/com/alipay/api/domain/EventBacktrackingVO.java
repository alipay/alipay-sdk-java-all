package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事件回溯,按照回溯内容事件升序排序
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class EventBacktrackingVO extends AlipayObject {

	private static final long serialVersionUID = 5885892884877826671L;

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
	 * 内容格式 
● PIC
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
	 * 检测结果：
● 有风险
● 无风险
	 */
	@ApiField("detect_result")
	private String detectResult;

	/**
	 * 检测状态：
● 检测中
● 检测完成
	 */
	@ApiField("detect_status")
	private String detectStatus;

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

	public String getDetectResult() {
		return this.detectResult;
	}
	public void setDetectResult(String detectResult) {
		this.detectResult = detectResult;
	}

	public String getDetectStatus() {
		return this.detectStatus;
	}
	public void setDetectStatus(String detectStatus) {
		this.detectStatus = detectStatus;
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
