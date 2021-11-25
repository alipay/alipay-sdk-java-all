package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot人脸设备解除绑定酒店和房间
 *
 * @author auto create
 * @since 1.0, 2021-10-29 10:07:11
 */
public class AlipayOpenIotmbsRoomUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 7186369917991875143L;

	/**
	 * 设备激活ID
	 */
	@ApiField("dev_id")
	private String devId;

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

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
