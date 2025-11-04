package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门禁视频配置 enableMonitorRoom=true必填
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class VisitorConfigQueryVO extends AlipayObject {

	private static final long serialVersionUID = 5197761276938645672L;

	/**
	 * 开门配置
	 */
	@ApiField("entrance_open_config")
	private String entranceOpenConfig;

	/**
	 * 开门调用类型 API|SPI
	 */
	@ApiField("entrance_open_type")
	private String entranceOpenType;

	/**
	 * 是否需要用户授权 true|false
	 */
	@ApiField("need_owner_check")
	private Boolean needOwnerCheck;

	/**
	 * 鉴权配置
	 */
	@ApiField("owner_check_config")
	private String ownerCheckConfig;

	/**
	 * 鉴权调用类型 API|SPI
	 */
	@ApiField("owner_check_type")
	private String ownerCheckType;

	/**
	 * 是否支持自动开门 true|false
	 */
	@ApiField("support_open")
	private Boolean supportOpen;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getEntranceOpenConfig() {
		return this.entranceOpenConfig;
	}
	public void setEntranceOpenConfig(String entranceOpenConfig) {
		this.entranceOpenConfig = entranceOpenConfig;
	}

	public String getEntranceOpenType() {
		return this.entranceOpenType;
	}
	public void setEntranceOpenType(String entranceOpenType) {
		this.entranceOpenType = entranceOpenType;
	}

	public Boolean getNeedOwnerCheck() {
		return this.needOwnerCheck;
	}
	public void setNeedOwnerCheck(Boolean needOwnerCheck) {
		this.needOwnerCheck = needOwnerCheck;
	}

	public String getOwnerCheckConfig() {
		return this.ownerCheckConfig;
	}
	public void setOwnerCheckConfig(String ownerCheckConfig) {
		this.ownerCheckConfig = ownerCheckConfig;
	}

	public String getOwnerCheckType() {
		return this.ownerCheckType;
	}
	public void setOwnerCheckType(String ownerCheckType) {
		this.ownerCheckType = ownerCheckType;
	}

	public Boolean getSupportOpen() {
		return this.supportOpen;
	}
	public void setSupportOpen(Boolean supportOpen) {
		this.supportOpen = supportOpen;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
