package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票文件模型
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:06:54
 */
public class InvoiceFileModel extends AlipayObject {

	private static final long serialVersionUID = 4611412372711165915L;

	/**
	 * 所属发票流水
	 */
	@ApiField("einv_id")
	private String einvId;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名字
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 发票文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件下载地址
	 */
	@ApiField("file_uri")
	private String fileUri;

	/**
	 * 资源id
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 文件访问方式
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getEinvId() {
		return this.einvId;
	}
	public void setEinvId(String einvId) {
		this.einvId = einvId;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUri() {
		return this.fileUri;
	}
	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
