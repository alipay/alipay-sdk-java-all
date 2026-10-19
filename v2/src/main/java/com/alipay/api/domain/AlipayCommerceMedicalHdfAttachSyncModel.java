package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫附件同步
 *
 * @author auto create
 * @since 1.0, 2026-10-14 16:32:59
 */
public class AlipayCommerceMedicalHdfAttachSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7182623915662172572L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 附件id，改调用点后不能指定附件id
	 */
	@ApiField("attachment_id")
	private Long attachmentId;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 是否格式化
	 */
	@ApiField("is_format")
	private Boolean isFormat;

	/**
	 * 媒体类型
	 */
	@ApiField("mime")
	private String mime;

	/**
	 * 所属id，userId等
	 */
	@ApiField("owner_id")
	private Long ownerId;

	/**
	 * 拥有者
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 关联id
	 */
	@ApiField("related_id")
	private Long relatedId;

	/**
	 * 关联类型
	 */
	@ApiField("related_type")
	private String relatedType;

	/**
	 * 文件大小单位为kb
	 */
	@ApiField("size")
	private String size;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public Long getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Boolean getIsFormat() {
		return this.isFormat;
	}
	public void setIsFormat(Boolean isFormat) {
		this.isFormat = isFormat;
	}

	public String getMime() {
		return this.mime;
	}
	public void setMime(String mime) {
		this.mime = mime;
	}

	public Long getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public Long getRelatedId() {
		return this.relatedId;
	}
	public void setRelatedId(Long relatedId) {
		this.relatedId = relatedId;
	}

	public String getRelatedType() {
		return this.relatedType;
	}
	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
