package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益奖品
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRight extends AlipayObject {

	private static final long serialVersionUID = 7755621849897282375L;

	/**
	 * 权益展示信息
	 */
	@ApiField("display_info")
	private BenefitDisplayInfoResponse displayInfo;

	public BenefitDisplayInfoResponse getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(BenefitDisplayInfoResponse displayInfo) {
		this.displayInfo = displayInfo;
	}

}
