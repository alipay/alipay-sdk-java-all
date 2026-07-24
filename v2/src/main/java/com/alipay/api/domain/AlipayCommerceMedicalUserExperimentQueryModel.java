package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户实验分流查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:02:48
 */
public class AlipayCommerceMedicalUserExperimentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2219158266282577959L;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
