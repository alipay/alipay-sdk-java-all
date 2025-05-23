package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot提交房间的场景开关状态
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:54:27
 */
public class AlipayOpenIotmbsRoomstateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8218761393156656583L;

	/**
	 * 设备激活序号
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 房间开关的状态，1正常2勿扰3清扫4稍后
	 */
	@ApiField("room_state")
	private Long roomState;

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Long getRoomState() {
		return this.roomState;
	}
	public void setRoomState(Long roomState) {
		this.roomState = roomState;
	}

}
