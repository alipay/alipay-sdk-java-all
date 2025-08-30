package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挂号订单回流
 *
 * @author auto create
 * @since 1.0, 2025-08-21 18:21:17
 */
public class AlipayCommerceMedicalRegisterOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2831538975535366411L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 时段
	 */
	@ApiField("appoint_part")
	private String appointPart;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订单取消时间
	 */
	@ApiField("cancel_time")
	private Date cancelTime;

	/**
	 * 来源渠道，
健康管家渠道码：HEALTH_BUTLER_REGISTER
安诊儿：
AN_ZHEN_ER_REGISTER
挂号频道：
CHANNEL_SEARCH_REGISTER
SINGLE_HOS_NFYKDZJ 珠江医院（扁鹊单院版）：
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 就诊时段结束时间
	 */
	@ApiField("clinic_end_time")
	private String clinicEndTime;

	/**
	 * 就诊时段开始时间
	 */
	@ApiField("clinic_start_time")
	private String clinicStartTime;

	/**
	 * 就诊时间点
	 */
	@ApiField("clinic_time")
	private String clinicTime;

	/**
	 * 医生ID
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 挂号费用，单位：分
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 医院号源编码
	 */
	@ApiField("hospital_number_no")
	private String hospitalNumberNo;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 服务商医院科室名称
	 */
	@ApiField("isv_hos_dept_name")
	private String isvHosDeptName;

	/**
	 * 服务商医院科室ID
	 */
	@ApiField("isv_hos_dept_no")
	private String isvHosDeptNo;

	/**
	 * 服务商医院名称
	 */
	@ApiField("isv_hos_name")
	private String isvHosName;

	/**
	 * 服务商医院唯一编码
	 */
	@ApiField("isv_hos_no")
	private String isvHosNo;

	/**
	 * 服务商用户ID
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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝订单唯一标识
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单支付状态
	 */
	@ApiField("order_pay_status")
	private String orderPayStatus;

	/**
	 * 挂号订单属性
	 */
	@ApiField("order_prop")
	private String orderProp;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 外部唯一订单ID
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 就诊人id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 就诊人证件ID
	 */
	@ApiField("patient_id_card")
	private String patientIdCard;

	/**
	 * 就诊人证件类型
	 */
	@ApiField("patient_id_type")
	private String patientIdType;

	/**
	 * 就诊人手机号码
	 */
	@ApiField("patient_moblie")
	private String patientMoblie;

	/**
	 * 就诊人名称
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 支付方式
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 号源排班日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班ID
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 场景编码，枚举值
管家APP: HEALTH_BUTLER_APP 
管家小程序：HEALTH_BUTLER
安诊儿APP:
AN_ZHEN_ER_APP
安诊儿小程序
AN_ZHEN_ER
挂号频道小程序
CHANNEL_SEARCH_REGISTER
SINGLE_HOS_NFYKDZJ_APP_SCENE  珠江医院（扁鹊单院版APP）
SINGLE_HOS_NFYKDZJ_SCENE  珠江医院（扁鹊单院版小程序）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 班次
	 */
	@ApiField("shift_type")
	private String shiftType;

	/**
	 * 子场景编码
	 */
	@ApiField("sub_scene_code")
	private String subSceneCode;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
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

	public String getIsvHosDeptNo() {
		return this.isvHosDeptNo;
	}
	public void setIsvHosDeptNo(String isvHosDeptNo) {
		this.isvHosDeptNo = isvHosDeptNo;
	}

	public String getIsvHosName() {
		return this.isvHosName;
	}
	public void setIsvHosName(String isvHosName) {
		this.isvHosName = isvHosName;
	}

	public String getIsvHosNo() {
		return this.isvHosNo;
	}
	public void setIsvHosNo(String isvHosNo) {
		this.isvHosNo = isvHosNo;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderPayStatus() {
		return this.orderPayStatus;
	}
	public void setOrderPayStatus(String orderPayStatus) {
		this.orderPayStatus = orderPayStatus;
	}

	public String getOrderProp() {
		return this.orderProp;
	}
	public void setOrderProp(String orderProp) {
		this.orderProp = orderProp;
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

	public String getPatientIdCard() {
		return this.patientIdCard;
	}
	public void setPatientIdCard(String patientIdCard) {
		this.patientIdCard = patientIdCard;
	}

	public String getPatientIdType() {
		return this.patientIdType;
	}
	public void setPatientIdType(String patientIdType) {
		this.patientIdType = patientIdType;
	}

	public String getPatientMoblie() {
		return this.patientMoblie;
	}
	public void setPatientMoblie(String patientMoblie) {
		this.patientMoblie = patientMoblie;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getShiftType() {
		return this.shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

	public String getSubSceneCode() {
		return this.subSceneCode;
	}
	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}

}
