package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置授权配置
 *
 * @author auto create
 * @since 1.0, 2025-06-25 15:22:32
 */
public class LocationAuthConfigVO extends AlipayObject {

	private static final long serialVersionUID = 4792793994535354532L;

	/**
	 * 配置开关 true|false
	 */
	@ApiField("lbs_switch")
	private Boolean lbsSwitch;

	public Boolean getLbsSwitch() {
		return this.lbsSwitch;
	}
	public void setLbsSwitch(Boolean lbsSwitch) {
		this.lbsSwitch = lbsSwitch;
	}

}
