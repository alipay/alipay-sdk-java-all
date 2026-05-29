package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单预创建
 *
 * @author auto create
 * @since 1.0, 2026-04-08 10:52:44
 */
public class AlipayCommerceRentOrderPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8785174632945486111L;

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
	 * 用户身份信息，用于订单签约时身份校验
	 */
	@ApiField("buyer_identity_info")
	private RentBuyerIdentityInfo buyerIdentityInfo;

	/**
	 * 当用户进入预授权或代扣签约页面后，点击左上角的回退按钮，中断开通流程，跳转回商户的页面地址。支持scheme协议。不传该链接时，默认返回上一级页面
	 */
	@ApiField("cancel_back_link")
	private String cancelBackLink;

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
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * null
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
	 * 商户订单号，由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 端外订单来源
	 */
	@ApiField("out_order_source")
	private String outOrderSource;

	/**
	 * 订单金额信息
	 */
	@ApiField("price_info")
	private RentOrderPriceInfoDTO priceInfo;

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
	 * 用户完成预授权或代扣签约后，不区分用户签约成功/失败，跳转回商家页面，该字段代表跳转回商家的页面地址。支持scheme协议。不传该链接时，默认返回上一级页面
	 */
	@ApiField("return_back_link")
	private String returnBackLink;

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

	public RentBuyerIdentityInfo getBuyerIdentityInfo() {
		return this.buyerIdentityInfo;
	}
	public void setBuyerIdentityInfo(RentBuyerIdentityInfo buyerIdentityInfo) {
		this.buyerIdentityInfo = buyerIdentityInfo;
	}

	public String getCancelBackLink() {
		return this.cancelBackLink;
	}
	public void setCancelBackLink(String cancelBackLink) {
		this.cancelBackLink = cancelBackLink;
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

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutOrderSource() {
		return this.outOrderSource;
	}
	public void setOutOrderSource(String outOrderSource) {
		this.outOrderSource = outOrderSource;
	}

	public RentOrderPriceInfoDTO getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(RentOrderPriceInfoDTO priceInfo) {
		this.priceInfo = priceInfo;
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

	public String getReturnBackLink() {
		return this.returnBackLink;
	}
	public void setReturnBackLink(String returnBackLink) {
		this.returnBackLink = returnBackLink;
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

}
