package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测详情
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:12:52
 */
public class DetectionDetail extends AlipayObject {

	private static final long serialVersionUID = 3577533138646832249L;

	/**
	 * AI 面试监考检测的业务结论，仅命中时返回、未命中为空（取值见枚举表，属报告内容数据）
	 */
	@ApiField("cheating_status")
	private String cheatingStatus;

	/**
	 * 检测状态
	 */
	@ApiField("detection_status")
	private String detectionStatus;

	/**
	 * 手势/动作类型
	 */
	@ApiField("gesture_type")
	private String gestureType;

	public String getCheatingStatus() {
		return this.cheatingStatus;
	}
	public void setCheatingStatus(String cheatingStatus) {
		this.cheatingStatus = cheatingStatus;
	}

	public String getDetectionStatus() {
		return this.detectionStatus;
	}
	public void setDetectionStatus(String detectionStatus) {
		this.detectionStatus = detectionStatus;
	}

	public String getGestureType() {
		return this.gestureType;
	}
	public void setGestureType(String gestureType) {
		this.gestureType = gestureType;
	}

}
