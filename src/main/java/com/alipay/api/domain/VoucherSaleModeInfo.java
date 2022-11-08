package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 售卖信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherSaleModeInfo extends AlipayObject {

	private static final long serialVersionUID = 1186335925745548216L;

	/**
	 * 资金托管方式
	 */
	@ApiField("fund_custody_mode")
	private String fundCustodyMode;

	/**
	 * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否。自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
	 */
	@ApiField("overdue_refundable")
	private Boolean overdueRefundable;

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

	public BizfundSettleInfo getSettleInfo() {
		return this.settleInfo;
	}
	public void setSettleInfo(BizfundSettleInfo settleInfo) {
		this.settleInfo = settleInfo;
	}

}
