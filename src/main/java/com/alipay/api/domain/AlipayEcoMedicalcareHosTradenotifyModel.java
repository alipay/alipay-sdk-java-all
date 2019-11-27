package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗缴费通知接口
 *
 * @author auto create
 * @since 1.0, 2016-10-08 12:18:26
 */
public class AlipayEcoMedicalcareHosTradenotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2312993712921296962L;

	/**
	 * 科室信息
	 */
	@ApiField("dept_info")
	private MedicalHospitalDeptInfo deptInfo;

	/**
	 * 医生信息
	 */
	@ApiField("doctor_info")
	private MedicalHospitalDoctorInfo doctorInfo;

	/**
	 * 扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 医院信息
	 */
	@ApiField("hos_info")
	private MedicalHospitalInfo hosInfo;

	/**
	 * 订单详情链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 通知日期,如果不穿通知时间，逻辑由支付宝内部消化判断
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 操作类型：
创建并更新CREATE_UPDATE
删除DELETE
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 患者证件号码
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 证件类型
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 支付状态：
WAIT_BUYER_PAY未缴款
PAYED已缴款
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 挂号外部订单号
	 */
	@ApiField("reg_out_trade_no")
	private String regOutTradeNo;

	/**
	 * 第三方唯一序列号（可以是订单号确保唯一）
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 该笔订单的资金总额，精确到元。
单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 就诊日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("treat_date")
	private Date treatDate;

	/**
	 * 诊疗明细
	 */
	@ApiListField("treat_list")
	@ApiField("medical_hospital_treat_list")
	private List<MedicalHospitalTreatList> treatList;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public MedicalHospitalDeptInfo getDeptInfo() {
		return this.deptInfo;
	}
	public void setDeptInfo(MedicalHospitalDeptInfo deptInfo) {
		this.deptInfo = deptInfo;
	}

	public MedicalHospitalDoctorInfo getDoctorInfo() {
		return this.doctorInfo;
	}
	public void setDoctorInfo(MedicalHospitalDoctorInfo doctorInfo) {
		this.doctorInfo = doctorInfo;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public MedicalHospitalInfo getHosInfo() {
		return this.hosInfo;
	}
	public void setHosInfo(MedicalHospitalInfo hosInfo) {
		this.hosInfo = hosInfo;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public Date getNotifyTime() {
		return this.notifyTime;
	}
	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getPatientCardNo() {
		return this.patientCardNo;
	}
	public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

	public String getPatientCardType() {
		return this.patientCardType;
	}
	public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRegOutTradeNo() {
		return this.regOutTradeNo;
	}
	public void setRegOutTradeNo(String regOutTradeNo) {
		this.regOutTradeNo = regOutTradeNo;
	}

	public String getThirdNo() {
		return this.thirdNo;
	}
	public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getTreatDate() {
		return this.treatDate;
	}
	public void setTreatDate(Date treatDate) {
		this.treatDate = treatDate;
	}

	public List<MedicalHospitalTreatList> getTreatList() {
		return this.treatList;
	}
	public void setTreatList(List<MedicalHospitalTreatList> treatList) {
		this.treatList = treatList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
