package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具解绑按照条件分页查询返回对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EquipmentAuthRemoveQueryBypageDTO extends AlipayObject {

	private static final long serialVersionUID = 7516923592219361764L;

	/**
	 * 机具编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 解绑时间
	 */
	@ApiField("unbind_time")
	private String unbindTime;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUnbindTime() {
		return this.unbindTime;
	}
	public void setUnbindTime(String unbindTime) {
		this.unbindTime = unbindTime;
	}

}
