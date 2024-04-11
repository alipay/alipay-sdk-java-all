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
 * @since 1.0, 2024-01-11 21:56:14
 */
public class ReceiptOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 7425823259379488651L;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 订单金额，单位为元;
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 绿色能量发放归属的商户信息。
说明：
如果该复杂对象不填。则默认为该绿色能量发放的归属者是调用者本人。
如果填写，则认为该绿色能量发放的归属者是该商户。

限制:服务商身份接入时必传
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfoDTO belongMerchantInfo;

	/**
	 * 租借时长，精确到分钟;充电宝场景时，必填;
	 */
	@ApiField("borrow_time")
	private Long borrowTime;

	/**
	 * 买家信息
	 */
	@ApiField("buyer_info")
	private UserInformation buyerInfo;

	/**
	 * 币种（CNY-人民币）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 优惠金额。 如果为空，则默认都没有优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 订单优惠信息;电子小票场景时，必填
	 */
	@ApiListField("discount_info_list")
	@ApiField("discount_info_data_d_t_o")
	private List<DiscountInfoDataDTO> discountInfoList;

	/**
	 * 有对应环保类型 符合字段“environmental_ext"中的环保字典值时，则必填；除此之外的环保类型时，该字段为空。请务必准确对照，如有疑问，请联系业务经理。
	 */
	@ApiListField("environmental_info")
	@ApiField("enviromental_info_d_t_o")
	private List<EnviromentalInfoDTO> environmentalInfo;

	/**
	 * 临期食品商品列表，有临期食品时可填写，非必填。
	 */
	@ApiListField("good_expiration_list")
	@ApiField("good_expiration_list_d_t_o")
	private List<GoodExpirationListDTO> goodExpirationList;

	/**
	 * [
         {
            "cup_type": "zhiyinbei",
            "cups_amount": "1"
          }
 ]
	 */
	@ApiListField("green_cups_list")
	@ApiField("green_cups_d_t_o")
	private List<GreenCupsDTO> greenCupsList;

	/**
	 * 商家开发票链接
	 */
	@ApiField("invoice_entry")
	private String invoiceEntry;

	/**
	 * 对接电子小票/无纸化小票能量发放时，必填; 其它场景，无需该字段; 字段含义: 是否接入支付宝电子小票; "0":不接入(商户自己有电子小票终端)；"1":接入; 接入场景:必须传入小票全量商品信息，用于在支付宝侧电子小票阵地展示给到C端用户;  不接入的商户且商户自己有终端实现了电子小票, 可以对接无纸化小票能量; 为空时，默认:"0"
	 */
	@ApiField("is_alipay_ticket")
	private String isAlipayTicket;

	/**
	 * 订单商品信息列表; 使用支付宝电子小票时，必填;（is_alipay_ticket 是 "1"时，必填）
	 */
	@ApiListField("item_order_list")
	@ApiField("item_order_info_d_t_o")
	private List<ItemOrderInfoDTO> itemOrderList;

	/**
	 * 设备地理位置及坐标; 充电宝场景时，必填
	 */
	@ApiField("location")
	private String location;

	/**
	 * 物流信息; 订单信息包含物流信息时，必填; 列表最多支持物流信息个数;最大支持10个
注：若该值不为空，且物流信息同步至我的快递，则在查询订单时可返回具体物流信息
	 */
	@ApiListField("logistics_info_list")
	@ApiField("order_logistics_information_request_d_t_o")
	private List<OrderLogisticsInformationRequestDTO> logisticsInfoList;

	/**
	 * 商户名字
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单创建时间; 充电宝和酒店行业时，必填; 时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单商品列表; 环保行为:临期商品，补充替换包装
、再生塑料包装、FSC认证包装、该商品列表必填
	 */
	@ApiListField("order_goods_list")
	@ApiField("order_goods_d_t_o")
	private List<OrderGoodsDTO> orderGoodsList;

	/**
	 * APPID,商户可自定义需要跳转到小程序（默认进入小程序首页）
	 */
	@ApiField("order_link")
	private String orderLink;

	/**
	 * 订单修改时间，一般不需要传入。用于订单状态或数据变化较快的顺序控制，order_modified_time较晚的同步会被最终存储，order_modified_time相同的两次同步可能会被幂等处理，FMCG按照行业标准化接入场景必须传入该字段控制乱序;时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 订单支付时间; 有支付行为时，必填; 没有支付时，为空; 时间格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_pay_time")
	private Date orderPayTime;

	/**
	 * 每次请求必传;所有订单类型枚举: 快消:FMCG; 酒店:HOTEL; 智能 售卖:AUTOMAT; 景区:RESORT;高校:HIGHSCHOOL;品牌: FASHION; 商圈综合体:MALL; 充电宝:POWERBANK; 物流:LOGISTICS
	 */
	@ApiField("order_type")
	private String orderType;

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
	 * 支付类型:alipay:支付宝，cashpay：现金，otherpay：其它; 支付宝支付时，必填; 
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
	 * 门店名称; 拥有门店的场景时，必填; 否则无法展示门店信息
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 提供字典值
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 终端设备id;直饮水订单时，必填
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 订单所对应的支付宝交易号，酒店6小件场景时,传入履约号; 支付宝支付时，必填; 特殊情况: 0元订单, 可不填; 无支付场景时，可不填;
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易号类型:1. TRADE-交易，为空默认为TRADE;2. TRANSFER-转账;3. ENTRUST-受托;4.(酒店)履约-CONTRACT
	 */
	@ApiField("trade_type")
	private String tradeType;

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

	public BelongMerchantInfoDTO getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongMerchantInfoDTO belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public Long getBorrowTime() {
		return this.borrowTime;
	}
	public void setBorrowTime(Long borrowTime) {
		this.borrowTime = borrowTime;
	}

	public UserInformation getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(UserInformation buyerInfo) {
		this.buyerInfo = buyerInfo;
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

	public List<EnviromentalInfoDTO> getEnvironmentalInfo() {
		return this.environmentalInfo;
	}
	public void setEnvironmentalInfo(List<EnviromentalInfoDTO> environmentalInfo) {
		this.environmentalInfo = environmentalInfo;
	}

	public List<GoodExpirationListDTO> getGoodExpirationList() {
		return this.goodExpirationList;
	}
	public void setGoodExpirationList(List<GoodExpirationListDTO> goodExpirationList) {
		this.goodExpirationList = goodExpirationList;
	}

	public List<GreenCupsDTO> getGreenCupsList() {
		return this.greenCupsList;
	}
	public void setGreenCupsList(List<GreenCupsDTO> greenCupsList) {
		this.greenCupsList = greenCupsList;
	}

	public String getInvoiceEntry() {
		return this.invoiceEntry;
	}
	public void setInvoiceEntry(String invoiceEntry) {
		this.invoiceEntry = invoiceEntry;
	}

	public String getIsAlipayTicket() {
		return this.isAlipayTicket;
	}
	public void setIsAlipayTicket(String isAlipayTicket) {
		this.isAlipayTicket = isAlipayTicket;
	}

	public List<ItemOrderInfoDTO> getItemOrderList() {
		return this.itemOrderList;
	}
	public void setItemOrderList(List<ItemOrderInfoDTO> itemOrderList) {
		this.itemOrderList = itemOrderList;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public List<OrderLogisticsInformationRequestDTO> getLogisticsInfoList() {
		return this.logisticsInfoList;
	}
	public void setLogisticsInfoList(List<OrderLogisticsInformationRequestDTO> logisticsInfoList) {
		this.logisticsInfoList = logisticsInfoList;
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

	public List<OrderGoodsDTO> getOrderGoodsList() {
		return this.orderGoodsList;
	}
	public void setOrderGoodsList(List<OrderGoodsDTO> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
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

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
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
