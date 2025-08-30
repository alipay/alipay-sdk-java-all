package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答热点资讯获取
 *
 * @author auto create
 * @since 1.0, 2024-07-02 17:56:59
 */
public class AlipayCloudCloudpromoAichatHotspotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4794648188527847132L;

	/**
	 * 客户唯一标识
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 问答服务的场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

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

}
