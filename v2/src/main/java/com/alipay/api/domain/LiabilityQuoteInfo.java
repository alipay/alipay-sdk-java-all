package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 责任报价信息
 *
 * @author auto create
 * @since 1.0, 2020-06-28 19:21:16
 */
public class LiabilityQuoteInfo extends AlipayObject {

	private static final long serialVersionUID = 5224446256851767541L;

	/**
	 * 保司返回的起保时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 保司返回的起保时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 不计免赔保费，单位分
	 */
	@ApiField("iop_premium")
	private String iopPremium;

	/**
	 * 责任编码
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 责任保费，单位分
	 */
	@ApiField("liability_premium")
	private String liabilityPremium;

	/**
	 * 责任保额，单位分
	 */
	@ApiField("sum_insured")
	private String sumInsured;

	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public String getIopPremium() {
		return this.iopPremium;
	}
	public void setIopPremium(String iopPremium) {
		this.iopPremium = iopPremium;
	}

	public String getLiabilityNo() {
		return this.liabilityNo;
	}
	public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

	public String getLiabilityPremium() {
		return this.liabilityPremium;
	}
	public void setLiabilityPremium(String liabilityPremium) {
		this.liabilityPremium = liabilityPremium;
	}

	public String getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}

}
