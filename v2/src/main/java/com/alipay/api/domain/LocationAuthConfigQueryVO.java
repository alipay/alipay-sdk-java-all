package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 位置授权配置
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class LocationAuthConfigQueryVO extends AlipayObject {

	private static final long serialVersionUID = 7776652422164411484L;

	/**
	 * 配置开关
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
