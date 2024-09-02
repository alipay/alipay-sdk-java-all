package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 按量转套餐开通下单并支付
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:36:11
 */
public class AlipayCloudCloudbaseResourcepackageFrompostpaidCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 6123547768542118259L;

	/**
	 * 套餐包是否自动续费
	 */
	@ApiField("auto_renew")
	private Boolean autoRenew;

	/**
	 * 小程序云应用APPID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云应用ENVID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 优惠券code列表，目前只使用第一张
	 */
	@ApiListField("coupon_codes")
	@ApiField("string")
	private List<String> couponCodes;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private String purchaseMonth;

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

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public List<String> getCouponCodes() {
		return this.couponCodes;
	}
	public void setCouponCodes(List<String> couponCodes) {
		this.couponCodes = couponCodes;
	}

	public String getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(String purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
