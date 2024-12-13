package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券查询发放信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQuerySendRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4148793363954197685L;

	/**
	 * 是否做身份证号限制
	 */
	@ApiField("natural_person_limit")
	private Boolean naturalPersonLimit;

	/**
	 * 是否做电话号码限制
	 */
	@ApiField("phone_number_limit")
	private Boolean phoneNumberLimit;

	/**
	 * 券发放的结束时间
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 券发放的开始时间
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 发券总数，单位：个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 每人领取周期内限制次数
	 */
	@ApiField("quantity_limit_per_user")
	private Long quantityLimitPerUser;

	/**
	 * 每人领取周期类型，单位：天，周，月，整个活动周期
	 */
	@ApiField("quantity_limit_per_user_period_type")
	private String quantityLimitPerUserPeriodType;

	/**
	 * 是否做实名限制
	 */
	@ApiField("real_name_limit")
	private Boolean realNameLimit;

	/**
	 * 是否启用用户ID的限制
	 */
	@ApiField("user_id_limit")
	private Boolean userIdLimit;

	/**
	 * 券发放场景
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
