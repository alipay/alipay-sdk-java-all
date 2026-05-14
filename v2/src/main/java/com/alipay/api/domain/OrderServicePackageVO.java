package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:57:45
 */
public class OrderServicePackageVO extends AlipayObject {

	private static final long serialVersionUID = 8657348573728395633L;

	/**
	 * 用户实付金额(分)
	 */
	@ApiField("amount_user")
	private Long amountUser;

	/**
	 * 是否支持用户申请退款
	 */
	@ApiField("can_refund")
	private Boolean canRefund;

	/**
	 * 绑定医生团队ID
	 */
	@ApiField("doctor_team_id")
	private String doctorTeamId;

	/**
	 * 履约有效天数
	 */
	@ApiField("fulfillment_valid_days")
	private Long fulfillmentValidDays;

	/**
	 * 领衔医生ID
	 */
	@ApiField("lead_doctor_id")
	private String leadDoctorId;

	/**
	 * 服务包订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 服务包订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 患者信息
	 */
	@ApiField("patient_info")
	private ServicepackagePatientInfo patientInfo;

	/**
	 * 用户支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 退款信息
	 */
	@ApiField("refund_info")
	private ServicepackageRefundInfo refundInfo;

	/**
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 服务包ID
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * null
	 */
	@ApiListField("service_package_items")
	@ApiField("service_package_item")
	private List<ServicePackageItem> servicePackageItems;

	/**
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	/**
	 * 服务包价格（分）
	 */
	@ApiField("service_package_price")
	private Long servicePackagePrice;

	/**
	 * 权益有效期截止时间
	 */
	@ApiField("service_package_time")
	private Date servicePackageTime;

	public Long getAmountUser() {
		return this.amountUser;
	}
	public void setAmountUser(Long amountUser) {
		this.amountUser = amountUser;
	}

	public Boolean getCanRefund() {
		return this.canRefund;
	}
	public void setCanRefund(Boolean canRefund) {
		this.canRefund = canRefund;
	}

	public String getDoctorTeamId() {
		return this.doctorTeamId;
	}
	public void setDoctorTeamId(String doctorTeamId) {
		this.doctorTeamId = doctorTeamId;
	}

	public Long getFulfillmentValidDays() {
		return this.fulfillmentValidDays;
	}
	public void setFulfillmentValidDays(Long fulfillmentValidDays) {
		this.fulfillmentValidDays = fulfillmentValidDays;
	}

	public String getLeadDoctorId() {
		return this.leadDoctorId;
	}
	public void setLeadDoctorId(String leadDoctorId) {
		this.leadDoctorId = leadDoctorId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ServicepackagePatientInfo getPatientInfo() {
		return this.patientInfo;
	}
	public void setPatientInfo(ServicepackagePatientInfo patientInfo) {
		this.patientInfo = patientInfo;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public ServicepackageRefundInfo getRefundInfo() {
		return this.refundInfo;
	}
	public void setRefundInfo(ServicepackageRefundInfo refundInfo) {
		this.refundInfo = refundInfo;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public List<ServicePackageItem> getServicePackageItems() {
		return this.servicePackageItems;
	}
	public void setServicePackageItems(List<ServicePackageItem> servicePackageItems) {
		this.servicePackageItems = servicePackageItems;
	}

	public String getServicePackageName() {
		return this.servicePackageName;
	}
	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}

	public Long getServicePackagePrice() {
		return this.servicePackagePrice;
	}
	public void setServicePackagePrice(Long servicePackagePrice) {
		this.servicePackagePrice = servicePackagePrice;
	}

	public Date getServicePackageTime() {
		return this.servicePackageTime;
	}
	public void setServicePackageTime(Date servicePackageTime) {
		this.servicePackageTime = servicePackageTime;
	}

}
