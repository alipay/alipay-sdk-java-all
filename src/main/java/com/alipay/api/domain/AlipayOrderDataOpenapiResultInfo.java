package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2020-06-20 11:00:36
 */
public class AlipayOrderDataOpenapiResultInfo extends AlipayObject {

	private static final long serialVersionUID = 8251439169856474727L;

	/**
	 * 订单金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务号列表
注：biz_type目前仅支持"TRADE_NO"
	 */
	@ApiListField("biz_no_list")
	@ApiField("string")
	private List<String> bizNoList;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 总的订单优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 具体已开放平台文档为准，若无，则目前不存在扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 订单支付时间
若订单还未支付，则该字段为空
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_order_info_result")
	private List<ItemOrderInfoResult> itemList;

	/**
	 * 订单物流信息列表
	 */
	@ApiListField("logistics_info_list")
	@ApiField("order_logistics_information")
	private List<OrderLogisticsInformation> logisticsInfoList;

	/**
	 * 商户订单业务类型
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 商户订单链接地址
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 外部订单号 out_biz_no唯一对应一笔订单
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 商户的uid，即所需查询订单的partnerId
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 支付宝小程序订单详情地址链接
	 */
	@ApiField("order_detail_link_page")
	private String orderDetailLinkPage;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态
PAID-已支付
MERCHANT_CONFIRMED-已确认
MERCHENT_SERVICING-服务中
MERCHANT_DELIVERD-已发货
MERCHANT_FINISHED-服务完成
REFUNDED-已退款
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型，SERVICE_ORDER：服务订单 -TRADE_ORDER：交易订单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户前置额外费用
	 */
	@ApiField("pre_cost")
	private PreAmountInfoResult preCost;

	/**
	 * 商户前置营销优惠
	 */
	@ApiField("pre_promotion")
	private PreAmountInfoResult prePromotion;

	/**
	 * 买家实付金额
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private OrderShopInfoResult shopInfo;

	/**
	 * 凭证信息
	 */
	@ApiField("ticket_info")
	private TicketInfoResult ticketInfo;

	/**
	 * 小程序appid
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	/**
	 * 小程序应用logo
	 */
	@ApiField("tiny_app_logo")
	private String tinyAppLogo;

	/**
	 * 小程序名称
	 */
	@ApiField("tiny_app_name")
	private String tinyAppName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<String> getBizNoList() {
		return this.bizNoList;
	}
	public void setBizNoList(List<String> bizNoList) {
		this.bizNoList = bizNoList;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
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

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public List<ItemOrderInfoResult> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemOrderInfoResult> itemList) {
		this.itemList = itemList;
	}

	public List<OrderLogisticsInformation> getLogisticsInfoList() {
		return this.logisticsInfoList;
	}
	public void setLogisticsInfoList(List<OrderLogisticsInformation> logisticsInfoList) {
		this.logisticsInfoList = logisticsInfoList;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOrderDetailLinkPage() {
		return this.orderDetailLinkPage;
	}
	public void setOrderDetailLinkPage(String orderDetailLinkPage) {
		this.orderDetailLinkPage = orderDetailLinkPage;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public PreAmountInfoResult getPreCost() {
		return this.preCost;
	}
	public void setPreCost(PreAmountInfoResult preCost) {
		this.preCost = preCost;
	}

	public PreAmountInfoResult getPrePromotion() {
		return this.prePromotion;
	}
	public void setPrePromotion(PreAmountInfoResult prePromotion) {
		this.prePromotion = prePromotion;
	}

	public String getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public OrderShopInfoResult getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(OrderShopInfoResult shopInfo) {
		this.shopInfo = shopInfo;
	}

	public TicketInfoResult getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(TicketInfoResult ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

	public String getTinyAppLogo() {
		return this.tinyAppLogo;
	}
	public void setTinyAppLogo(String tinyAppLogo) {
		this.tinyAppLogo = tinyAppLogo;
	}

	public String getTinyAppName() {
		return this.tinyAppName;
	}
	public void setTinyAppName(String tinyAppName) {
		this.tinyAppName = tinyAppName;
	}

}
