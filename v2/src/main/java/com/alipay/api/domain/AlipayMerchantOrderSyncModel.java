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
 * @since 1.0, 2024-06-14 21:55:16
 */
public class AlipayMerchantOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5563318351697354863L;

	/**
	 * 订单总金额：某笔交易订单优惠前的总金额，单位为【元】</br>
<a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*UuuWRpmekegAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例一</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*kBkOTZpqP40AAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例二</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*ZpkjTJQlFVAAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例三</a>
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 买家userId
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家信息
	 */
	@ApiField("buyer_info")
	private UserInfomation buyerInfo;

	/**
	 * 用户open_id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 标准服务类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商户总计优惠金额：代表商户侧给予用户的总计优惠金额 （不包含选择支付宝付款时，支付宝给予的优惠减免金额），单位为【元】。</br>
<a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*UuuWRpmekegAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例一</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*kBkOTZpqP40AAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例二</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*ZpkjTJQlFVAAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例三</a>
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单优惠信息
	 */
	@ApiListField("discount_info_list")
	@ApiField("discount_info_data")
	private List<DiscountInfoData> discountInfoList;

	/**
	 * 扩展信息，请参见 <a href="https://opendocs.alipay.com/mini/04zsxt?pathHash=654d4f10">小程序订单中心模板</a>
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
	 * 行程信息
	 */
	@ApiListField("journey_order_list")
	@ApiField("order_journey_info")
	private List<OrderJourneyInfo> journeyOrderList;

	/**
	 * 物流信息列表
	 */
	@ApiListField("logistics_info_list")
	@ApiField("order_logistics_information_request")
	private List<OrderLogisticsInformationRequest> logisticsInfoList;

	/**
	 * 本字段已废弃，无需填写！ 当前字段已废弃(本字段已废弃 不再使用)
	 */
	@ApiField("order_auth_code")
	@Deprecated
	private String orderAuthCode;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 订单支付时间
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 订单类型
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
	 * 交易对应的签约商户userId 当前字段已废弃(注意：该字段自2020-02-16日起，可以不传入)
	 */
	@ApiField("partner_id")
	@Deprecated
	private String partnerId;

	/**
	 * 用户应付金额 ：用户最终结算时需要支付金额（不包含选择支付宝付款时，支付宝给予的优惠减免金额），单位为【元】</br>
<a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*UuuWRpmekegAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例一</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*kBkOTZpqP40AAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例二</a>
<br><a href="https://mdn.alipayobjects.com/portal_ykdvdu/afts/img/A*ZpkjTJQlFVAAAAAAAAAAAAAAAQAAAQ/original" target="_blank">实际案例三</a>
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付超时时间，超过时间支付宝自行关闭订单
	 */
	@ApiField("pay_timeout_express")
	private String payTimeoutExpress;

	/**
	 * 商户订单同步记录id 当前字段已废弃(仅部分存量接入和行业模板需要外，其他情况可以不传入)
	 */
	@ApiField("record_id")
	@Deprecated
	private String recordId;

	/**
	 * 卖家userId 当前字段已废弃(注意：该字段自2020-02-16日起，可以不传入)
	 */
	@ApiField("seller_id")
	@Deprecated
	private String sellerId;

	/**
	 * 是否需要小程序订单代理发送模版消息。不传默认不发送
	 */
	@ApiField("send_msg")
	private String sendMsg;

	/**
	 * 服务code：传入小程序后台提报的服务id，将订单与服务关联，有利于提高服务曝光机会；入参服务id的类目须与订单类型相符，若不相符将会报错；如订单类型为“外卖”，则入参的服务ID所对应的服务类目也必须得是”外卖“；service_code 通过 <a href="https://opendocs.alipay.com/mini/e1c835a1_alipay.open.app.service.apply" target="_blank">alipay.open.app.service.apply</a> ，(服务提报申请)接口创建服务后获取。
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 门店信息，扫码点餐获取返佣时必填。
	 */
	@ApiField("shop_info")
	private OrderShopInfo shopInfo;

	/**
	 * 用于区分用户下单的订单来源
	 */
	@ApiField("source_app")
	private String sourceApp;

	/**
	 * 同步内容
	 */
	@ApiField("sync_content")
	private String syncContent;

	/**
	 * 凭证信息（废弃，凭证信息参考ticket_order_list） 当前字段已废弃(可使用 ticket_order_list 替代)
	 */
	@ApiField("ticket_info")
	@Deprecated
	private TicketInfo ticketInfo;

	/**
	 * 凭证信息
	 */
	@ApiListField("ticket_order_list")
	@ApiField("ticket_order_info")
	private List<TicketOrderInfo> ticketOrderList;

	/**
	 * 订单所对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易号类型
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

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<DiscountInfoData> getDiscountInfoList() {
		return this.discountInfoList;
	}
	public void setDiscountInfoList(List<DiscountInfoData> discountInfoList) {
		this.discountInfoList = discountInfoList;
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

	public List<OrderJourneyInfo> getJourneyOrderList() {
		return this.journeyOrderList;
	}
	public void setJourneyOrderList(List<OrderJourneyInfo> journeyOrderList) {
		this.journeyOrderList = journeyOrderList;
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

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
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

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public OrderShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(OrderShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public String getSourceApp() {
		return this.sourceApp;
	}
	public void setSourceApp(String sourceApp) {
		this.sourceApp = sourceApp;
	}

	public String getSyncContent() {
		return this.syncContent;
	}
	public void setSyncContent(String syncContent) {
		this.syncContent = syncContent;
	}

	public TicketInfo getTicketInfo() {
		return this.ticketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}

	public List<TicketOrderInfo> getTicketOrderList() {
		return this.ticketOrderList;
	}
	public void setTicketOrderList(List<TicketOrderInfo> ticketOrderList) {
		this.ticketOrderList = ticketOrderList;
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
