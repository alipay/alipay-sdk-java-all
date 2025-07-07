package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心卡使用明细详情列表
 *
 * @author auto create
 * @since 1.0, 2024-10-18 17:34:19
 */
public class AnxinkaDeliverDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 8198287492863129243L;

	/**
	 * 代运营服务商佣金，单位：元。精确到小数点后两位
	 */
	@ApiField("agent_commission")
	private String agentCommission;

	/**
	 * 代运营服务商名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 安心卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 退代运营服务商的佣金，单位：元。小数点后保留两位
	 */
	@ApiField("refund_agent_commission")
	private String refundAgentCommission;

	/**
	 * 安心付金额卡每笔退，卡使用扣除面额。单位：元，精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 安心付金额卡每笔退，卡使用扣除实付面额。单位：元，精确到小数点后两位
	 */
	@ApiField("refund_cash")
	private String refundCash;

	/**
	 * 退给saas服务商的佣金，单位：元。精确到小数点后两位
	 */
	@ApiField("refund_saas_commission")
	private String refundSaasCommission;

	/**
	 * 安心付金额卡每笔退款时间， 单位：秒。
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * saas服务商佣金，单位：元。精确到小数点后两位
	 */
	@ApiField("saas_commission")
	private String saasCommission;

	/**
	 * 参与分账的saas服务商名称
	 */
	@ApiField("saas_name")
	private String saasName;

	/**
	 * 结算时的批次号
	 */
	@ApiField("settle_batch_no")
	private String settleBatchNo;

	/**
	 * 安心付金额卡每笔使用收单商家账号
	 */
	@ApiField("settle_pid")
	private String settlePid;

	/**
	 * 安心付金额卡当前使用的核销门店的ID。
	 */
	@ApiField("settle_shop_id")
	private String settleShopId;

	/**
	 * 安心付金额卡当前使用的核销门店的门店备注名。
	 */
	@ApiField("settle_shop_memo")
	private String settleShopMemo;

	/**
	 * 安心付金额卡当前使用的核销门店的名称
	 */
	@ApiField("settle_shop_name")
	private String settleShopName;

	/**
	 * 第三方结算金额，单位：元。精确到小数点后两位
产生场景，例如担保服务提前支取，造成核销时会有提前结算金额
	 */
	@ApiField("third_settlement_amount")
	private String thirdSettlementAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 安心付金额卡每笔使用，卡使用扣除面额。单位：元，精确到小数点后两位。
	 */
	@ApiField("use_amount")
	private String useAmount;

	/**
	 * 安心付金额卡每笔使用，卡使用扣除实付面额。单位：元，精确到小数点后两位
	 */
	@ApiField("use_cash")
	private String useCash;

	/**
	 * 安心付金额卡每笔使用状态，如已使用、已退款，是一个状态表示。
	 */
	@ApiField("use_status")
	private String useStatus;

	/**
	 * 安心付金额卡每笔使用时间，单位：秒。
	 */
	@ApiField("use_time")
	private Date useTime;

	public String getAgentCommission() {
		return this.agentCommission;
	}
	public void setAgentCommission(String agentCommission) {
		this.agentCommission = agentCommission;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRefundAgentCommission() {
		return this.refundAgentCommission;
	}
	public void setRefundAgentCommission(String refundAgentCommission) {
		this.refundAgentCommission = refundAgentCommission;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundCash() {
		return this.refundCash;
	}
	public void setRefundCash(String refundCash) {
		this.refundCash = refundCash;
	}

	public String getRefundSaasCommission() {
		return this.refundSaasCommission;
	}
	public void setRefundSaasCommission(String refundSaasCommission) {
		this.refundSaasCommission = refundSaasCommission;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getSaasCommission() {
		return this.saasCommission;
	}
	public void setSaasCommission(String saasCommission) {
		this.saasCommission = saasCommission;
	}

	public String getSaasName() {
		return this.saasName;
	}
	public void setSaasName(String saasName) {
		this.saasName = saasName;
	}

	public String getSettleBatchNo() {
		return this.settleBatchNo;
	}
	public void setSettleBatchNo(String settleBatchNo) {
		this.settleBatchNo = settleBatchNo;
	}

	public String getSettlePid() {
		return this.settlePid;
	}
	public void setSettlePid(String settlePid) {
		this.settlePid = settlePid;
	}

	public String getSettleShopId() {
		return this.settleShopId;
	}
	public void setSettleShopId(String settleShopId) {
		this.settleShopId = settleShopId;
	}

	public String getSettleShopMemo() {
		return this.settleShopMemo;
	}
	public void setSettleShopMemo(String settleShopMemo) {
		this.settleShopMemo = settleShopMemo;
	}

	public String getSettleShopName() {
		return this.settleShopName;
	}
	public void setSettleShopName(String settleShopName) {
		this.settleShopName = settleShopName;
	}

	public String getThirdSettlementAmount() {
		return this.thirdSettlementAmount;
	}
	public void setThirdSettlementAmount(String thirdSettlementAmount) {
		this.thirdSettlementAmount = thirdSettlementAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

	public String getUseCash() {
		return this.useCash;
	}
	public void setUseCash(String useCash) {
		this.useCash = useCash;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public Date getUseTime() {
		return this.useTime;
	}
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

}
