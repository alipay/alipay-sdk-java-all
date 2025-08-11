package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单创建
 *
 * @author auto create
 * @since 1.0, 2025-08-08 18:31:09
 */
public class AlipayCommerceRentOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5235959252834911673L;

	/**
	 * 优惠前置咨询组件返回的优惠活动咨询ID
	 */
	@ApiField("activity_consult_id")
	private String activityConsultId;

	/**
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private RentOrderReceiverAddressInfoDTO addressInfo;

	/**
	 * 买家支付宝用户id，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 租赁购买创单信息
	 */
	@ApiField("buyout_info")
	private RentBuyoutInfoDTO buyoutInfo;

	/**
	 * 买断分期号。租转售模式，阶梯买断场景下必传
	 */
	@ApiField("buyout_installment_no")
	private Long buyoutInstallmentNo;

	/**
	 * 默认退货寄回地址
	 */
	@ApiField("default_receiving_address")
	private RentOrderReceiverAddressInfoDTO defaultReceivingAddress;

	/**
	 * 订单履约信息
	 */
	@ApiField("delivery_info")
	private RentOrderDeliveryInfoDTO deliveryInfo;

	/**
	 * 商品详细信息。当前只支持单个商品。
	 */
	@ApiListField("item_infos")
	@ApiField("rent_goods_detail_info_d_t_o")
	private List<RentGoodsDetailInfoDTO> itemInfos;

	/**
	 * 订单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 商户订单号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 原始租赁订单号。订单类型为续租、租转售时必传
	 */
	@ApiField("parent_order_id")
	private String parentOrderId;

	/**
	 * 租赁订单页面地址信息
	 */
	@ApiField("path_info")
	private RentPathInfoDTO pathInfo;

	/**
	 * 订单金额信息
	 */
	@ApiField("price_info")
	private RentOrderPriceInfoDTO priceInfo;

	/**
	 * 租赁续租创单信息
	 */
	@ApiField("relet_info")
	private RentReletInfoDTO reletInfo;

	/**
	 * 租赁计划信息
	 */
	@ApiField("rent_plan_info")
	private RentPlanInfoDTO rentPlanInfo;

	/**
	 * 租赁订单支付产品、信用产品签约信息。不传表示当前订单无需使用相应的能力
	 */
	@ApiField("rent_sign_info")
	private RentSignInfoDTO rentSignInfo;

	/**
	 * 服务商模式。签约资商通直付通平台商分账产品后，下单时传入平台模式 PLATFORM，smid必传；此模式下支持服务商派单模式
	 */
	@ApiField("service_provider_model")
	private String serviceProviderModel;

	/**
	 * 追踪ID，租赁交易组件下单必传，会影响主播归因、分享员归因等；通过调用<a href="https://opendocs.alipay.com/mini/512c3ce1_my.checkBeforeAddOrder?pathHash=4b9d23c5" target="_blank">my.checkBeforeAddOrder</a>接口返回
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 二级商户信息。直付通模式和机构间连模式下必传，其它场景下不需要传入
	 */
	@ApiField("sub_merchant")
	private RentSubMerchantDTO subMerchant;

	/**
	 * 租赁订单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 当商家收单appid与下单appid不一致时必传
	 */
	@ApiField("trade_app_id")
	private String tradeAppId;

	/**
	 * 资商通产品信息
	 */
	@ApiField("zst_info")
	private RentZstInfoDTO zstInfo;

	public String getActivityConsultId() {
		return this.activityConsultId;
	}
	public void setActivityConsultId(String activityConsultId) {
		this.activityConsultId = activityConsultId;
	}

	public RentOrderReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(RentOrderReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public RentBuyoutInfoDTO getBuyoutInfo() {
		return this.buyoutInfo;
	}
	public void setBuyoutInfo(RentBuyoutInfoDTO buyoutInfo) {
		this.buyoutInfo = buyoutInfo;
	}

	public Long getBuyoutInstallmentNo() {
		return this.buyoutInstallmentNo;
	}
	public void setBuyoutInstallmentNo(Long buyoutInstallmentNo) {
		this.buyoutInstallmentNo = buyoutInstallmentNo;
	}

	public RentOrderReceiverAddressInfoDTO getDefaultReceivingAddress() {
		return this.defaultReceivingAddress;
	}
	public void setDefaultReceivingAddress(RentOrderReceiverAddressInfoDTO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}

	public RentOrderDeliveryInfoDTO getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(RentOrderDeliveryInfoDTO deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public List<RentGoodsDetailInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<RentGoodsDetailInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public RentPathInfoDTO getPathInfo() {
		return this.pathInfo;
	}
	public void setPathInfo(RentPathInfoDTO pathInfo) {
		this.pathInfo = pathInfo;
	}

	public RentOrderPriceInfoDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(RentOrderPriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
	}

	public RentReletInfoDTO getReletInfo() {
		return this.reletInfo;
	}
	public void setReletInfo(RentReletInfoDTO reletInfo) {
		this.reletInfo = reletInfo;
	}

	public RentPlanInfoDTO getRentPlanInfo() {
		return this.rentPlanInfo;
	}
	public void setRentPlanInfo(RentPlanInfoDTO rentPlanInfo) {
		this.rentPlanInfo = rentPlanInfo;
	}

	public RentSignInfoDTO getRentSignInfo() {
		return this.rentSignInfo;
	}
	public void setRentSignInfo(RentSignInfoDTO rentSignInfo) {
		this.rentSignInfo = rentSignInfo;
	}

	public String getServiceProviderModel() {
		return this.serviceProviderModel;
	}
	public void setServiceProviderModel(String serviceProviderModel) {
		this.serviceProviderModel = serviceProviderModel;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public RentSubMerchantDTO getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(RentSubMerchantDTO subMerchant) {
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

	public RentZstInfoDTO getZstInfo() {
		return this.zstInfo;
	}
	public void setZstInfo(RentZstInfoDTO zstInfo) {
		this.zstInfo = zstInfo;
	}

}
