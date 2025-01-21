package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 违约金信息
 *
 * @author auto create
 * @since 1.0, 2024-12-20 13:31:52
 */
public class BreakCostsInfo extends AlipayObject {

	private static final long serialVersionUID = 6199381782533895286L;

	/**
	 * 当违约金类型是REMAIN_RATE时必传，需要设置违约金的收取按照剩余金额的多少比例计算，如30代表30%
	 */
	@ApiField("damages_rate")
	private String damagesRate;

	/**
	 * 违约金类型
	 */
	@ApiField("damages_type")
	private String damagesType;

	public String getDamagesRate() {
		return this.damagesRate;
	}
	public void setDamagesRate(String damagesRate) {
		this.damagesRate = damagesRate;
	}

	public String getDamagesType() {
		return this.damagesType;
	}
	public void setDamagesType(String damagesType) {
		this.damagesType = damagesType;
	}

}
