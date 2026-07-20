package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租安托分账结算接口
 *
 * @author auto create
 * @since 1.0, 2026-07-10 17:47:54
 */
public class AlipayCommerceRentZatSellerSettleModel extends AlipayObject {

	private static final long serialVersionUID = 8627575536548461224L;

	/**
	 * 交易组件订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 分账结算业务扩展参数
	 */
	@ApiField("extend_param")
	private SettleExtParam extendParam;

	/**
	 * 操作员 ID，商家自定义操作员编号。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 结算请求流水号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分账模式，目前有两种分账同步执行sync，分账异步执行async，不传默认同步执行
	 */
	@ApiField("royalty_mode")
	private String royaltyMode;

	/**
	 * 分账明细信息。单独调用分账完结时，可以不传此参数。其他场景必传。 注意：商家分账场景下分账收入方 trans_in 只支持支付宝账户，不支持使用 cardAliasNo 卡编号。
	 */
	@ApiField("royalty_param")
	private RoyaltyDetailInfoPojo royaltyParam;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public SettleExtParam getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(SettleExtParam extendParam) {
		this.extendParam = extendParam;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRoyaltyMode() {
		return this.royaltyMode;
	}
	public void setRoyaltyMode(String royaltyMode) {
		this.royaltyMode = royaltyMode;
	}

	public RoyaltyDetailInfoPojo getRoyaltyParam() {
		return this.royaltyParam;
	}
	public void setRoyaltyParam(RoyaltyDetailInfoPojo royaltyParam) {
		this.royaltyParam = royaltyParam;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
