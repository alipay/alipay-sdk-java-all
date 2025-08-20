package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服聊天机器人会话列表对象
 *
 * @author auto create
 * @since 1.0, 2025-02-24 21:54:06
 */
public class FcStarRobotSession extends AlipayObject {

	private static final long serialVersionUID = 4647755592859691712L;

	/**
	 * 会话结束时间戳（单位秒）
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 会话开始时间戳（单位秒）
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 会话id
	 */
	@ApiField("session_id")
	private String sessionId;

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
