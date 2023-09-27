package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台应用信息
 *
 * @author auto create
 * @since 1.0, 2023-09-13 15:15:10
 */
public class InsOpenApplicationInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2687387562452946183L;

	/**
	 * 应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用ID
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 应用类型
	 */
	@ApiField("application_type")
	private String applicationType;

	/**
	 * 商家ID
	 */
	@ApiField("pid")
	private String pid;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationType() {
		return this.applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
