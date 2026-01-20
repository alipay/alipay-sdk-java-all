package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通下单并支付
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:09:12
 */
public class AlipayCloudCloudbaseResourcepackageOpenCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 5879776874242197931L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否自动续费
	 */
	@ApiField("auto_renew")
	private Boolean autoRenew;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 优惠券code列表，目前只使用第一张
	 */
	@ApiListField("coupon_codes")
	@ApiField("string")
	private List<String> couponCodes;

	/**
	 * 环境描述
	 */
	@ApiField("env_description")
	private String envDescription;

	/**
	 * 环境名称
	 */
	@ApiField("env_name")
	private String envName;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private Long purchaseMonth;

	/**
	 * 环境区域
 - cn-hangzhou
	 */
	@ApiField("region")
	private String region;

	/**
	 * 资源包规格编码
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}
	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public List<String> getCouponCodes() {
		return this.couponCodes;
	}
	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	public String getEnvDescription() {
		return this.envDescription;
	}
	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
	}

	public String getEnvName() {
		return this.envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(Long purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
