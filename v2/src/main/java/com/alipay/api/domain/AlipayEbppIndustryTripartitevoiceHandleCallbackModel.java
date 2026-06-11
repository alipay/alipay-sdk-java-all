package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一网通办客诉处理结果推进
 *
 * @author auto create
 * @since 1.0, 2026-05-29 10:47:50
 */
public class AlipayEbppIndustryTripartitevoiceHandleCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4132728996197952441L;

	/**
	 * 机构处理完成时间，yyyy-MM-dd HH:mm:ss；不能早于该客诉的gmtCreate
	 */
	@ApiField("handle_time")
	private String handleTime;

	/**
	 * 处理说明；当 status=OTHER 时必填；其他情况可选；最大 500 字符
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 处理结论
	 */
	@ApiField("status")
	private String status;

	/**
	 * 客诉记录 ID（来自接口 A 返回）
	 */
	@ApiField("voice_id")
	private String voiceId;

	public String getHandleTime() {
		return this.handleTime;
	}
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoiceId() {
		return this.voiceId;
	}
	public void setVoiceId(String voiceId) {
		this.voiceId = voiceId;
	}

}
