package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金额卡核销订单
 *
 * @author auto create
 * @since 1.0, 2025-07-07 09:47:35
 */
public class MoneyCardUseRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 3838748578143749367L;

	/**
	 * 金额，对应金额卡实际核销金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用信息集合
	 */
	@ApiListField("bill_fee_info_list")
	@ApiField("bill_fee_info")
	private List<BillFeeInfo> billFeeInfoList;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 现金价值，对应金额卡实际出资部分，单位：分
	 */
	@ApiField("cash")
	private String cash;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件业务单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 金额卡归属人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 核销退款金额（单位分）
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 核销退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 售卖门店对应的外部门店编号
	 */
	@ApiField("sell_rel_shop_id")
	private String sellRelShopId;

	/**
	 * 售卖门店id
	 */
	@ApiField("sell_shop_id")
	private String sellShopId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 收单pid
	 */
	@ApiField("trade_pid")
	private String tradePid;

	/**
	 * 面额价，单位：分
	 */
	@ApiField("use_amount")
	private Long useAmount;

	/**
	 * 核销门店对应的外部门店id
	 */
	@ApiField("use_rel_shop_id")
	private String useRelShopId;

	/**
	 * 核销门店id
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	/**
	 * 核销门店名
	 */
	@ApiField("use_shop_name")
	private String useShopName;

	/**
	 * 核销门店备注
	 */
	@ApiField("use_shop_note")
	private String useShopNote;

	/**
	 * 核销支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<BillFeeInfo> getBillFeeInfoList() {
		return this.billFeeInfoList;
	}
	public void setBillFeeInfoList(List<BillFeeInfo> billFeeInfoList) {
		this.billFeeInfoList = billFeeInfoList;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCash() {
		return this.cash;
	}
	public void setCash(String cash) {
		this.cash = cash;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getOwnerUid() {
		return this.ownerUid;
	}
	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getSellRelShopId() {
		return this.sellRelShopId;
	}
	public void setSellRelShopId(String sellRelShopId) {
		this.sellRelShopId = sellRelShopId;
	}

	public String getSellShopId() {
		return this.sellShopId;
	}
	public void setSellShopId(String sellShopId) {
		this.sellShopId = sellShopId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradePid() {
		return this.tradePid;
	}
	public void setTradePid(String tradePid) {
		this.tradePid = tradePid;
	}

	public Long getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(Long useAmount) {
		this.useAmount = useAmount;
	}

	public String getUseRelShopId() {
		return this.useRelShopId;
	}
	public void setUseRelShopId(String useRelShopId) {
		this.useRelShopId = useRelShopId;
	}

	public String getUseShopId() {
		return this.useShopId;
	}
	public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}

	public String getUseShopName() {
		return this.useShopName;
	}
	public void setUseShopName(String useShopName) {
		this.useShopName = useShopName;
	}

	public String getUseShopNote() {
		return this.useShopNote;
	}
	public void setUseShopNote(String useShopNote) {
		this.useShopNote = useShopNote;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
