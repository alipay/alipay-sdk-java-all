package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售卖信息
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:31:16
 */
public class VoucherSaleModeInfo extends AlipayObject {

	private static final long serialVersionUID = 4292382794426558357L;

	/**
	 * 资金托管方式
	 */
	@ApiField("fund_custody_mode")
	private String fundCustodyMode;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是  false：否。自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。  如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

	/**
	 * 在支持过期自动退款后，支付宝发起自动退款前 是否需要向商户确认退款。 不填默认否，枚举值： true：是 false：否。

如果选择了 true:是 ，则需要商户配合接入  过期自动退款前是否需要向商户确认SPI(spi.alipay.marketing.activity.order.refundconfirm)  以及   退款确认结果API(alipay.marketing.activity.order.refundconfirmcommit)
	 */
	@ApiField("overdue_refundable_need_confirm")
	private Boolean overdueRefundableNeedConfirm;

	/**
	 * 收款账号。 目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。
	 */
	@ApiField("payee_pid")
	private String payeePid;

	/**
	 * 购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否
	 */
	@ApiField("refundable")
	private Boolean refundable;

	/**
	 * 在支持随时退后，支付宝发起退款前用于判断是否需要向商户确认退款。 不填默认否，枚举值： true：是 false：否。 如果选择了 true:是  ，则需要商户配合接入退款前是否需要向商户确认SPI(spi.alipay.marketing.activity.order.refundconfirm)
	 */
	@ApiField("refundable_need_confirm")
	private Boolean refundableNeedConfirm;

	/**
	 * 用户购买优惠券需要支付的金额
	 */
	@ApiField("sale_amount")
	private String saleAmount;

	/**
	 * 结算信息
	 */
	@ApiField("settle_info")
	private BizfundSettleInfo settleInfo;

	public String getFundCustodyMode() {
		return this.fundCustodyMode;
	}
	public void setFundCustodyMode(String fundCustodyMode) {
		this.fundCustodyMode = fundCustodyMode;
	}

	public Boolean getOverdueRefundable() {
		return this.overdueRefundable;
	}
	public void setOverdueRefundable(Boolean overdueRefundable) {
		this.overdueRefundable = overdueRefundable;
	}

	public Boolean getOverdueRefundableNeedConfirm() {
		return this.overdueRefundableNeedConfirm;
	}
	public void setOverdueRefundableNeedConfirm(Boolean overdueRefundableNeedConfirm) {
		this.overdueRefundableNeedConfirm = overdueRefundableNeedConfirm;
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

	public Boolean getRefundableNeedConfirm() {
		return this.refundableNeedConfirm;
	}
	public void setRefundableNeedConfirm(Boolean refundableNeedConfirm) {
		this.refundableNeedConfirm = refundableNeedConfirm;
	}

	public String getSaleAmount() {
		return this.saleAmount;
	}
	public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

	public BizfundSettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(BizfundSettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

}
