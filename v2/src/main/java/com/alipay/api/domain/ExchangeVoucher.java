package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家兑换券
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:43:51
 */
public class ExchangeVoucher extends AlipayObject {

	private static final long serialVersionUID = 1228256413942817659L;

	/**
	 * 券的价值
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 兑换券业务类型。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客服电话
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 客服链接
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 门槛金额。说明：该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。
不填默认否，枚举值：
true：是
false：否
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

	/**
	 * 收款账号。目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。
	 */
	@ApiField("payee_pid")
	private String payeePid;

	/**
	 * 购买的优惠券是否允许退款。不填默认否，枚举值：
true：是
false：否
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/**
	 * 用户购买优惠券需要支付的金额
	 */
	@ApiField("sale_amount")
	private String saleAmount;

	/**
	 * 解决类型。
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * 对消费者展示的券(商品)名称。
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCustomerServiceMobile() {
		return this.customerServiceMobile;
	}
	public void setCustomerServiceMobile(String customerServiceMobile) {
		this.customerServiceMobile = customerServiceMobile;
	}

	public String getCustomerServiceUrl() {
		return this.customerServiceUrl;
	}
	public void setCustomerServiceUrl(String customerServiceUrl) {
		this.customerServiceUrl = customerServiceUrl;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public Boolean getOverdueRefundable() {
		return this.overdueRefundable;
	}
	public void setOverdueRefundable(Boolean overdueRefundable) {
		this.overdueRefundable = overdueRefundable;
	}

	public String getPayeePid() {
		return this.payeePid;
	}
	public void setPayeePid(String payeePid) {
		this.payeePid = payeePid;
	}

	public Boolean getRefundable() {
		return this.refundable;
	}
	public void setRefundable(Boolean refundable) {
		this.refundable = refundable;
	}

	public String getSaleAmount() {
		return this.saleAmount;
	}
	public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
