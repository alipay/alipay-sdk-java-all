package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询售卖订单结果
 *
 * @author auto create
 * @since 1.0, 2024-08-06 10:15:50
 */
public class CardOrderBatchQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 6212127575186851234L;

	/**
	 * 金额卡余额面值，单位分
	 */
	@ApiField("available_amount")
	private Long availableAmount;

	/**
	 * 用于区分订购单的取消类型
	 */
	@ApiField("cancel_type")
	private String cancelType;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 售卖订单状态 ● 次卡/周期卡 ○ 订购中:init ○ 可使用:available ○ 已用完:used_up ○ 关闭中:closing ○ 已关闭:closed ● 金额卡 ○ 可使用:available ○ 已失效：invalid ○ 已支付：paid ○ 已退款：refund ○ 超时关闭：timeout_closed ○ 已用完:used_up
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 卡ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 订单有效期开始时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 订单有效期结束时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户购买商品时的原价（面额），单位分
	 */
	@ApiField("origin_price_total")
	private Long originPriceTotal;

	/**
	 * 用于商户/服务商在插件商品详情页的自定义参数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 剩余期数(次数)
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 用户购买商品时的实际价格（售价），单位分
	 */
	@ApiField("sale_price_total")
	private Long salePriceTotal;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 总期数(次数)
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 金额卡余额现金价值，单位分
	 */
	@ApiField("usable_cash")
	private Long usableCash;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 脱敏后的用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public Long getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getCancelType() {
		return this.cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Long getOriginPriceTotal() {
		return this.originPriceTotal;
	}
	public void setOriginPriceTotal(Long originPriceTotal) {
		this.originPriceTotal = originPriceTotal;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public Long getSalePriceTotal() {
		return this.salePriceTotal;
	}
	public void setSalePriceTotal(Long salePriceTotal) {
		this.salePriceTotal = salePriceTotal;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getUsableCash() {
		return this.usableCash;
	}
	public void setUsableCash(Long usableCash) {
		this.usableCash = usableCash;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
