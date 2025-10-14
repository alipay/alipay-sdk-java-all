package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场机具订单信息同步
 *
 * @author auto create
 * @since 1.0, 2020-07-20 20:07:05
 */
public class AlipayEcoMycarParkingDeviceorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6382282375129515331L;

	/**
	 * 停车场ID
	 */
	@ApiField("alipay_parking_id")
	private String alipayParkingId;

	/**
	 * 支付宝IoT平台分配的供应商序列号
关键信息，支付宝强校验
	 */
	@ApiField("alipay_supplier_sn")
	private String alipaySupplierSn;

	/**
	 * 申请人支付宝账号
	 */
	@ApiField("applicant_alipay_account")
	private String applicantAlipayAccount;

	/**
	 * 申请人姓名
	 */
	@ApiField("applicant_name")
	private String applicantName;

	/**
	 * 申请人联系方式
	 */
	@ApiField("applicant_phone")
	private String applicantPhone;

	/**
	 * 变更到当前状态的业务时间，注意非数据回流时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 岗亭数量
	 */
	@ApiField("booth_num")
	private String boothNum;

	/**
	 * 申请设备数量
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 申请设备类型。键信息，设备型号需在支付宝IoT平台已注册。支付宝根据厂商供应商sn+厂商设备型号进行强校验
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 机具订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态:
1. APPLYING 申请中 
2. AUDITING 审核中 
3. AUDIT_REJECTED 审核未通过
4. WAIT_DELIVERY 待发货
5. DELIVERED 待收货 
6. RECEIVED 已收货
7. CANCELLED 已撤销

order_state=APPLYING时，除了remark外的其余字段也需传入
	 */
	@ApiField("order_state")
	private String orderState;

	/**
	 * 车场负责人姓名
	 */
	@ApiField("pklot_principal_name")
	private String pklotPrincipalName;

	/**
	 * 车场负责人联系方式
	 */
	@ApiField("pklot_principal_phone")
	private String pklotPrincipalPhone;

	/**
	 * 收货地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人联系方式
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * 备注说明
	 */
	@ApiField("remarks")
	private String remarks;

	public String getAlipayParkingId() {
		return this.alipayParkingId;
	}
	public void setAlipayParkingId(String alipayParkingId) {
		this.alipayParkingId = alipayParkingId;
	}

	public String getAlipaySupplierSn() {
		return this.alipaySupplierSn;
	}
	public void setAlipaySupplierSn(String alipaySupplierSn) {
		this.alipaySupplierSn = alipaySupplierSn;
	}

	public String getApplicantAlipayAccount() {
		return this.applicantAlipayAccount;
	}
	public void setApplicantAlipayAccount(String applicantAlipayAccount) {
		this.applicantAlipayAccount = applicantAlipayAccount;
	}

	public String getApplicantName() {
		return this.applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantPhone() {
		return this.applicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getBoothNum() {
		return this.boothNum;
	}
	public void setBoothNum(String boothNum) {
		this.boothNum = boothNum;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderState() {
		return this.orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getPklotPrincipalName() {
		return this.pklotPrincipalName;
	}
	public void setPklotPrincipalName(String pklotPrincipalName) {
		this.pklotPrincipalName = pklotPrincipalName;
	}

	public String getPklotPrincipalPhone() {
		return this.pklotPrincipalPhone;
	}
	public void setPklotPrincipalPhone(String pklotPrincipalPhone) {
		this.pklotPrincipalPhone = pklotPrincipalPhone;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
