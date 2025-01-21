package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子签约文件表参数
 *
 * @author auto create
 * @since 1.0, 2022-12-07 14:05:28
 */
public class AesElecSignFileDO extends AlipayObject {

	private static final long serialVersionUID = 4596287472593194866L;

	/**
	 * 文件id，唯一关联签约人组件信息
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件oss存储key，存储法务中台oss
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型：签约文件SIGNING/非签约文件NOSIGNING
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 关联审批流程节点id
	 */
	@ApiField("related_process_id")
	private Long relatedProcessId;

	/**
	 * 签约任务流水号
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getRelatedProcessId() {
		return this.relatedProcessId;
	}
	public void setRelatedProcessId(Long relatedProcessId) {
		this.relatedProcessId = relatedProcessId;
	}

	public String getSignTaskId() {
		return this.signTaskId;
	}
	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}

}
