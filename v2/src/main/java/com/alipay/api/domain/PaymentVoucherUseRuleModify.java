package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:16:44
 */
public class PaymentVoucherUseRuleModify extends AlipayObject {

	private static final long serialVersionUID = 3334778682851629893L;

	/**
	 * 可核销的支付宝小程序id 

限制： 
1、必须是支付宝小程序 
2、如果包含重复的小程序id会自动进行去重操作。
3、可核销小程序范围只能扩大不能缩小
	 */
	@ApiField("available_app_ids")
	private String availableAppIds;

	/**
	 * 可核销商品
	 */
	@ApiField("available_goods")
	private PaymentVoucherAvailableGoodsModify availableGoods;

	/**
	 * 可核销商户
	 */
	@ApiField("available_merchant")
	private PaymentVoucherAvailableMerchantModify availableMerchant;

	/**
	 * 可核销支付门店id。 

限制： 
1、available_store_ids中的门店id必须是支付宝门店id。 
2、available_store_ids如果包含重复的门店id会自动进行去重操作。
3、可核销门店范围只能扩大不能缩小
	 */
	@ApiField("available_store_ids")
	private String availableStoreIds;

	/**
	 * 允许指定券的特殊生效时间规则。
	 */
	@ApiField("voucher_valid_period")
	private PaymentVoucherValidPeriodModify voucherValidPeriod;

	public String getAvailableAppIds() {
		return this.availableAppIds;
	}
	public void setAvailableAppIds(String availableAppIds) {
		this.availableAppIds = availableAppIds;
	}

	public PaymentVoucherAvailableGoodsModify getAvailableGoods() {
		return this.availableGoods;
	}
	public void setAvailableGoods(PaymentVoucherAvailableGoodsModify availableGoods) {
		this.availableGoods = availableGoods;
	}

	public PaymentVoucherAvailableMerchantModify getAvailableMerchant() {
		return this.availableMerchant;
	}
	public void setAvailableMerchant(PaymentVoucherAvailableMerchantModify availableMerchant) {
		this.availableMerchant = availableMerchant;
	}

	public String getAvailableStoreIds() {
		return this.availableStoreIds;
	}
	public void setAvailableStoreIds(String availableStoreIds) {
		this.availableStoreIds = availableStoreIds;
	}

	public PaymentVoucherValidPeriodModify getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(PaymentVoucherValidPeriodModify voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
