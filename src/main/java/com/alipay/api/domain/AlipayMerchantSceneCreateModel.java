package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建场景接口
 *
 * @author auto create
 * @since 1.0, 2022-04-06 11:01:42
 */
public class AlipayMerchantSceneCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7884883764984767444L;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 信用卡拓展场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
