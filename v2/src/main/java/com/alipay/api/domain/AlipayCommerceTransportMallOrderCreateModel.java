package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单创建
 *
 * @author auto create
 * @since 1.0, 2026-02-10 10:22:43
 */
public class AlipayCommerceTransportMallOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7218793769925299335L;

	/**
	 * 车辆品牌Id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 车辆品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 车系ID
	 */
	@ApiField("car_series")
	private String carSeries;

	/**
	 * 车系名称
	 */
	@ApiField("car_series_name")
	private String carSeriesName;

	/**
	 * 操作审计人
	 */
	@ApiField("create_by")
	private String createBy;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 商品价格
单位：元{"fieldDesc":"元"}
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/**
	 * 充值状态
2, "开通成功"
	 */
	@ApiField("ecology_status")
	private Long ecologyStatus;

	/**
	 * 第一支付类型
	 */
	@ApiField("first_pay_type")
	private String firstPayType;

	/**
	 * 商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品价格
单位：元{"fieldDesc":"元"}
	 */
	@ApiField("goods_price")
	private String goodsPrice;

	/**
	 * 商品标识
	 */
	@ApiField("goods_supplier")
	private Long goodsSupplier;

	/**
	 * 商品类型ID
	 */
	@ApiField("goods_type_id")
	private String goodsTypeId;

	/**
	 * 商品类型名称
	 */
	@ApiField("goods_type_name")
	private String goodsTypeName;

	/**
	 * SIM卡标识
	 */
	@ApiField("iccid")
	private String iccid;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 订单类型
	 */
	@ApiField("order_biz_type")
	private String orderBizType;

	/**
	 * 订单来源渠道
	 */
	@ApiField("order_channel")
	private String orderChannel;

	/**
	 * 订单xx原因
	 */
	@ApiField("order_invalid_reason")
	private String orderInvalidReason;

	/**
	 * 订单状态
"0", "已提交未支付
"1", "已提交已支付"
"2", "已支付未发货"
"3", "已支付已发货"
"4", "已失效"
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 父订单编号
	 */
	@ApiField("parent_order_no")
	private String parentOrderNo;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 充值手机号
	 */
	@ApiField("recharge_phone")
	private String rechargePhone;

	/**
	 * 幂等ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 第二支付类型
	 */
	@ApiField("second_pay_type")
	private String secondPayType;

	/**
	 * 订单编号
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	/**
	 * 系统标识
	 */
	@ApiField("sid")
	private String sid;

	/**
	 * 商品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 第三方创建时间
	 */
	@ApiField("third_create_time")
	private String thirdCreateTime;

	/**
	 * 第三方的用户ID
	 */
	@ApiField("third_id")
	private String thirdId;

	/**
	 * 第三方订单状态
"0", "未支付"
"1", "支付成功"
"2", "支付失败"
	 */
	@ApiField("third_order_status")
	private String thirdOrderStatus;

	/**
	 * 第三方支付时间
	 */
	@ApiField("third_payment_time")
	private String thirdPaymentTime;

	/**
	 * 总价
单位：元{"fieldDesc":"元"}
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 商品价格
单位：元{"fieldDesc":"元"}
	 */
	@ApiField("trade_price")
	private String tradePrice;

	/**
	 * 更新操作审计人
	 */
	@ApiField("update_by")
	private String updateBy;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private String updateTime;

	/**
	 * 用户手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	/**
	 * 确认时间
	 */
	@ApiField("valid_time")
	private String validTime;

	/**
	 * 车辆识别码
	 */
	@ApiField("vin")
	private String vin;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCarSeries() {
		return this.carSeries;
	}
	public void setCarSeries(String carSeries) {
		this.carSeries = carSeries;
	}

	public String getCarSeriesName() {
		return this.carSeriesName;
	}
	public void setCarSeriesName(String carSeriesName) {
		this.carSeriesName = carSeriesName;
	}

	public String getCreateBy() {
		return this.createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDiscountPrice() {
		return this.discountPrice;
	}
	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Long getEcologyStatus() {
		return this.ecologyStatus;
	}
	public void setEcologyStatus(Long ecologyStatus) {
		this.ecologyStatus = ecologyStatus;
	}

	public String getFirstPayType() {
		return this.firstPayType;
	}
	public void setFirstPayType(String firstPayType) {
		this.firstPayType = firstPayType;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Long getGoodsSupplier() {
		return this.goodsSupplier;
	}
	public void setGoodsSupplier(Long goodsSupplier) {
		this.goodsSupplier = goodsSupplier;
	}

	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}
	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public String getIccid() {
		return this.iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOrderBizType() {
		return this.orderBizType;
	}
	public void setOrderBizType(String orderBizType) {
		this.orderBizType = orderBizType;
	}

	public String getOrderChannel() {
		return this.orderChannel;
	}
	public void setOrderChannel(String orderChannel) {
		this.orderChannel = orderChannel;
	}

	public String getOrderInvalidReason() {
		return this.orderInvalidReason;
	}
	public void setOrderInvalidReason(String orderInvalidReason) {
		this.orderInvalidReason = orderInvalidReason;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getParentOrderNo() {
		return this.parentOrderNo;
	}
	public void setParentOrderNo(String parentOrderNo) {
		this.parentOrderNo = parentOrderNo;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRechargePhone() {
		return this.rechargePhone;
	}
	public void setRechargePhone(String rechargePhone) {
		this.rechargePhone = rechargePhone;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecondPayType() {
		return this.secondPayType;
	}
	public void setSecondPayType(String secondPayType) {
		this.secondPayType = secondPayType;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getThirdCreateTime() {
		return this.thirdCreateTime;
	}
	public void setThirdCreateTime(String thirdCreateTime) {
		this.thirdCreateTime = thirdCreateTime;
	}

	public String getThirdId() {
		return this.thirdId;
	}
	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}

	public String getThirdOrderStatus() {
		return this.thirdOrderStatus;
	}
	public void setThirdOrderStatus(String thirdOrderStatus) {
		this.thirdOrderStatus = thirdOrderStatus;
	}

	public String getThirdPaymentTime() {
		return this.thirdPaymentTime;
	}
	public void setThirdPaymentTime(String thirdPaymentTime) {
		this.thirdPaymentTime = thirdPaymentTime;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradePrice() {
		return this.tradePrice;
	}
	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getValidTime() {
		return this.validTime;
	}
	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
