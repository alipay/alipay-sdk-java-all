package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板对象
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:49:19
 */
public class TemplateDTO extends AlipayObject {

	private static final long serialVersionUID = 2855145842688749172L;

	/**
	 * 模板描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 模板文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 模板文件地址，非完整地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 模板创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 模板修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * html格式模板文件地址
	 */
	@ApiField("html_file_url")
	private String htmlFileUrl;

	/**
	 * 模板id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 模板状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板名字
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
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

	public String getHtmlFileUrl() {
		return this.htmlFileUrl;
	}
	public void setHtmlFileUrl(String htmlFileUrl) {
		this.htmlFileUrl = htmlFileUrl;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
