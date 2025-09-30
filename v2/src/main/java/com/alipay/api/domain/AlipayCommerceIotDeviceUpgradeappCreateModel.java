package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 为设备的应用创建升级任务
 *
 * @author auto create
 * @since 1.0, 2024-11-26 10:25:50
 */
public class AlipayCommerceIotDeviceUpgradeappCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3243457788953156337L;

	/**
	 * 用户问题排查是的问题记录
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 设备的标示
	 */
	@ApiListField("sn")
	@ApiField("string")
	private List<String> sn;

	/**
	 * 目标应用的唯一标示
	 */
	@ApiField("target_app_id")
	private String targetAppId;

	/**
	 * 应用需要升级到的目标版本
	 */
	@ApiField("target_app_version")
	private String targetAppVersion;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getSn() {
		return this.sn;
	}
	public void setSn(List<String> sn) {
		this.sn = sn;
	}

	public String getTargetAppId() {
		return this.targetAppId;
	}
	public void setTargetAppId(String targetAppId) {
		this.targetAppId = targetAppId;
	}

	public String getTargetAppVersion() {
		return this.targetAppVersion;
	}
	public void setTargetAppVersion(String targetAppVersion) {
		this.targetAppVersion = targetAppVersion;
	}

}
