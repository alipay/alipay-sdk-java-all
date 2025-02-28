package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放规则
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherSendRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4682242363538459785L;

	/**
	 * 【描述】是否开启自然人领取限制， 自然人表示按照身份证纬度进行领取限制。
【枚举值】
● true：是
● false：否
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否开启电话号码领取限制
【枚举值】
● true：是
● false：否
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 券发放结束时间， 格式：yyyy-MM-dd HH:mm:ss
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券发放结束时间， 格式：yyyy-MM-dd HH:mm:ss
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 【描述】发行券的总数量；取值范围：
[1,99999999]
单位：张
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 每人领取限制，配合quantity_limit_per_user_period_type使用
单位：次
	 */
	@ApiField("quantity_limit_per_user")
	private Long quantityLimitPerUser;

	/**
	 * 周期限领配置，限制每人在固定周期内领取
【枚举值】
每周: DAY
每周: WEEK
每月: MONTH
整个活动周期: LIFE_CYCLE
	 */
	@ApiField("quantity_limit_per_user_period_type")
	private String quantityLimitPerUserPeriodType;

	/**
	 * 【描述】限制支付宝实名用户才能领取支付券
【枚举值】
● true：是
● false：否
	 */
	@ApiField("real_name_limit")
	private Boolean realNameLimit;

	/**
	 * 【描述】是否开启支付宝账号领取限制， 
【枚举值】
● true：是
● false：否
	 */
	@ApiField("user_id_limit")
	private Boolean userIdLimit;

	/**
	 * 限制该券在指定哪些场景下可以正常展示，以及用户可正常领取。
【枚举值】
● 货架场景：SHELF_SCENE
● 直播互动区：LIVE
	 */
	@ApiField("voucher_available_scene")
	private String voucherAvailableScene;

	public Boolean getNaturalPersonLimit() {
		return this.naturalPersonLimit;
	}
	public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
		this.naturalPersonLimit = naturalPersonLimit;
	}

	public Boolean getPhoneNumberLimit() {
		return this.phoneNumberLimit;
	}
	public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
		this.phoneNumberLimit = phoneNumberLimit;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantityLimitPerUser() {
		return this.quantityLimitPerUser;
	}
	public void setQuantityLimitPerUser(Long quantityLimitPerUser) {
		this.quantityLimitPerUser = quantityLimitPerUser;
	}

	public String getQuantityLimitPerUserPeriodType() {
		return this.quantityLimitPerUserPeriodType;
	}
	public void setQuantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
		this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
	}

	public Boolean getRealNameLimit() {
		return this.realNameLimit;
	}
	public void setRealNameLimit(Boolean realNameLimit) {
		this.realNameLimit = realNameLimit;
	}

	public Boolean getUserIdLimit() {
		return this.userIdLimit;
	}
	public void setUserIdLimit(Boolean userIdLimit) {
		this.userIdLimit = userIdLimit;
	}

	public String getVoucherAvailableScene() {
		return this.voucherAvailableScene;
	}
	public void setVoucherAvailableScene(String voucherAvailableScene) {
		this.voucherAvailableScene = voucherAvailableScene;
	}

}
