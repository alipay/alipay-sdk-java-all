package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv解绑设备
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:52:24
 */
public class AlipayOpenIotmbsIsvdeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5487513671166613794L;

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
