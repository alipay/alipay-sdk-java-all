package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单配送状态同步
 *
 * @author auto create
 * @since 1.0, 2024-09-20 10:35:55
 */
public class AlipayCommerceMedicalOrderLogisticsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8853156994364265123L;

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
	 * 骑手配送状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

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

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
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

}
