package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 磋商事项附件DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:44:49
 */
public class OpenApiMatterAttachmentDTO extends AlipayObject {

	private static final long serialVersionUID = 1646688778522622623L;

	/**
	 * 事项附件编码
	 */
	@ApiField("attachment_code")
	private String attachmentCode;

	/**
	 * 附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * oss路径
	 */
	@ApiField("attachment_path")
	private String attachmentPath;

	/**
	 * 附件下载http链接
	 */
	@ApiField("attachment_url")
	private String attachmentUrl;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 事项编码
	 */
	@ApiField("matter_code")
	private String matterCode;

	public String getAttachmentCode() {
		return this.attachmentCode;
	}
	public void setAttachmentCode(String attachmentCode) {
		this.attachmentCode = attachmentCode;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMatterCode() {
		return this.matterCode;
	}
	public void setMatterCode(String matterCode) {
		this.matterCode = matterCode;
	}

}
