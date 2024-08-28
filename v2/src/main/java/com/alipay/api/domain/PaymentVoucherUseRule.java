package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付券核销规则
 *
 * @author auto create
 * @since 1.0, 2023-06-29 13:44:38
 */
public class PaymentVoucherUseRule extends AlipayObject {

	private static final long serialVersionUID = 3296234965726217163L;

	/**
	 * 可核销的支付宝小程序id

限制： 
1、必须是支付宝小程序
2、如果包含重复的小程序id会自动进行去重操作。
	 */
	@ApiListField("available_app_ids")
	@ApiField("string")
	private List<String> availableAppIds;

	/**
	 * "可核销商品详情 限制: 1、available_goods与unavailable_goods_ids只能二选一或者同时为空"
	 */
	@ApiField("available_goods")
	private PaymentVoucherAvailableGoods availableGoods;

	/**
	 * 可核销商户
	 */
	@ApiField("available_merchant")
	private PaymentVoucherAvailableMerchant availableMerchant;

	/**
	 * 可核销支付门店id。
限制： 
1、available_store_ids中的门店id必须是支付宝门店id。 
2、available_store_ids如果包含重复的门店id会自动进行去重操作。
	 */
	@ApiListField("available_store_ids")
	@ApiField("string")
	private List<String> availableStoreIds;

	/**
	 * "固定面额满减券使用规则。 限制: 1、voucher_type为FIX_VOUCHER时必填"
	 */
	@ApiField("fix_voucher")
	private PaymentFixVoucher fixVoucher;

	/**
	 * 不可核销商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，不可以使用优惠券。

限制:
1、available_goods与unavailable_goods_ids只能二选一或者同时为空
	 */
	@ApiListField("unavailable_goods_ids")
	@ApiField("string")
	private List<String> unavailableGoodsIds;

	/**
	 * 核销跳转方式,默认CAN_USE(详情页展示可使用按钮)
	 */
	@ApiField("use_mode")
	private String useMode;

	/**
	 * 核销跳转链接
限制:
1、只有use_mode为SELF_LINK时该值有效且必传。
2、核销跳转链接必须是支付宝小程序链接。
	 */
	@ApiField("use_url")
	private String useUrl;

	/**
	 * 每个支付宝账号的核销次数限制。 默认不限制
	 */
	@ApiField("voucher_quantity_limit_per_user")
	private Long voucherQuantityLimitPerUser;

	/**
	 * 核销次数限制周期配置。默认值LIFE_CYCLE表示限制每个支付宝账号在整个活动期间核销次数。
	 */
	@ApiField("voucher_quantity_limit_per_user_period_type")
	private String voucherQuantityLimitPerUserPeriodType;

	/**
	 * 允许指定券的特殊生效时间规则。
	 */
	@ApiField("voucher_valid_period")
	private PaymentVoucherValidPeriod voucherValidPeriod;

	public List<String> getAvailableAppIds() {
		return this.availableAppIds;
	}
	public void setAvailableAppIds(List<String> availableAppIds) {
		this.availableAppIds = availableAppIds;
	}

	public PaymentVoucherAvailableGoods getAvailableGoods() {
		return this.availableGoods;
	}
	public void setAvailableGoods(PaymentVoucherAvailableGoods availableGoods) {
		this.availableGoods = availableGoods;
	}

	public PaymentVoucherAvailableMerchant getAvailableMerchant() {
		return this.availableMerchant;
	}
	public void setAvailableMerchant(PaymentVoucherAvailableMerchant availableMerchant) {
		this.availableMerchant = availableMerchant;
	}

	public List<String> getAvailableStoreIds() {
		return this.availableStoreIds;
	}
	public void setAvailableStoreIds(List<String> availableStoreIds) {
		this.availableStoreIds = availableStoreIds;
	}

	public PaymentFixVoucher getFixVoucher() {
		return this.fixVoucher;
	}
	public void setFixVoucher(PaymentFixVoucher fixVoucher) {
		this.fixVoucher = fixVoucher;
	}

	public List<String> getUnavailableGoodsIds() {
		return this.unavailableGoodsIds;
	}
	public void setUnavailableGoodsIds(List<String> unavailableGoodsIds) {
		this.unavailableGoodsIds = unavailableGoodsIds;
	}

	public String getUseMode() {
		return this.useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

	public String getUseUrl() {
		return this.useUrl;
	}
	public void setUseUrl(String useUrl) {
		this.useUrl = useUrl;
	}

	public Long getVoucherQuantityLimitPerUser() {
		return this.voucherQuantityLimitPerUser;
	}
	public void setVoucherQuantityLimitPerUser(Long voucherQuantityLimitPerUser) {
		this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
	}

	public String getVoucherQuantityLimitPerUserPeriodType() {
		return this.voucherQuantityLimitPerUserPeriodType;
	}
	public void setVoucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
		this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
	}

	public PaymentVoucherValidPeriod getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(PaymentVoucherValidPeriod voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
