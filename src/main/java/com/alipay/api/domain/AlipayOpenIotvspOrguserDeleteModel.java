package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot核身聚合平台的机构人员删除接口
 *
 * @author auto create
 * @since 1.0, 2022-01-27 20:44:25
 */
public class AlipayOpenIotvspOrguserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7453161985499423971L;

	/**
	 * 签约主体外标id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 签约主体类型，1机构2机构集
	 */
	@ApiField("entity_type")
	private Long entityType;

	/**
	 * 人脸id
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * isv的appId
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * isv的英文名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * isv的pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Long getEntityType() {
		return this.entityType;
	}
	public void setEntityType(Long entityType) {
		this.entityType = entityType;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

}
