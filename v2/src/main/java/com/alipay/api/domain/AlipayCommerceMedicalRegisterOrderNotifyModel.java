package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挂号订单回流
 *
 * @author auto create
 * @since 1.0, 2025-05-29 20:08:56
 */
public class AlipayCommerceMedicalRegisterOrderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3144522492197523994L;

	/**
	 * 订单创建 INSERT,
状态同步 UPDATE,
订单删除 DELETE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 挂号预约的时间段
	 */
	@ApiField("appoint_part")
	private String appointPart;

	/**
	 * 订单取消的原因，可能是用户取消，系统取消，或者医生自定义取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订单取消时间
时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 渠道，CHANNEL_SEARCH_REGISTER:挂号频道;AN_ZHEN_ER_REGISTER:安诊儿;HEALTH_BUTLER_REGISTER:健康管家
	 */
	@ApiField("channle")
	private String channle;

	/**
	 * （号源）就诊时段结束时间，HH:mm
	 */
	@ApiField("clinic_end_time")
	private String clinicEndTime;

	/**
	 * （号源）就诊时段开始时间，HH:mm
	 */
	@ApiField("clinic_start_time")
	private String clinicStartTime;

	/**
	 * 就诊时间，时间格式：HH:mm
	 */
	@ApiField("clinic_time")
	private String clinicTime;

	/**
	 * 科室id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 挂号费用，单位：分
	 */
	@ApiField("fee")
	private Long fee;

	/**
	 * 医院唯一编码
	 */
	@ApiField("hospital_code")
	private String hospitalCode;

	/**
	 * 医院的号源编码
	 */
	@ApiField("hospital_number_no")
	private String hospitalNumberNo;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 科室名称
	 */
	@ApiField("isv_hos_dept_name")
	private String isvHosDeptName;

	/**
	 * 医院名称
	 */
	@ApiField("isv_hos_name")
	private String isvHosName;

	/**
	 * 服务商用户id
	 */
	@ApiField("isv_user_id")
	private String isvUserId;

	/**
	 * 号源ID
	 */
	@ApiField("number_id")
	private String numberId;

	/**
	 * 号源序号
	 */
	@ApiField("number_seq_no")
	private String numberSeqNo;

	/**
	 * order_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单创建时间
时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 就诊人id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 支付时间
时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 支付方式，
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 统一分配，接入的时候传固定的平台编码。
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 号源日期：格式 yyyyMMdd
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班id
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 班次
	 */
	@ApiField("shift_type")
	private String shiftType;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAppointPart() {
		return this.appointPart;
	}
	public void setAppointPart(String appointPart) {
		this.appointPart = appointPart;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Date getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getChannle() {
		return this.channle;
	}
	public void setChannle(String channle) {
		this.channle = channle;
	}

	public String getClinicEndTime() {
		return this.clinicEndTime;
	}
	public void setClinicEndTime(String clinicEndTime) {
		this.clinicEndTime = clinicEndTime;
	}

	public String getClinicStartTime() {
		return this.clinicStartTime;
	}
	public void setClinicStartTime(String clinicStartTime) {
		this.clinicStartTime = clinicStartTime;
	}

	public String getClinicTime() {
		return this.clinicTime;
	}
	public void setClinicTime(String clinicTime) {
		this.clinicTime = clinicTime;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getFee() {
		return this.fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}

	public String getHospitalCode() {
		return this.hospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalNumberNo() {
		return this.hospitalNumberNo;
	}
	public void setHospitalNumberNo(String hospitalNumberNo) {
		this.hospitalNumberNo = hospitalNumberNo;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getIsvHosDeptName() {
		return this.isvHosDeptName;
	}
	public void setIsvHosDeptName(String isvHosDeptName) {
		this.isvHosDeptName = isvHosDeptName;
	}

	public String getIsvHosName() {
		return this.isvHosName;
	}
	public void setIsvHosName(String isvHosName) {
		this.isvHosName = isvHosName;
	}

	public String getIsvUserId() {
		return this.isvUserId;
	}
	public void setIsvUserId(String isvUserId) {
		this.isvUserId = isvUserId;
	}

	public String getNumberId() {
		return this.numberId;
	}
	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}

	public String getNumberSeqNo() {
		return this.numberSeqNo;
	}
	public void setNumberSeqNo(String numberSeqNo) {
		this.numberSeqNo = numberSeqNo;
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

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getShiftType() {
		return this.shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

}
