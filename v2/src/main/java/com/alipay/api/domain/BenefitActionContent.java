package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖内容
 *
 * @author auto create
 * @since 1.0, 2025-11-28 09:38:13
 */
public class BenefitActionContent extends AlipayObject {

	private static final long serialVersionUID = 5238365562558352869L;

	/**
	 * 权益发奖信息
	 */
	@ApiField("luck_draw_info")
	private BenefitLuckDrawInfo luckDrawInfo;

	public BenefitLuckDrawInfo getLuckDrawInfo() {
		return this.luckDrawInfo;
	}
	public void setLuckDrawInfo(BenefitLuckDrawInfo luckDrawInfo) {
		this.luckDrawInfo = luckDrawInfo;
	}

}
