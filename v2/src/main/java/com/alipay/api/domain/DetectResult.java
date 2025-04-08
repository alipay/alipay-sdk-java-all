package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class DetectResult extends AlipayObject {

	private static final long serialVersionUID = 2781416217898513159L;

	/**
	 * 检测结果：有风险\无风险
	 */
	@ApiField("detect_result")
	private String detectResult;

	/**
	 * 检测状态：检测中\检测完成
	 */
	@ApiField("detect_status")
	private String detectStatus;

	/**
	 * 3. 消防通道占用识别: FIRE_LANE_OCCUPANCY_DETECTION
	 */
	@ApiField("event_code")
	private String eventCode;

	public String getDetectResult() {
		return this.detectResult;
	}
	public void setDetectResult(String detectResult) {
		this.detectResult = detectResult;
	}

	public String getDetectStatus() {
		return this.detectStatus;
	}
	public void setDetectStatus(String detectStatus) {
		this.detectStatus = detectStatus;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

}
