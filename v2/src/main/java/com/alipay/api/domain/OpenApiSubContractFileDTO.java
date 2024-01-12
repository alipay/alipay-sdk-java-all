package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同磋商文件子合同文件DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-06 16:33:33
 */
public class OpenApiSubContractFileDTO extends AlipayObject {

	private static final long serialVersionUID = 3586416834145581267L;

	/**
	 * 附件文件名
	 */
	@ApiField("attachment_file_name")
	private String attachmentFileName;

	/**
	 * OSS参数
	 */
	@ApiField("attachment_path")
	private String attachmentPath;

	/**
	 * 文件http下载链接
	 */
	@ApiField("attachment_url")
	private String attachmentUrl;

	/**
	 * 定稿时间
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 定稿人
	 */
	@ApiField("confirmer")
	private OpenApiPersonSaDTO confirmer;

	/**
	 * 合同文件版本
	 */
	@ApiField("file_version")
	private String fileVersion;

	/**
	 * 子合同code
	 */
	@ApiField("sub_contract_code")
	private String subContractCode;

	/**
	 * 子合同名称
	 */
	@ApiField("sub_contract_name")
	private String subContractName;

	/**
	 * 子合同定稿状态
	 */
	@ApiField("sub_contract_status")
	private String subContractStatus;

	/**
	 * 提交人
	 */
	@ApiField("submitter")
	private OpenApiPersonSaDTO submitter;

	/**
	 * 上传时间
	 */
	@ApiField("up_load_time")
	private Date upLoadTime;

	public String getAttachmentFileName() {
		return this.attachmentFileName;
	}
	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
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

	public Date getConfirmDate() {
		return this.confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public OpenApiPersonSaDTO getConfirmer() {
		return this.confirmer;
	}
	public void setConfirmer(OpenApiPersonSaDTO confirmer) {
		this.confirmer = confirmer;
	}

	public String getFileVersion() {
		return this.fileVersion;
	}
	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	public String getSubContractCode() {
		return this.subContractCode;
	}
	public void setSubContractCode(String subContractCode) {
		this.subContractCode = subContractCode;
	}

	public String getSubContractName() {
		return this.subContractName;
	}
	public void setSubContractName(String subContractName) {
		this.subContractName = subContractName;
	}

	public String getSubContractStatus() {
		return this.subContractStatus;
	}
	public void setSubContractStatus(String subContractStatus) {
		this.subContractStatus = subContractStatus;
	}

	public OpenApiPersonSaDTO getSubmitter() {
		return this.submitter;
	}
	public void setSubmitter(OpenApiPersonSaDTO submitter) {
		this.submitter = submitter;
	}

	public Date getUpLoadTime() {
		return this.upLoadTime;
	}
	public void setUpLoadTime(Date upLoadTime) {
		this.upLoadTime = upLoadTime;
	}

}
