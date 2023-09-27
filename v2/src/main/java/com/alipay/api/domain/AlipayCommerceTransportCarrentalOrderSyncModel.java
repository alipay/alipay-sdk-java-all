package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车服务标准化订单数据回流
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:06:14
 */
public class AlipayCommerceTransportCarrentalOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6581124567761276286L;

	/**
	 * 支付宝userid（用户在支付宝平台的2088开头16位id）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 租车信息
	 */
	@ApiField("car_rental_info")
	private CarRentalInfo carRentalInfo;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 租车商品信息
	 */
	@ApiField("goods_info")
	private CarRentalGoodsInfo goodsInfo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单总金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单详情链接

链接是商户自己的小程序的
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单扩展字段，示例展示场景：key：scene_type，value：NOTICE_TOUCH；key：cup_type，value:BRING_CUP
	 */
	@ApiListField("order_extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> orderExtraInfo;

	/**
	 * 订单修改时间(订单更新时需有变动)
	 */
	@ApiField("order_modify_time")
	private Date orderModifyTime;

	/**
	 * 订单类型，枚举支持 
ALIPAY_APPLETS：支付宝小程序产生的订单 ALIPAY_POS：收银POS产生的支付宝订单
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 订单类型
HOUR_RENT
时租
DAY_RENT
日租
PACKAGE_RENT
套餐
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 交易支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 付费类型
PRE_PAY
先付
POST_PAY
后付
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 商户订单同步记录id（同一订单，非第一次同步 必填）
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 服务标识
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 订单枚举。
CREATE  下单成功
PAID_BEFORE_USE   取车前已支付
CANCELLED   已取消
TO_TAKE_CAR   待取车
CAR_OCCUPYING   用车中
PARTIAL_TO_BE_PAID    部分待结算
PARTIAL_PAID   部分结算支付成功
CAR_RETURNED  已还车
TO_BE_PAID   待结算
PAID_AFTER_USE   用车后已支付
REFUNDED   已退款
FINISHED   订单完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子服务类型

RESERVATION   预约单
INSTANT   实时单
	 */
	@ApiField("sub_service_type")
	private String subServiceType;

	/**
	 * 支付宝交易号（一个订单可能存在多笔支付单，英文逗号隔开）示例：2021050622001425901452597134,2021050622001425901452597135

PAID_BEFORE_USE
PARTIAL_PAID
PAID_AFTER_USE
REFUNDED
FINISHED
状态下如果使用支付宝支付则必传
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 车辆信息
	 */
	@ApiField("vehicle_info")
	private CarRentalVehicleInfo vehicleInfo;

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

	public CarRentalInfo getCarRentalInfo() {
		return this.carRentalInfo;
	}
	public void setCarRentalInfo(CarRentalInfo carRentalInfo) {
		this.carRentalInfo = carRentalInfo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public CarRentalGoodsInfo getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(CarRentalGoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public List<ExtraInfo> getOrderExtraInfo() {
		return this.orderExtraInfo;
	}
	public void setOrderExtraInfo(List<ExtraInfo> orderExtraInfo) {
		this.orderExtraInfo = orderExtraInfo;
	}

	public Date getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(Date orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubServiceType() {
		return this.subServiceType;
	}
	public void setSubServiceType(String subServiceType) {
		this.subServiceType = subServiceType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public CarRentalVehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(CarRentalVehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

}
