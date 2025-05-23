package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景开放平台电商订单模型
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:08:56
 */
public class EcomOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 4817942645125319699L;

	/**
	 * 实际支付金额，单位：分
	 */
	@ApiField("actual_pay_fee")
	private Long actualPayFee;

	/**
	 * 订单属性标
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * 购买数量
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 充电时长，分钟维度
	 */
	@ApiField("charge_duration")
	private InsPeriodDTO chargeDuration;

	/**
	 * 充电保障方案类型 (FREQUENCY/MONTH/YEAR)为空时默认为FREQUENCY
	 */
	@ApiField("charge_guarantee_plan_type")
	private String chargeGuaranteePlanType;

	/**
	 * 免押金额，单位：分
	 */
	@ApiField("credit_deposit_money")
	private Long creditDepositMoney;

	/**
	 * 优惠金额，单位：分
	 */
	@ApiField("discount_fee")
	private Long discountFee;

	/**
	 * 驾驶人列表
	 */
	@ApiListField("drivers")
	@ApiField("ins_open_user_d_t_o")
	private List<InsOpenUserDTO> drivers;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 交易创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片
	 */
	@ApiField("item_pict_url")
	private String itemPictUrl;

	/**
	 * 商品单价
	 */
	@ApiField("item_price")
	private Long itemPrice;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 商品总价值，单位：分
	 */
	@ApiField("item_total_value")
	private Long itemTotalValue;

	/**
	 * 行程列表
	 */
	@ApiField("itineraries")
	private InsTransportItineraryDTO itineraries;

	/**
	 * 出租人
	 */
	@ApiField("leaser")
	private InsOpenUserDTO leaser;

	/**
	 * 物流单
	 */
	@ApiField("logistics_order")
	private EcomLogisticsOrderDTO logisticsOrder;

	/**
	 * 主订单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	/**
	 * 订单结束时间
	 */
	@ApiField("order_end_time")
	private Date orderEndTime;

	/**
	 * 订单金额,单位：分
	 */
	@ApiField("order_fee")
	private Long orderFee;

	/**
	 * 订单id，必填
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单开始时间
	 */
	@ApiField("order_start_time")
	private Date orderStartTime;

	/**
	 * 订单类型：MAIN_AND_DETAIL（主子一体订单）, MAIN（主订单）,DETAIL（子订单）
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 支付单
	 */
	@ApiField("pay_order")
	private PayOrderDTO payOrder;

	/**
	 * 邮费,单位：分
	 */
	@ApiField("post_fee")
	private Long postFee;

	/**
	 * 订单商家物流寄件方式
	 */
	@ApiField("post_type")
	private String postType;

	/**
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 卖家昵称
	 */
	@ApiField("seller_nick")
	private String sellerNick;

	/**
	 * 子订单列表
	 */
	@ApiListField("sub_order_list")
	@ApiField("ecom_sub_order_d_t_o")
	private List<EcomSubOrderDTO> subOrderList;

	/**
	 * 交易天数
	 */
	@ApiField("trade_days")
	private Long tradeDays;

	/**
	 * 交易结束时间
	 */
	@ApiField("trade_end_time")
	private Date tradeEndTime;

	/**
	 * 交易图片
	 */
	@ApiListField("trade_pictures")
	@ApiField("string")
	private List<String> tradePictures;

	/**
	 * 交易开始时间
	 */
	@ApiField("trade_start_time")
	private Date tradeStartTime;

	public Long getActualPayFee() {
		return this.actualPayFee;
	}
	public void setActualPayFee(Long actualPayFee) {
		this.actualPayFee = actualPayFee;
	}

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public InsPeriodDTO getChargeDuration() {
		return this.chargeDuration;
	}
	public void setChargeDuration(InsPeriodDTO chargeDuration) {
		this.chargeDuration = chargeDuration;
	}

	public String getChargeGuaranteePlanType() {
		return this.chargeGuaranteePlanType;
	}
	public void setChargeGuaranteePlanType(String chargeGuaranteePlanType) {
		this.chargeGuaranteePlanType = chargeGuaranteePlanType;
	}

	public Long getCreditDepositMoney() {
		return this.creditDepositMoney;
	}
	public void setCreditDepositMoney(Long creditDepositMoney) {
		this.creditDepositMoney = creditDepositMoney;
	}

	public Long getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(Long discountFee) {
		this.discountFee = discountFee;
	}

	public List<InsOpenUserDTO> getDrivers() {
		return this.drivers;
	}
	public void setDrivers(List<InsOpenUserDTO> drivers) {
		this.drivers = drivers;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemPictUrl() {
		return this.itemPictUrl;
	}
	public void setItemPictUrl(String itemPictUrl) {
		this.itemPictUrl = itemPictUrl;
	}

	public Long getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Long getItemTotalValue() {
		return this.itemTotalValue;
	}
	public void setItemTotalValue(Long itemTotalValue) {
		this.itemTotalValue = itemTotalValue;
	}

	public InsTransportItineraryDTO getItineraries() {
		return this.itineraries;
	}
	public void setItineraries(InsTransportItineraryDTO itineraries) {
		this.itineraries = itineraries;
	}

	public InsOpenUserDTO getLeaser() {
		return this.leaser;
	}
	public void setLeaser(InsOpenUserDTO leaser) {
		this.leaser = leaser;
	}

	public EcomLogisticsOrderDTO getLogisticsOrder() {
		return this.logisticsOrder;
	}
	public void setLogisticsOrder(EcomLogisticsOrderDTO logisticsOrder) {
		this.logisticsOrder = logisticsOrder;
	}

	public String getMainOrderId() {
		return this.mainOrderId;
	}
	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
	}

	public Date getOrderEndTime() {
		return this.orderEndTime;
	}
	public void setOrderEndTime(Date orderEndTime) {
		this.orderEndTime = orderEndTime;
	}

	public Long getOrderFee() {
		return this.orderFee;
	}
	public void setOrderFee(Long orderFee) {
		this.orderFee = orderFee;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderStartTime() {
		return this.orderStartTime;
	}
	public void setOrderStartTime(Date orderStartTime) {
		this.orderStartTime = orderStartTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public PayOrderDTO getPayOrder() {
		return this.payOrder;
	}
	public void setPayOrder(PayOrderDTO payOrder) {
		this.payOrder = payOrder;
	}

	public Long getPostFee() {
		return this.postFee;
	}
	public void setPostFee(Long postFee) {
		this.postFee = postFee;
	}

	public String getPostType() {
		return this.postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public List<EcomSubOrderDTO> getSubOrderList() {
		return this.subOrderList;
	}
	public void setSubOrderList(List<EcomSubOrderDTO> subOrderList) {
		this.subOrderList = subOrderList;
	}

	public Long getTradeDays() {
		return this.tradeDays;
	}
	public void setTradeDays(Long tradeDays) {
		this.tradeDays = tradeDays;
	}

	public Date getTradeEndTime() {
		return this.tradeEndTime;
	}
	public void setTradeEndTime(Date tradeEndTime) {
		this.tradeEndTime = tradeEndTime;
	}

	public List<String> getTradePictures() {
		return this.tradePictures;
	}
	public void setTradePictures(List<String> tradePictures) {
		this.tradePictures = tradePictures;
	}

	public Date getTradeStartTime() {
		return this.tradeStartTime;
	}
	public void setTradeStartTime(Date tradeStartTime) {
		this.tradeStartTime = tradeStartTime;
	}

}
