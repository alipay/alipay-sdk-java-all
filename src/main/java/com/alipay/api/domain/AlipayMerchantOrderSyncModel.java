package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单数据同步接口
 *
 * @author auto create
 * @since 1.0, 2020-06-22 14:31:03
 */
public class AlipayMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4499487527988118559L;

	/**
	 * 订单金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 买家userId
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * buyer_info与buyer_user_id必选其一
	 */
	@ApiField("buyer_info")
	private UserInfomation buyerInfo;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 扩展信息，请参见产品文档
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商品信息列表
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_info")
	private List<ItemOrderInfo> itemOrderList;

	/**
	 * 物流信息
列表最多支持物流信息个数，请参考产品文档
注：若该值不为空，且物流信息同步至我的快递，则在查询订单时可返回具体物流信息
	 */
	@ApiListField("logistics_info_list")
	@ApiField("order_logistics_information_request")
	private List<OrderLogisticsInformationRequest> logisticsInfoList;

	/**
	 * 订单授权码(与订单一一对应，不是请求维度的，服务订单首次同步必传）
利用订单同步前获取的formId作为订单授权码。订单授权码对应的小程序id与买家uid与同步订单的小程序id和买家uid一致
注：当order_type为SERVICE_ORDER时必填
	 */
	@ApiField("order_auth_code")
	private String orderAuthCode;

	/**
	 * 订单创建时间
当order_type为SERVICE_ORDER时必传
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单支付时间
当pay_channel为非ALIPAY时，且订单状态已流转到“支付”或支付后时，需要将支付时间传入
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 订单类型，若为空，默认为交易订单，每次请求必传
-SERVICE_ORDER：服务订单
-TRADE_ORDER：交易订单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部订单号
out_biz_no唯一对应一笔订单，相同的订单需传入相同的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易对应的签约商户userId
注意：该字段自2020-02-16日起，可以不传入
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付金额
需要实际支付的金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付超时时间，超过时间支付宝自行关闭订单
	 */
	@ApiField("pay_timeout_express")
	private String payTimeoutExpress;

	/**
	 * 商户订单同步记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 卖家userId
注意：该字段自2020-02-16日起，可以不传入
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 是否需要小程序订单代理发送模版消息，Y代表需要发送，N代表不需要发送，不传默认不发送
	 */
	@ApiField("send_msg")
	private String sendMsg;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private OrderShopInfo shopInfo;

	/**
	 * 凭证信息
	 */
	@ApiField("ticket_info")
	private TicketInfo ticketInfo;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易号类型
1. TRADE-交易，为空默认为TRADE
2. TRANSFER-转账
3. ENTRUST-受托
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public UserInfomation getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(UserInfomation buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<ItemOrderInfo> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrderInfo> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public List<OrderLogisticsInformationRequest> getLogisticsInfoList() {
		return this.logisticsInfoList;
	}
	public void setLogisticsInfoList(List<OrderLogisticsInformationRequest> logisticsInfoList) {
		this.logisticsInfoList = logisticsInfoList;
	}

	public String getOrderAuthCode() {
		return this.orderAuthCode;
	}
	public void setOrderAuthCode(String orderAuthCode) {
		this.orderAuthCode = orderAuthCode;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderPayTime() {
		return this.orderPayTime;
	}
	public void setOrderPayTime(Date orderPayTime) {
		this.orderPayTime = orderPayTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayTimeoutExpress() {
		return this.payTimeoutExpress;
	}
	public void setPayTimeoutExpress(String payTimeoutExpress) {
		this.payTimeoutExpress = payTimeoutExpress;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSendMsg() {
		return this.sendMsg;
	}
	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}

	public OrderShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(OrderShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public TicketInfo getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
