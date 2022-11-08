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
 * @since 1.0, 2022-11-03 17:59:27
 */
public class EcomOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 5169344595247846691L;

	/**
	 * 实际支付金额
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
	 * 优惠金额
	 */
	@ApiField("discount_fee")
	private Long discountFee;

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
	 * 订单金额
	 */
	@ApiField("order_fee")
	private Long orderFee;

	/**
	 * 订单id，必填
	 */
	@ApiField("order_id")
	private String orderId;

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
	 * 邮费
	 */
	@ApiField("post_fee")
	private Long postFee;

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

	public Long getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(Long discountFee) {
		this.discountFee = discountFee;
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

	public Date getTradeStartTime() {
		return this.tradeStartTime;
	}
	public void setTradeStartTime(Date tradeStartTime) {
		this.tradeStartTime = tradeStartTime;
	}

}
