package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报告内容发送
 *
 * @author auto create
 * @since 1.0, 2026-05-14 17:37:49
 */
public class AlipayCommerceMedicalReportContentSendModel extends AlipayObject {

	private static final long serialVersionUID = 6672461115427324123L;

	/**
	 * 报告内容。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 推送的报告内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 可选值 none(默认），time_bound_aes
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 报告id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
