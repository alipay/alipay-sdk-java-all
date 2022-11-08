package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 路由阈值
 *
 * @author auto create
 * @since 1.0, 2022-09-07 16:52:31
 */
public class RoutingThresholdDTO extends AlipayObject {

	private static final long serialVersionUID = 4481735133528949281L;

	/**
	 * 境外切境内阈值
	 */
	@ApiField("offshore_to_onshore_bps")
	private Long offshoreToOnshoreBps;

	/**
	 * 境内切境外阈值
	 */
	@ApiField("onshore_to_offshore_bps")
	private Long onshoreToOffshoreBps;

	public Long getOffshoreToOnshoreBps() {
		return this.offshoreToOnshoreBps;
	}
	public void setOffshoreToOnshoreBps(Long offshoreToOnshoreBps) {
		this.offshoreToOnshoreBps = offshoreToOnshoreBps;
	}

	public Long getOnshoreToOffshoreBps() {
		return this.onshoreToOffshoreBps;
	}
	public void setOnshoreToOffshoreBps(Long onshoreToOffshoreBps) {
		this.onshoreToOffshoreBps = onshoreToOffshoreBps;
	}

}
