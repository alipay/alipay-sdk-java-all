package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot门禁通过刷脸提交开门结果
 *
 * @author auto create
 * @since 1.0, 2021-10-29 10:08:20
 */
public class AlipayOpenIotmbsDooropenresultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5771892535291522382L;

	/**
	 * 设备激活序号
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 房间门状态，true为开启成功，false为开启失败
	 */
	@ApiField("door_state")
	private Boolean doorState;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public Boolean getDoorState() {
		return this.doorState;
	}
	public void setDoorState(Boolean doorState) {
		this.doorState = doorState;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
