package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大模型服务对外接口-会话关闭
 *
 * @author auto create
 * @since 1.0, 2024-02-26 16:56:15
 */
public class AlipayCommerceMedicalLargermodelSessionCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2498145521416754863L;

	/**
	 * 卫健委通用助理——WJWCOMASS
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 会话ID
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
