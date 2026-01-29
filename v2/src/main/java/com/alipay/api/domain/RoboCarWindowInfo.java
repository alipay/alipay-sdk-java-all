package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车窗信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:40
 */
public class RoboCarWindowInfo extends AlipayObject {

	private static final long serialVersionUID = 4815494747448765467L;

	/**
	 * 车窗开启状态：1关闭，2开启
	 */
	@ApiField("open_status")
	private Long openStatus;

	/**
	 * 是否有车窗能力，0无，1有
	 */
	@ApiField("window_ability")
	private Long windowAbility;

	public Long getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}

	public Long getWindowAbility() {
		return this.windowAbility;
	}
	public void setWindowAbility(Long windowAbility) {
		this.windowAbility = windowAbility;
	}

}
