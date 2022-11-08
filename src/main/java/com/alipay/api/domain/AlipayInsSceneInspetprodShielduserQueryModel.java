package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取脱敏用户识别标识
 *
 * @author auto create
 * @since 1.0, 2022-01-17 18:57:42
 */
public class AlipayInsSceneInspetprodShielduserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5887858834462831421L;

	/**
	 * 场景码-外部场景标识
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 渠道号
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * markid对应的加密字段，防止markid被篡改
	 */
	@ApiField("encryption_mark_id")
	private String encryptionMarkId;

	/**
	 * 用户识别标识，仅表示唯一编码，不具备业务逻辑和业务含义
	 */
	@ApiField("mark_id")
	private String markId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEncryptionMarkId() {
		return this.encryptionMarkId;
	}
	public void setEncryptionMarkId(String encryptionMarkId) {
		this.encryptionMarkId = encryptionMarkId;
	}

	public String getMarkId() {
		return this.markId;
	}
	public void setMarkId(String markId) {
		this.markId = markId;
	}

}
