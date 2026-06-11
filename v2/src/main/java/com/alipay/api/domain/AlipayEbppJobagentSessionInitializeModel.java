package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 晓叶对话初始化
 *
 * @author auto create
 * @since 1.0, 2026-06-08 16:42:54
 */
public class AlipayEbppJobagentSessionInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2848235861277966227L;

	/**
	 * 外部会话id
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 场景编码
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
