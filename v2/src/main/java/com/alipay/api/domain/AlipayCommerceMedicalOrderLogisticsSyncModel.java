package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单配送状态同步
 *
 * @author auto create
 * @since 1.0, 2025-01-15 15:56:54
 */
public class AlipayCommerceMedicalOrderLogisticsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8722139358922665946L;

	/**
	 * 第三方配送商物流单号，取自商家平台呼叫三方配送骑手的配送订单号
	 */
	@ApiField("carrier_order_no")
	private String carrierOrderNo;

	/**
	 * 骑手姓名
	 */
	@ApiField("courier_name")
	private String courierName;

	/**
	 * 骑手手机号码，不支持传入隐私小号
	 */
	@ApiField("courier_phone")
	private String courierPhone;

	/**
	 * 骑手当前的纬度，使用的是高德坐标系
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 骑手配送状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 骑手当前的经度，使用的是高德坐标系
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 配送商类型，值规则：获取商家呼叫的第三方物流配送商，结合当前字段提供的枚举值
	 */
	@ApiField("provider_code")
	private String providerCode;

	/**
	 * 配送商电话
	 */
	@ApiField("provider_phone")
	private String providerPhone;

	/**
	 * 配送取消/异常的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 配送取消/异常的原因code
9999 :其他原因（ 商家传入自定义）
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 当前时间，格式：时间戳
	 */
	@ApiField("utc")
	private String utc;

	public String getCarrierOrderNo() {
		return this.carrierOrderNo;
	}
	public void setCarrierOrderNo(String carrierOrderNo) {
		this.carrierOrderNo = carrierOrderNo;
	}

	public String getCourierName() {
		return this.courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierPhone() {
		return this.courierPhone;
	}
	public void setCourierPhone(String courierPhone) {
		this.courierPhone = courierPhone;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProviderCode() {
		return this.providerCode;
	}
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

	public String getProviderPhone() {
		return this.providerPhone;
	}
	public void setProviderPhone(String providerPhone) {
		this.providerPhone = providerPhone;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getUtc() {
		return this.utc;
	}
	public void setUtc(String utc) {
		this.utc = utc;
	}

}
