package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单项资源包询价
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:33
 */
public class AlipayCloudCloudbaseResourcepackageItempackageConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5297386853259222642L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 优惠券code列表
	 */
	@ApiListField("coupon_codes")
	@ApiField("string")
	private List<String> couponCodes;

	/**
	 * 商品可购买周期数量
	 */
	@ApiField("effective_period_num")
	private Long effectivePeriodNum;

	/**
	 * 商品可购买周期类型
	 */
	@ApiField("effective_period_type")
	private String effectivePeriodType;

	/**
	 * 购买数量
	 */
	@ApiField("purchase_number")
	private Long purchaseNumber;

	/**
	 * 商品规格编码
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public List<String> getCouponCodes() {
		return this.couponCodes;
	}
	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	public Long getEffectivePeriodNum() {
		return this.effectivePeriodNum;
	}
	public void setEffectivePeriodNum(Long effectivePeriodNum) {
		this.effectivePeriodNum = effectivePeriodNum;
	}

	public String getEffectivePeriodType() {
		return this.effectivePeriodType;
	}
	public void setEffectivePeriodType(String effectivePeriodType) {
		this.effectivePeriodType = effectivePeriodType;
	}

	public Long getPurchaseNumber() {
		return this.purchaseNumber;
	}
	public void setPurchaseNumber(Long purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
