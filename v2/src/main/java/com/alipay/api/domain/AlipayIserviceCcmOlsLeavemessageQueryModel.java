package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客服消息未读信息
 *
 * @author auto create
 * @since 1.0, 2023-07-28 18:20:18
 */
public class AlipayIserviceCcmOlsLeavemessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8276791654528861974L;

	/**
	 * 聊天窗code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 访客id
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}
