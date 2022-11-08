package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否关注微信公众号接口
 *
 * @author auto create
 * @since 1.0, 2022-01-07 16:29:42
 */
public class AlipayInsSceneInspetprodSubscribeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5432571155929526891L;

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
	 * 用户识别标识加密字段
	 */
	@ApiField("encryption_mark_id")
	private String encryptionMarkId;

	/**
	 * 用户识别标识
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
