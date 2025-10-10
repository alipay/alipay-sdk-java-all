package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板版本返回结果
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:48:00
 */
public class TemplateVersionDTO extends AlipayObject {

	private static final long serialVersionUID = 7711691922969513237L;

	/**
	 * 审批流地址
	 */
	@ApiField("approve_url")
	private String approveUrl;

	/**
	 * 模板版本描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 编辑地址
	 */
	@ApiField("edit_address")
	private String editAddress;

	/**
	 * doc格式模板文件地址
	 */
	@ApiField("file_address")
	private String fileAddress;

	/**
	 * 文件名字
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * html格式的模板文件地址
	 */
	@ApiField("html_file_address")
	private String htmlFileAddress;

	/**
	 * 版本id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * pdf文件地址
	 */
	@ApiField("pdf_address")
	private String pdfAddress;

	/**
	 * pdf格式完整预览链接
	 */
	@ApiField("pdf_presigned_url")
	private String pdfPresignedUrl;

	/**
	 * 预览地址
	 */
	@ApiField("preview_address")
	private String previewAddress;

	/**
	 * 完整预览地址
	 */
	@ApiField("preview_presigned_url")
	private String previewPresignedUrl;

	/**
	 * 该版本发布时间
	 */
	@ApiField("publish_time")
	private Date publishTime;

	/**
	 * 模板版本状态，有以下取值
DRAFT,IN_APPROVAL,PUBLISHING,PRE,PUBLISH_FAILED,PUBLISHED,OFFLINE
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	/**
	 * 模板名字
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	/**
	 * 唯一流水号
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getApproveUrl() {
		return this.approveUrl;
	}
	public void setApproveUrl(String approveUrl) {
		this.approveUrl = approveUrl;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEditAddress() {
		return this.editAddress;
	}
	public void setEditAddress(String editAddress) {
		this.editAddress = editAddress;
	}

	public String getFileAddress() {
		return this.fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public String getHtmlFileAddress() {
		return this.htmlFileAddress;
	}
	public void setHtmlFileAddress(String htmlFileAddress) {
		this.htmlFileAddress = htmlFileAddress;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPdfAddress() {
		return this.pdfAddress;
	}
	public void setPdfAddress(String pdfAddress) {
		this.pdfAddress = pdfAddress;
	}

	public String getPdfPresignedUrl() {
		return this.pdfPresignedUrl;
	}
	public void setPdfPresignedUrl(String pdfPresignedUrl) {
		this.pdfPresignedUrl = pdfPresignedUrl;
	}

	public String getPreviewAddress() {
		return this.previewAddress;
	}
	public void setPreviewAddress(String previewAddress) {
		this.previewAddress = previewAddress;
	}

	public String getPreviewPresignedUrl() {
		return this.previewPresignedUrl;
	}
	public void setPreviewPresignedUrl(String previewPresignedUrl) {
		this.previewPresignedUrl = previewPresignedUrl;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
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

	public String getTemplateLibCode() {
		return this.templateLibCode;
	}
	public void setTemplateLibCode(String templateLibCode) {
		this.templateLibCode = templateLibCode;
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

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
