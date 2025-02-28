package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子小票订单模型
 *
 * @author auto create
 * @since 1.0, 2022-11-30 17:12:48
 */
public class ReceiptSimpleOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 6761193895839854291L;

	/**
	 * 支付宝支付方式对应支付金额
	 */
	@ApiField("alipay_amount")
	private Long alipayAmount;

	/**
	 * 支付宝支付方式对应的支付金额;
	 */
	@ApiField("alipay_amout")
	private Long alipayAmout;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 订单原价金额，单位为元;
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种（CNY-人命币）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 优惠金额。 如果为空，则默认都没有优惠金额; 有优惠信息，必填
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 有订单优惠信息; 如果为空，则默认都没有优惠信息; 有优惠信息时，必填
	 */
	@ApiListField("discount_info_list")
	@ApiField("discount_info_data_d_t_o")
	private List<DiscountInfoDataDTO> discountInfoList;

	/**
	 * 商户开发票链接。
	 */
	@ApiField("invoice_entry")
	private String invoiceEntry;

	/**
	 * 商户商品信息列表;
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_info_d_t_o")
	private List<ItemOrderInfoDTO> itemOrderList;

	/**
	 * 商家扩展信息
	 */
	@ApiField("merchant_extend_info")
	private ReceiptMerchantExtendInfo merchantExtendInfo;

	/**
	 * 商户名字
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单创建时间; 时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * APPID,商户可自定义需要跳转到小程序（默认进入小程序首页）
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 订单修改时间，一般不需要传入。用于订单状态或数据变化较快的顺序控制，order_modified_time较晚的同步会被最终存储，order_modified_time相同的两次同步可能会被幂等处理，FMCG按照行业标准化接入场景必须传入该字段控制乱序; 时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 订单支付时间，当pay_channel为非ALIPAY时，且订单状态已流转到“支付”或支付后时，需要将支付时间传入;支付交易完成时，必填；时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 每次请求必传;所有订单类型枚举: 快消:FMCG; 酒店:HOTEL; 智能售卖:AUTOMAT; 景区:RESORT;高校:HIGHSCHOOL;品牌：FASHION; 商圈综合体:MALL; 充电宝:POWERBANK; 物流:LOGISTICS
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 其它支付金额；如果有除支付宝支付方式以外的所有支付方式金额(包括各类卡，现金等)，必填
	 */
	@ApiField("other_pay_amount")
	private Long otherPayAmount;

	/**
	 * 外部商户订单号;out_biz_no唯一对应一笔订单，相同的订单需传入相同的out_biz_no
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付金额，需要实际支付的金额。如果不涉及金额可不传入该字段，其他场景必填; 0元订单时，必填;
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付类型:alipay:支付宝，otherpay：其它; 支付宝支付时，必填; 
森林能量发放仅支持支付宝支付("alipay")和0元订单("otherpay")
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店联系方式
	 */
	@ApiField("shop_contract")
	private String shopContract;

	/**
	 * 门店名称; 拥有门店的场景时，展示; 否则无法展示门店信息
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 商户类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 订单所对应的支付宝交易号; 支付宝支付时，必填; 特殊情况:  无支付场景时，可不填;
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易号类型:1. TRADE-交易，为空默认为TRADE;2. TRANSFER-转账;3. ENTRUST-受托;
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Long getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(Long alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public Long getAlipayAmout() {
		return this.alipayAmout;
	}
	public void setAlipayAmout(Long alipayAmout) {
		this.alipayAmout = alipayAmout;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<DiscountInfoDataDTO> getDiscountInfoList() {
		return this.discountInfoList;
	}
	public void setDiscountInfoList(List<DiscountInfoDataDTO> discountInfoList) {
		this.discountInfoList = discountInfoList;
	}

	public String getInvoiceEntry() {
		return this.invoiceEntry;
	}
	public void setInvoiceEntry(String invoiceEntry) {
		this.invoiceEntry = invoiceEntry;
	}

	public List<ItemOrderInfoDTO> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrderInfoDTO> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public ReceiptMerchantExtendInfo getMerchantExtendInfo() {
		return this.merchantExtendInfo;
	}
	public void setMerchantExtendInfo(ReceiptMerchantExtendInfo merchantExtendInfo) {
		this.merchantExtendInfo = merchantExtendInfo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderLink() {
		return this.orderLink;
	}
	public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
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

	public Long getOtherPayAmount() {
		return this.otherPayAmount;
	}
	public void setOtherPayAmount(Long otherPayAmount) {
		this.otherPayAmount = otherPayAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopContract() {
		return this.shopContract;
	}
	public void setShopContract(String shopContract) {
		this.shopContract = shopContract;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
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
