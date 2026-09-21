package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金认款
 *
 * @author auto create
 * @since 1.0, 2026-09-20 10:42:52
 */
public class AlipayTradeSaasFundConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4492361638274152419L;

	/**
	 * 资金确认动作。CONFIRM表示认款，REJECT表示拒绝待认款资金并全额退款；不传默认CONFIRM。REJECT仅需传fund_no，不应传order_no、trade_no或claim_amount。
	 */
	@ApiField("action")
	private String action;

	/**
	 * 本次认款金额，单位为元，最多保留两位小数，范围为0.01至100000000.00。仅在order_no和trade_no均不传时生效；无订单且未传时按真实入金金额认款，传入时不能大于真实入金金额。
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/**
	 * 商户认款请求幂等号。仅允许字母、数字和下划线，重试时必须沿用原值；相同请求号对应的入金、订单和认款金额不能变化。
	 */
	@ApiField("claim_request_no")
	private String claimRequestNo;

	/**
	 * SaaS资金流水号。必须是待认款的入金资金流水，商户应使用资金通知或资金查询返回的值。
	 */
	@ApiField("fund_no")
	private String fundNo;

	/**
	 * SaaS交易主单号。可选；与trade_no同时传入时，两个标识必须对应同一订单，否则返回INVALID_PARAMETER。order_no和trade_no均不传时按资金流水补建订单。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 银行转账渠道交易号。可选；与order_no同时传入时，两个标识必须对应同一订单，否则返回INVALID_PARAMETER。order_no和trade_no均不传时按资金流水补建订单。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getClaimAmount() {
		return this.claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimRequestNo() {
		return this.claimRequestNo;
	}
	public void setClaimRequestNo(String claimRequestNo) {
		this.claimRequestNo = claimRequestNo;
	}

	public String getFundNo() {
		return this.fundNo;
	}
	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
