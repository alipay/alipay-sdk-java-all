package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业N支付订单创建
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:53:03
 */
public class AlipayCommerceTransportNpayOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2149879647814155686L;

	/**
	 * 订单金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收单(销售)产品码，
收钱码：TRANSFER_QRCODE_PAY
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 订单来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 6位地级市编码，高德标准
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 设备序列号，为一串数字或字母，一般为电子产品的标识码
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 行程信息
	 */
	@ApiField("trip_info")
	private String tripInfo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDriverOpenId() {
		return this.driverOpenId;
	}
	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTripInfo() {
		return this.tripInfo;
	}
	public void setTripInfo(String tripInfo) {
		this.tripInfo = tripInfo;
	}

}
