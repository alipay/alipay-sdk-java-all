package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市便民服务页面接口
 *
 * @author auto create
 * @since 1.0, 2016-08-30 10:38:43
 */
public class AlipayEcoCityserviceCityfacilitatorAccessModel extends AlipayObject {

	private static final long serialVersionUID = 7524799986986687113L;

	/**
	 * 330100
	 */
	@ApiField("zone_code")
	private String zoneCode;

	public String getZoneCode() {
		return this.zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

}
