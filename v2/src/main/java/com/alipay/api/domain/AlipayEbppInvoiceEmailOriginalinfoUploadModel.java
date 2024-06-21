package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传原始发票邮件内容
 *
 * @author auto create
 * @since 1.0, 2024-03-26 21:29:16
 */
public class AlipayEbppInvoiceEmailOriginalinfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2886927523174515411L;

	/**
	 * 用户邮箱地址
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * 邮件头
	 */
	@ApiField("email_header")
	private String emailHeader;

	/**
	 * 邮件主题
	 */
	@ApiField("email_subject")
	private String emailSubject;

	/**
	 * 邮件eml文件下载地址
	 */
	@ApiField("eml_file_download_url")
	private String emlFileDownloadUrl;

	/**
	 * 外部邮件ID
	 */
	@ApiField("out_email_id")
	private String outEmailId;

	/**
	 * 邮件解析失败原因，解析失败且有明确失败原因时可回传
	 */
	@ApiField("parse_fail_reason")
	private String parseFailReason;

	/**
	 * 解析结果
	 */
	@ApiField("parse_tag")
	private String parseTag;

	/**
	 * 邮件收取时间
	 */
	@ApiField("receive_date")
	private Date receiveDate;

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailHeader() {
		return this.emailHeader;
	}
	public void setEmailHeader(String emailHeader) {
		this.emailHeader = emailHeader;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmlFileDownloadUrl() {
		return this.emlFileDownloadUrl;
	}
	public void setEmlFileDownloadUrl(String emlFileDownloadUrl) {
		this.emlFileDownloadUrl = emlFileDownloadUrl;
	}

	public String getOutEmailId() {
		return this.outEmailId;
	}
	public void setOutEmailId(String outEmailId) {
		this.outEmailId = outEmailId;
	}

	public String getParseFailReason() {
		return this.parseFailReason;
	}
	public void setParseFailReason(String parseFailReason) {
		this.parseFailReason = parseFailReason;
	}

	public String getParseTag() {
		return this.parseTag;
	}
	public void setParseTag(String parseTag) {
		this.parseTag = parseTag;
	}

	public Date getReceiveDate() {
		return this.receiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

}
