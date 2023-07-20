package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字形象查询接口
 *
 * @author auto create
 * @since 1.0, 2023-06-07 22:55:17
 */
public class AlipayUserAccountZavatarAvatarQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8453151662474587211L;

	/**
	 * 数字人形象的版本参数
	 */
	@ApiField("avatar_app_version")
	private String avatarAppVersion;

	/**
	 * 设备等级
	 */
	@ApiField("device_level")
	private String deviceLevel;

	/**
	 * 场景节点，联系数字人平台分配
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 调用方的场景信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAvatarAppVersion() {
		return this.avatarAppVersion;
	}
	public void setAvatarAppVersion(String avatarAppVersion) {
		this.avatarAppVersion = avatarAppVersion;
	}

	public String getDeviceLevel() {
		return this.deviceLevel;
	}
	public void setDeviceLevel(String deviceLevel) {
		this.deviceLevel = deviceLevel;
	}

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
