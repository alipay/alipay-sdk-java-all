package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-03 21:27:55
 */
public class AIRetailRiskKeyEvent extends AlipayObject {

	private static final long serialVersionUID = 3544924211521185395L;

	/**
	 * null
	 */
	@ApiListField("actions")
	@ApiField("string")
	private List<String> actions;

	/**
	 * 摄像头id
	 */
	@ApiField("camera_id")
	private String cameraId;

	/**
	 * 触发事件的时间戳
	 */
	@ApiField("start_ts")
	private Long startTs;

	public List<String> getActions() {
		return this.actions;
	}
	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	public String getCameraId() {
		return this.cameraId;
	}
	public void setCameraId(String cameraId) {
		this.cameraId = cameraId;
	}

	public Long getStartTs() {
		return this.startTs;
	}
	public void setStartTs(Long startTs) {
		this.startTs = startTs;
	}

}
