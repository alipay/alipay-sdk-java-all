package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Iot酒店设备归属转移
 *
 * @author auto create
 * @since 1.0, 2025-01-02 16:54:57
 */
public class AlipayOpenIotmbsDeviceTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3341573124166724571L;

	/**
	 * 设备要转入的isv的pid
	 */
	@ApiField("new_owner_pid")
	private String newOwnerPid;

	/**
	 * 需要转移设备的sn
	 */
	@ApiField("sn")
	private String sn;

	public String getNewOwnerPid() {
		return this.newOwnerPid;
	}
	public void setNewOwnerPid(String newOwnerPid) {
		this.newOwnerPid = newOwnerPid;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
