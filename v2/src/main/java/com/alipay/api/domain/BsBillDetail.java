package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单明细
 *
 * @author auto create
 * @since 1.0, 2026-07-09 19:22:31
 */
public class BsBillDetail extends AlipayObject {

	private static final long serialVersionUID = 2352591537214885286L;

	/**
	 * 西溪路569号
	 */
	@ApiField("address")
	private String address;

	/**
	 * 交易发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商家品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 门店归属市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 交易N设备SN号。如果交易不经过设备，则没有该值
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 交易数字化门店名称
	 */
	@ApiField("digital_poi_name")
	private String digitalPoiName;

	/**
	 * 单品累计补贴金额，人民币CNY。如果有多件优惠，则是多件优惠的补贴金额。如果是平台混资计划，则仅包括商户出资部分。
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 门店归属区
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 商品条码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 参与优惠的商品数量
	 */
	@ApiField("goods_num")
	private Long goodsNum;

	/**
	 * 交易商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 订单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 交易号，已脱敏。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 整单累计补贴金额，人民币CNY，核销单（order_id）维度。
如果是退款单，则代表当前优惠退款金额。
退款金额可能少于核销补贴金额，取决于商户是否整单退。
	 */
	@ApiField("order_subsidy_amount")
	private String orderSubsidyAmount;

	/**
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 门店归属省
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品单价，人民币CNY
	 */
	@ApiField("unit_amount")
	private String unitAmount;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDigitalPoiName() {
		return this.digitalPoiName;
	}
	public void setDigitalPoiName(String digitalPoiName) {
		this.digitalPoiName = digitalPoiName;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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

	public Long getGoodsNum() {
		return this.goodsNum;
	}
	public void setGoodsNum(Long goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderSubsidyAmount() {
		return this.orderSubsidyAmount;
	}
	public void setOrderSubsidyAmount(String orderSubsidyAmount) {
		this.orderSubsidyAmount = orderSubsidyAmount;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}

}
