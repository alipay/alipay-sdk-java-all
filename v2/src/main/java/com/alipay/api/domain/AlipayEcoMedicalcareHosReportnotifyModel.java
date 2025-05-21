package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗报告通知接口
 *
 * @author auto create
 * @since 1.0, 2016-10-12 10:10:14
 */
public class AlipayEcoMedicalcareHosReportnotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8734338658688565487L;

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
	 * 业务扩展参数json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 医院信息
	 */
	@ApiField("hos_info")
	private MedicalHospitalInfo hosInfo;

	/**
	 * 通知时间
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 操作类型
明确定义数据是创建还是更新
创建并更新CREATE_UPDATE
删除DELETE
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 患者证件号码
获取方式通过支付宝钱包用户信息共享接口中获取证件号或者手工输入证件号
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 证件类型
01	身份证
02	护照
03	军官证
04	士兵证
05	户口本
06	警官证
07	台湾居民来往大陆通行证（简称“台胞证”）
08	港澳居民来往内地通行证（简称“回乡证”）
09	临时身份证
10	港澳通行证
11	营业执照
12	外国人居留证
13	香港身份证
14	武警证
15	组织机构代码证
16	行政机关
17	社会团体
18	军队
19	武警
20	下属机构(具有主管单位批文号)
21	基金会
99	其它
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 挂号订单号,商户生成
	 */
	@ApiField("reg_out_trade_no")
	private String regOutTradeNo;

	/**
	 * 报告明细
	 */
	@ApiListField("report_list")
	@ApiField("medical_hospital_report_list")
	private List<MedicalHospitalReportList> reportList;

	/**
	 * 第三方唯一序列号（可以是订单号确保唯一）
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 诊疗订单号，商户生成
	 */
	@ApiField("treat_out_trade_no")
	private String treatOutTradeNo;

	/**
	 * 支付宝用户Id，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
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

	public String getRegOutTradeNo() {
		return this.regOutTradeNo;
	}
	public void setRegOutTradeNo(String regOutTradeNo) {
		this.regOutTradeNo = regOutTradeNo;
	}

	public List<MedicalHospitalReportList> getReportList() {
		return this.reportList;
	}
	public void setReportList(List<MedicalHospitalReportList> reportList) {
		this.reportList = reportList;
	}

	public String getThirdNo() {
		return this.thirdNo;
	}
	public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

	public String getTreatOutTradeNo() {
		return this.treatOutTradeNo;
	}
	public void setTreatOutTradeNo(String treatOutTradeNo) {
		this.treatOutTradeNo = treatOutTradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
