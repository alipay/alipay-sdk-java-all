package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销规则
 *
 * @author auto create
 * @since 1.0, 2016-05-01 18:54:46
 */
public class VoucherUseRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 3327454618125694122L;

	/**
	 * 可用时段
	 */
	@ApiField("available_time")
	private AvailableVoucherTimeDTO availableTime;

	/**
	 * 延迟信息
	 */
	@ApiField("delay_info")
	private EffectiveDelayInfoDTO delayInfo;

	/**
	 * 生效类型,IMMEDIATELY:立即生效,DELAY:延迟生效
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 不可用时段
	 */
	@ApiField("forbidden_time")
	private ForbiddenVoucherTimeDTO forbiddenTime;

	/**
	 * 最低消费金额
	 */
	@ApiField("min_consume")
	private String minConsume;

	/**
	 * 适用门店类别
	 */
	@ApiListField("suit_shops")
	@ApiField("string")
	private List<String> suitShops;

	public AvailableVoucherTimeDTO getAvailableTime() {
		return this.availableTime;
	}
	public void setAvailableTime(AvailableVoucherTimeDTO availableTime) {
		this.availableTime = availableTime;
	}

	public EffectiveDelayInfoDTO getDelayInfo() {
		return this.delayInfo;
	}
	public void setDelayInfo(EffectiveDelayInfoDTO delayInfo) {
		this.delayInfo = delayInfo;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public ForbiddenVoucherTimeDTO getForbiddenTime() {
		return this.forbiddenTime;
	}
	public void setForbiddenTime(ForbiddenVoucherTimeDTO forbiddenTime) {
		this.forbiddenTime = forbiddenTime;
	}

	public String getMinConsume() {
		return this.minConsume;
	}
	public void setMinConsume(String minConsume) {
		this.minConsume = minConsume;
	}

	public List<String> getSuitShops() {
		return this.suitShops;
	}
	public void setSuitShops(List<String> suitShops) {
		this.suitShops = suitShops;
	}

}
