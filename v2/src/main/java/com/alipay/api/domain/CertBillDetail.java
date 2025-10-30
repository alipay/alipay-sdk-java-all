package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证账单详情
 *
 * @author auto create
 * @since 1.0, 2025-10-28 11:55:02
 */
public class CertBillDetail extends AlipayObject {

	private static final long serialVersionUID = 8495672363893613171L;

	/**
	 * 当前账单对应的凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 商家优惠，单位：元
	 */
	@ApiField("merchant_discount")
	private String merchantDiscount;

	/**
	 * 券的原售价，单位：元
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 平台优惠，单位：元
	 */
	@ApiField("platform_discount")
	private String platformDiscount;

	/**
	 * 用户实付，单位：元
	 */
	@ApiField("real_pay")
	private String realPay;

	/**
	 * 券的销售价格，单位：元
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 实际结算金额，单位：元
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * settle_type 为“USE”：代表“结算时间”
settle_type为“REFUND”：代表“退结算时间”
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 当前账单的结算类型
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 总三方分账金额（saas服务商佣金、待运营服务商佣金 等），单位：元
	 */
	@ApiField("total_alloc_amount")
	private String totalAllocAmount;

	/**
	 * 总抽佣金额（支付宝平台抽佣金额），单位：元
	 */
	@ApiField("total_commission_amount")
	private String totalCommissionAmount;

	/**
	 * settle_type 为“USE”：代表“核销时间”
settle_type为“REFUND”：代表“退款时间”
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	/**
	 * 核销的门店id
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getMerchantDiscount() {
		return this.merchantDiscount;
	}
	public void setMerchantDiscount(String merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPlatformDiscount() {
		return this.platformDiscount;
	}
	public void setPlatformDiscount(String platformDiscount) {
		this.platformDiscount = platformDiscount;
	}

	public String getRealPay() {
		return this.realPay;
	}
	public void setRealPay(String realPay) {
		this.realPay = realPay;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getTotalAllocAmount() {
		return this.totalAllocAmount;
	}
	public void setTotalAllocAmount(String totalAllocAmount) {
		this.totalAllocAmount = totalAllocAmount;
	}

	public String getTotalCommissionAmount() {
		return this.totalCommissionAmount;
	}
	public void setTotalCommissionAmount(String totalCommissionAmount) {
		this.totalCommissionAmount = totalCommissionAmount;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getUseShopId() {
		return this.useShopId;
	}
	public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}

}
