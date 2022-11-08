package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联交易明细模型
 *
 * @author auto create
 * @since 1.0, 2022-01-05 15:28:51
 */
public class TradeDetailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7826994677661753499L;

	/**
	 * 交易发生时间
	 */
	@ApiField("gmt_occur")
	private String gmtOccur;

	/**
	 * 交易原始金额，单位元，保留两位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 业务收单交易号
	 */
	@ApiField("partner_trade_no")
	private String partnerTradeNo;

	/**
	 * 收单模式，TRADE-收单类，NONE_TRADE-非收单类
	 */
	@ApiField("trade_mode")
	private String tradeMode;

	/**
	 * 收单平台,收单类交易必传
	 */
	@ApiField("trade_platform")
	private String tradePlatform;

	/**
	 * 交易备注
	 */
	@ApiField("trade_title")
	private String tradeTitle;

	/**
	 * 总入账金额，收单类交易必传。单位元，人民币，保留两位小数
	 */
	@ApiField("trans_in_amount")
	private String transInAmount;

	/**
	 * 入账流水唯一id，收单类交易必传
	 */
	@ApiField("trans_in_unique_id")
	private String transInUniqueId;

	/**
	 * 支付人信息，可为支付宝uid，email，用户名等形式。新业务接入需协商。
	 */
	@ApiField("user_identity")
	private String userIdentity;

	public String getGmtOccur() {
		return this.gmtOccur;
	}
	public void setGmtOccur(String gmtOccur) {
		this.gmtOccur = gmtOccur;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPartnerTradeNo() {
		return this.partnerTradeNo;
	}
	public void setPartnerTradeNo(String partnerTradeNo) {
		this.partnerTradeNo = partnerTradeNo;
	}

	public String getTradeMode() {
		return this.tradeMode;
	}
	public void setTradeMode(String tradeMode) {
		this.tradeMode = tradeMode;
	}

	public String getTradePlatform() {
		return this.tradePlatform;
	}
	public void setTradePlatform(String tradePlatform) {
		this.tradePlatform = tradePlatform;
	}

	public String getTradeTitle() {
		return this.tradeTitle;
	}
	public void setTradeTitle(String tradeTitle) {
		this.tradeTitle = tradeTitle;
	}

	public String getTransInAmount() {
		return this.transInAmount;
	}
	public void setTransInAmount(String transInAmount) {
		this.transInAmount = transInAmount;
	}

	public String getTransInUniqueId() {
		return this.transInUniqueId;
	}
	public void setTransInUniqueId(String transInUniqueId) {
		this.transInUniqueId = transInUniqueId;
	}

	public String getUserIdentity() {
		return this.userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

}
