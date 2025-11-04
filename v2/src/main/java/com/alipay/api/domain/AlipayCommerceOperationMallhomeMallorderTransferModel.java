package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单回流
 *
 * @author auto create
 * @since 1.0, 2025-03-24 19:58:29
 */
public class AlipayCommerceOperationMallhomeMallorderTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4771523451329898586L;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 数字化门店id
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商家直联收单pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 商家间联收单SMID
	 */
	@ApiField("merchant_smid")
	private String merchantSmid;

	/**
	 * 商户订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单金额(单位:分)
	 */
	@ApiField("order_price")
	private Long orderPrice;

	/**
	 * 设备软件版本编号
	 */
	@ApiField("software_version_no")
	private String softwareVersionNo;

	/**
	 * 场地地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店场地id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 场地名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝交易金额(单位:分)
	 */
	@ApiField("trade_price")
	private Long tradePrice;

	/**
	 * 支付宝交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getMerchantSmid() {
		return this.merchantSmid;
	}
	public void setMerchantSmid(String merchantSmid) {
		this.merchantSmid = merchantSmid;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(Long orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getSoftwareVersionNo() {
		return this.softwareVersionNo;
	}
	public void setSoftwareVersionNo(String softwareVersionNo) {
		this.softwareVersionNo = softwareVersionNo;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Long getTradePrice() {
		return this.tradePrice;
	}
	public void setTradePrice(Long tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
