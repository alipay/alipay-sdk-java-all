package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿福三方订单回流
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:34:27
 */
public class AlipayCommerceMedicalOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1358987221978258321L;

	/**
	 * 关联支付宝交易号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * UID，可能有两种，根据buyer_id_type判断类型：
1、淘宝闪购uid，返回淘宝闪购uid；
2、支付宝uid，以2088开头；
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用户uid类型
	 */
	@ApiField("buyer_id_type")
	private String buyerIdType;

	/**
	 * 渠道订单ID
	 */
	@ApiField("channel_order_no")
	private String channelOrderNo;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 配送费，单位为【分】
	 */
	@ApiField("delivery_fee")
	private Long deliveryFee;

	/**
	 * null
	 */
	@ApiListField("ext_info")
	@ApiField("third_party_ext_info")
	private List<ThirdPartyExtInfo> extInfo;

	/**
	 * null
	 */
	@ApiListField("item_list")
	@ApiField("item_third_party_info")
	private List<ItemThirdPartyInfo> itemList;

	/**
	 * 用户医保支付金额，单位为【分】
	 */
	@ApiField("medical_insurance_amount")
	private Long medicalInsuranceAmount;

	/**
	 * 订单场景
	 */
	@ApiField("order_scene")
	private String orderScene;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单时间信息
	 */
	@ApiField("order_time_info")
	private OrderTimestampInfo orderTimeInfo;

	/**
	 * 打包费，单位为【分】
	 */
	@ApiField("packing_fee")
	private Long packingFee;

	/**
	 * 用户实付金额 ：用户最终结算时需要支付金额，单位为【分】
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * null
	 */
	@ApiListField("reverse_order_list")
	@ApiField("reverse_order_info")
	private List<ReverseOrderInfo> reverseOrderList;

	/**
	 * 用户自费金额，单位为【分】
	 */
	@ApiField("self_pay_amount")
	private Long selfPayAmount;

	/**
	 * 三方门店信息
	 */
	@ApiField("shop_info")
	private ShopThirdPartyInfo shopInfo;

	/**
	 * 订单总金额：某笔交易订单优惠前的总金额，单位为【分】
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 交易类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerIdType() {
		return this.buyerIdType;
	}
	public void setBuyerIdType(String buyerIdType) {
		this.buyerIdType = buyerIdType;
	}

	public String getChannelOrderNo() {
		return this.channelOrderNo;
	}
	public void setChannelOrderNo(String channelOrderNo) {
		this.channelOrderNo = channelOrderNo;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public Long getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(Long deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public List<ThirdPartyExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ThirdPartyExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<ItemThirdPartyInfo> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemThirdPartyInfo> itemList) {
		this.itemList = itemList;
	}

	public Long getMedicalInsuranceAmount() {
		return this.medicalInsuranceAmount;
	}
	public void setMedicalInsuranceAmount(Long medicalInsuranceAmount) {
		this.medicalInsuranceAmount = medicalInsuranceAmount;
	}

	public String getOrderScene() {
		return this.orderScene;
	}
	public void setOrderScene(String orderScene) {
		this.orderScene = orderScene;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderTimestampInfo getOrderTimeInfo() {
		return this.orderTimeInfo;
	}
	public void setOrderTimeInfo(OrderTimestampInfo orderTimeInfo) {
		this.orderTimeInfo = orderTimeInfo;
	}

	public Long getPackingFee() {
		return this.packingFee;
	}
	public void setPackingFee(Long packingFee) {
		this.packingFee = packingFee;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public List<ReverseOrderInfo> getReverseOrderList() {
		return this.reverseOrderList;
	}
	public void setReverseOrderList(List<ReverseOrderInfo> reverseOrderList) {
		this.reverseOrderList = reverseOrderList;
	}

	public Long getSelfPayAmount() {
		return this.selfPayAmount;
	}
	public void setSelfPayAmount(Long selfPayAmount) {
		this.selfPayAmount = selfPayAmount;
	}

	public ShopThirdPartyInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(ShopThirdPartyInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
