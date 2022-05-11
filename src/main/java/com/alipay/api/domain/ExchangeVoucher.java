package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家兑换券
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:18
 */
public class ExchangeVoucher extends AlipayObject {

	private static final long serialVersionUID = 5711128238442175482L;

	/**
	 * 券的价值

限制：
币种为人民币，单位为元。小数点以后最多保留两位。

取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 兑换券业务类型。

枚举值
团购券：GROUP_BUY_EXCHANGE_VOUCHER
代金券：FIX_EXCHANGE_VOUCHER
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客服电话

限制:
客服电话和客服链接必须二选一
	 */
	@ApiField("customer_service_mobile")
	private String customerServiceMobile;

	/**
	 * 客服链接

限制:
客服电话和客服链接必须二选一
	 */
	@ApiField("customer_service_url")
	private String customerServiceUrl;

	/**
	 * 优惠门槛金额，表示只有当订单金额大于等于门槛金额时券才能使用。该字段为空时表示无门槛。
门槛金额的校验由服务商(商户)核销时自行校验，支付宝侧只做展示使用。

币种为人民币，单位为元。小数点以后最多保留两位。 

设置门槛：取值范围:0.1<=x<= 50000。
如果设置了门槛金额，则必须大于等于0.1，不可以等于0
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。

不填默认否，枚举值：
true：是
false：否

自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。
如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

	/**
	 * 收款账号。

目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。
	 */
	@ApiField("payee_pid")
	private String payeePid;

	/**
	 * 购买的优惠券是否允许退款。

不填默认否，枚举值：
true：是
false：否
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/**
	 * 用户购买优惠券需要支付的金额
限制：
币种为人民币，单位为元。小数点以后最多保留两位。

取值范围:0.1<=x<=3000
	 */
	@ApiField("sale_amount")
	private String saleAmount;

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
