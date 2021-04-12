package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟设备释放接口
 *
 * @author auto create
 * @since 1.0, 2021-01-11 13:45:37
 */
public class AntLinkeDevopsMobiledeviceReturnModel extends AlipayObject {

	private static final long serialVersionUID = 6152816583555789582L;

	/**
	 * device_id+唯一+设备释放对象+antdevops.mobiledevice.get接口返回参数+必须先占用才能释放
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * access_host+唯一+释放设备的host信息+apply结果返回结果
	 */
	@ApiField("remote_host")
	private String remoteHost;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getRemoteHost() {
		return this.remoteHost;
	}
	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

}
