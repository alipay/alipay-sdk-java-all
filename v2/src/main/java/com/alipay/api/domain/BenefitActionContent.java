package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖内容
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:53
 */
public class BenefitActionContent extends AlipayObject {

	private static final long serialVersionUID = 2848871339218897633L;

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
