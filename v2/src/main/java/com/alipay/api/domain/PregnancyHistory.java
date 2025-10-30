package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 孕产史
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class PregnancyHistory extends AlipayObject {

	private static final long serialVersionUID = 7662514763579799241L;

	/**
	 * 末次月经时间
	 */
	@ApiField("last_menstruation")
	private String lastMenstruation;

	/**
	 * 怀孕状态（孕期）
	 */
	@ApiField("pregnancy_status")
	private String pregnancyStatus;

	public String getLastMenstruation() {
		return this.lastMenstruation;
	}
	public void setLastMenstruation(String lastMenstruation) {
		this.lastMenstruation = lastMenstruation;
	}

	public String getPregnancyStatus() {
		return this.pregnancyStatus;
	}
	public void setPregnancyStatus(String pregnancyStatus) {
		this.pregnancyStatus = pregnancyStatus;
	}

}
