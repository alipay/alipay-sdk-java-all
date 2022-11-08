package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家会员交易明细
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:53:42
 */
public class MemberCardUserTransactionDetail extends AlipayObject {

	private static final long serialVersionUID = 5217942571273847261L;

	/**
	 * 储值总金额，单位元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 储值优惠金额（权益金），单位元。如用户主动发起退款，优惠金额则表示退回商户账户金额。
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 交易发生时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 交易明细类型，枚举如下：
RECHARGE=充值，
PAYMENT=支付，
REFUND=退款，
RETURN=退卡
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 储值本金金额，单位元。如用户主动发起退款，本金金额则表示退回用户账号金额。
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 充值方案ID，detail_type=RECHARGE 时有值
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
