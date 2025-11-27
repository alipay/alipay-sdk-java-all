package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分配规则
 *
 * @author auto create
 * @since 1.0, 2023-08-08 22:24:58
 */
public class TrafficRule extends AlipayObject {

	private static final long serialVersionUID = 7458717152748296372L;

	/**
	 * 流量占比
	 */
	@ApiField("traffic_ratio")
	private String trafficRatio;

	/**
	 * 云函数版本名称
	 */
	@ApiField("version_name")
	private String versionName;

	public String getTrafficRatio() {
		return this.trafficRatio;
	}
	public void setTrafficRatio(String trafficRatio) {
		this.trafficRatio = trafficRatio;
	}

	public String getVersionName() {
		return this.versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
