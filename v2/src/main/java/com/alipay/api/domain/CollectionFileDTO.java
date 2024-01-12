package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法催文件信息
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class CollectionFileDTO extends AlipayObject {

	private static final long serialVersionUID = 4375793743237887158L;

	/**
	 * 地址
	 */
	@ApiField("file_addr")
	private String fileAddr;

	/**
	 * 文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件是否需要保存
	 */
	@ApiField("file_should_save")
	private Boolean fileShouldSave;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 上传人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 文件类型
	 */
	@ApiField("prove_type")
	private String proveType;

	/**
	 * 来源系统
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 上传时间
	 */
	@ApiField("upload_time")
	private String uploadTime;

	public String getFileAddr() {
		return this.fileAddr;
	}
	public void setFileAddr(String fileAddr) {
		this.fileAddr = fileAddr;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Boolean getFileShouldSave() {
		return this.fileShouldSave;
	}
	public void setFileShouldSave(Boolean fileShouldSave) {
		this.fileShouldSave = fileShouldSave;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getProveType() {
		return this.proveType;
	}
	public void setProveType(String proveType) {
		this.proveType = proveType;
	}

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

}
