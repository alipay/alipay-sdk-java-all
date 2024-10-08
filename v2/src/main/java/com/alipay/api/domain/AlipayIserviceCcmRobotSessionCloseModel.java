package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭机器人会话
 *
 * @author auto create
 * @since 1.0, 2024-02-27 16:14:28
 */
public class AlipayIserviceCcmRobotSessionCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4394231858484865516L;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
