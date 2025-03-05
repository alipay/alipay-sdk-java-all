package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云营销智能问答服务停止回答
 *
 * @author auto create
 * @since 1.0, 2024-07-29 19:14:46
 */
public class AlipayCloudCloudpromoAichatAnswerStopModel extends AlipayObject {

	private static final long serialVersionUID = 5731342737343763656L;

	/**
	 * 请求唯一标识，该字段由问答接口返回
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 该字段唯一标识一个问答机器人服务，并在向问答机器人注册服务时候生成给到客户端使用。
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
