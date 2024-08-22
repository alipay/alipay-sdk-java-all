package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金额卡使用记录详情
 *
 * @author auto create
 * @since 1.0, 2024-07-30 14:22:35
 */
public class MoneyCardUseRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 3549255867826183195L;

	/**
	 * 金额，对应金额卡实际核销金额，单位分
	 */
	@ApiField("amount")
	private String amount;

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
	 * 现金价值，对应金额卡实际出资部分，单位分
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
	 * 平台订单id
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
