package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot核身聚合平台的单个机构的人脸库id查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-27 15:02:52
 */
public class AlipayOpenIotvspOrgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4669323586769975575L;

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
	 * isv的商户id
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
