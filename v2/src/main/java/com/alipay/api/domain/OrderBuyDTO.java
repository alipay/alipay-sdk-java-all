package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易购买订单请求模型
 *
 * @author auto create
 * @since 1.0, 2026-01-05 10:29:45
 */
public class OrderBuyDTO extends AlipayObject {

	private static final long serialVersionUID = 8798793553969634359L;

	/**
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private MiniReceiverAddressInfoDTO addressInfo;

	/**
	 * 分账条款
	 */
	@ApiField("alloc_amount_info")
	private AllocAmountInfoDTO allocAmountInfo;

	/**
	 * 订单确认收货相对超时时间。从发货时间开始计算。 单位d-天。 该参数数值不接受小数点， 如 10d
	 */
	@ApiField("confirm_timeout_express")
	private String confirmTimeoutExpress;

	/**
	 * 买家联系人信息
	 */
	@ApiField("contact_info")
	private ContactInfoDTO contactInfo;

	/**
	 * 芝麻信息
	 */
	@ApiField("credit_info")
	private CreditInfoDTO creditInfo;

	/**
	 * 默认退货地址
	 */
	@ApiField("default_receiving_address")
	private MiniReceiverAddressInfoDTO defaultReceivingAddress;

	/**
	 * 物流信息--预留字段
	 */
	@ApiField("delivery_detail")
	private LogisticsInfoDTO deliveryDetail;

	/**
	 * 订单扩展字段
	 */
	@ApiField("ext_info")
	private MiniOrderExtInfoDTO extInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单类型
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 订单信息
	 */
	@ApiField("order_detail")
	private MiniOrderDetailDTO orderDetail;

	/**
	 * 商户订单号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商家小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。同一笔订单的链接必须与第一次传入的地址相同，且需是小程序内部页面路径
	 */
	@ApiField("path")
	private String path;

	/**
	 * 卖家支付宝用户ID。收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID； 注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致； 如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；本地商品无需填写
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 发货地址信息
	 */
	@ApiField("send_address_info")
	private MiniOrderAddressInfoDTO sendAddressInfo;

	/**
	 * 签约资商通直付通平台商分账产品后，下单时传入平台模式，smid必传；此模式下支持服务商派单模式
	 */
	@ApiField("service_provider_model")
	private String serviceProviderModel;

	/**
	 * 订单服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private ShopInfoDTO shopInfo;

	/**
	 * 二级商户信息
	 */
	@ApiField("sub_merchant")
	private SubMerchantDTO subMerchant;

	/**
	 * 注意：不可使用特殊字符，如 /，=，& 等
	 */
	@ApiField("title")
	private String title;

	/**
	 * 收单appid；商家异收单主体情况下，当前功能不支持（当前默认下单主体为收单主体）；需要商家回传收单主体，实现真实交易流程；
	 */
	@ApiField("trade_app_id")
	private String tradeAppId;

	public MiniReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(MiniReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public AllocAmountInfoDTO getAllocAmountInfo() {
		return this.allocAmountInfo;
	}
	public void setAllocAmountInfo(AllocAmountInfoDTO allocAmountInfo) {
		this.allocAmountInfo = allocAmountInfo;
	}

	public String getConfirmTimeoutExpress() {
		return this.confirmTimeoutExpress;
	}
	public void setConfirmTimeoutExpress(String confirmTimeoutExpress) {
		this.confirmTimeoutExpress = confirmTimeoutExpress;
	}

	public ContactInfoDTO getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfoDTO contactInfo) {
		this.contactInfo = contactInfo;
	}

	public CreditInfoDTO getCreditInfo() {
		return this.creditInfo;
	}
	public void setCreditInfo(CreditInfoDTO creditInfo) {
		this.creditInfo = creditInfo;
	}

	public MiniReceiverAddressInfoDTO getDefaultReceivingAddress() {
		return this.defaultReceivingAddress;
	}
	public void setDefaultReceivingAddress(MiniReceiverAddressInfoDTO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}

	public LogisticsInfoDTO getDeliveryDetail() {
		return this.deliveryDetail;
	}
	public void setDeliveryDetail(LogisticsInfoDTO deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public MiniOrderExtInfoDTO getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MiniOrderExtInfoDTO extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public MiniOrderDetailDTO getOrderDetail() {
		return this.orderDetail;
	}
	public void setOrderDetail(MiniOrderDetailDTO orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public MiniOrderAddressInfoDTO getSendAddressInfo() {
		return this.sendAddressInfo;
	}
	public void setSendAddressInfo(MiniOrderAddressInfoDTO sendAddressInfo) {
		this.sendAddressInfo = sendAddressInfo;
	}

	public String getServiceProviderModel() {
		return this.serviceProviderModel;
	}
	public void setServiceProviderModel(String serviceProviderModel) {
		this.serviceProviderModel = serviceProviderModel;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public ShopInfoDTO getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(ShopInfoDTO shopInfo) {
		this.shopInfo = shopInfo;
	}

	public SubMerchantDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantDTO subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTradeAppId() {
		return this.tradeAppId;
	}
	public void setTradeAppId(String tradeAppId) {
		this.tradeAppId = tradeAppId;
	}

}
