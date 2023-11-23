package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv解绑设备
 *
 * @author auto create
 * @since 1.0, 2023-03-06 14:44:24
 */
public class AlipayOpenIotmbsIsvdeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 8547632521585116159L;

	/**
	 * project_id+酒店项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * sn+需要解除绑定设备的sn
	 */
	@ApiField("sn")
	private String sn;

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
