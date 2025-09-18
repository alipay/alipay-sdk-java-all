package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通资源包询价
 *
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:41
 */
public class AlipayCloudCloudbaseResourcepackageOpenConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5881429759343113237L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 优惠券code列表
	 */
	@ApiListField("coupon_codes")
	@ApiField("string")
	private List<String> couponCodes;

	/**
	 * 购买时长(月)
	 */
	@ApiField("purchase_month")
	private Long purchaseMonth;

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

	public Long getPurchaseMonth() {
		return this.purchaseMonth;
	}
	public void setPurchaseMonth(Long purchaseMonth) {
		this.purchaseMonth = purchaseMonth;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
