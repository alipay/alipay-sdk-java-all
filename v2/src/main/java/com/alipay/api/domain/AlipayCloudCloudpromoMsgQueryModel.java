package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话消息查询
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:55:08
 */
public class AlipayCloudCloudpromoMsgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1453259941341714245L;

	/**
	 * 用户对应的openId
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 租房小程序模版id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 业务的小程序id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
