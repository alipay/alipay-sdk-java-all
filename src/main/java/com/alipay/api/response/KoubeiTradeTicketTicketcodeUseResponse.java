package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbTicketUseDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.use response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-03 17:22:43
 */
public class KoubeiTradeTicketTicketcodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5854735215334527412L;

	/** 
	 * 该字段用于描述本次返回中的业务属性，现有：BIZ_ALREADY_SUCCESS（幂等业务码）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 用户购买券的时候实际支付的金额，单位为元，精确到小数点后两位，一次性核销多份券场景，返回总实际支付金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 用户购买时商品的现价，单位为元，精确到小数点后两位
	 */
	@ApiField("current_price")
	private String currentPrice;

	/** 
	 * 商家优惠金额，单位为元，精确到小数点后两位，一次性核销多份券场景，返回总商家优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 交易中可给用户开具发票的金额，单位为元，精确到小数点后两位，一次性核销多份券场景，返回总开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 凭证对应商品别名，在口碑商品创建时候设置
	 */
	@ApiField("item_alias")
	private String itemAlias;

	/** 
	 * 口碑商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 用户购买时商品的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 口碑补贴金额，单位为元，精确到小数点后两位，一次性核销多份券场景，返回总口碑补贴金额
	 */
	@ApiField("koubei_subsidy_amount")
	private String koubeiSubsidyAmount;

	/** 
	 * 凭证码所属的订单id
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户购买时商品的原价，单位为元，精确到小数点后两位
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 商家实收金额，单位为元，精确到小数点后两位，一次性核销多份券场景，返回总商家实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/** 
	 * 核销流水号
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	/** 
	 * 非次卡一次性核销多份场景，被核销的凭证明细信息
	 */
	@ApiListField("ticket_use_details")
	@ApiField("kb_ticket_use_detail")
	private List<KbTicketUseDetail> ticketUseDetails;

	/** 
	 * 天猫商品ID
	 */
	@ApiField("tm_item_id")
	private String tmItemId;

	/** 
	 * 券核销时间
	 */
	@ApiField("use_date")
	private String useDate;

	/** 
	 * 券核销门店ID
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	/** 
	 * 券核销门店名称
	 */
	@ApiField("use_shop_name")
	private String useShopName;

	/** 
	 * 凭证码对应的凭证资产id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getCurrentPrice( ) {
		return this.currentPrice;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setItemAlias(String itemAlias) {
		this.itemAlias = itemAlias;
	}
	public String getItemAlias( ) {
		return this.itemAlias;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setKoubeiSubsidyAmount(String koubeiSubsidyAmount) {
		this.koubeiSubsidyAmount = koubeiSubsidyAmount;
	}
	public String getKoubeiSubsidyAmount( ) {
		return this.koubeiSubsidyAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public String getTicketCode( ) {
		return this.ticketCode;
	}

	public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}
	public String getTicketTransId( ) {
		return this.ticketTransId;
	}

	public void setTicketUseDetails(List<KbTicketUseDetail> ticketUseDetails) {
		this.ticketUseDetails = ticketUseDetails;
	}
	public List<KbTicketUseDetail> getTicketUseDetails( ) {
		return this.ticketUseDetails;
	}

	public void setTmItemId(String tmItemId) {
		this.tmItemId = tmItemId;
	}
	public String getTmItemId( ) {
		return this.tmItemId;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}
	public String getUseDate( ) {
		return this.useDate;
	}

	public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}
	public String getUseShopId( ) {
		return this.useShopId;
	}

	public void setUseShopName(String useShopName) {
		this.useShopName = useShopName;
	}
	public String getUseShopName( ) {
		return this.useShopName;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
