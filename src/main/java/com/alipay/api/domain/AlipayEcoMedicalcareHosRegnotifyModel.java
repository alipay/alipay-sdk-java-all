package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业医院挂号通知接口
 *
 * @author auto create
 * @since 1.0, 2016-10-12 10:09:59
 */
public class AlipayEcoMedicalcareHosRegnotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1396487811111826837L;

	/**
	 * 业务类型:
挂号成功：REG_SUCCESS
挂号取销：REG_CANCEL
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 撤销说明
	 */
	@ApiField("cancel_desc")
	private String cancelDesc;

	/**
	 * 取消原因
备注:业务类型是
REG_CANCEL，不可空
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

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
	 * 排队号
	 */
	@ApiField("line_no")
	private Long lineNo;

	/**
	 * 通知日期,如果不传通知时间，逻辑由支付宝内部消化判断 
格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("notify_time")
	private Date notifyTime;

	/**
	 * 操作类型：
明确定义数据是创建还是更新
创建并更新CREATE_UPDATE
删除DELETE
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 订单详情链接
链接开头为https或http
	 */
	@ApiField("order_link")
	private String orderLink;

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
	 * 重新预约医生链接
链接开头为https或http
备注:如biz_type的值为REG_CANCEL则不可空
	 */
	@ApiField("reg_link")
	private String regLink;

	/**
	 * 第三方唯一序列号（可以是订单号确保唯一）
	 */
	@ApiField("third_no")
	private String thirdNo;

	/**
	 * 就诊日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("treat_date")
	private Date treatDate;

	/**
	 * 就诊显示日期json格式：
类型：
时间区间类型：range
中文显示类型：cn
备注：
1.range类型HH:mm-HH:mm 中间中横线隔开
{"range":"09:00-10:00"}
2.cn类型
上午  1
下午  2
晚上  3
{"cn":"1"}
	 */
	@ApiField("treat_date_ext")
	private String treatDateExt;

	/**
	 * 支付宝用户Id，可以通过支付宝钱包用户信息共享接口获取支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCancelDesc() {
		return this.cancelDesc;
	}
	public void setCancelDesc(String cancelDesc) {
		this.cancelDesc = cancelDesc;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

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

	public Long getLineNo() {
		return this.lineNo;
	}
	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
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

	public String getOrderLink() {
		return this.orderLink;
	}
	public void setOrderLink(String orderLink) {
		this.orderLink = orderLink;
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

	public String getRegLink() {
		return this.regLink;
	}
	public void setRegLink(String regLink) {
		this.regLink = regLink;
	}

	public String getThirdNo() {
		return this.thirdNo;
	}
	public void setThirdNo(String thirdNo) {
		this.thirdNo = thirdNo;
	}

	public Date getTreatDate() {
		return this.treatDate;
	}
	public void setTreatDate(Date treatDate) {
		this.treatDate = treatDate;
	}

	public String getTreatDateExt() {
		return this.treatDateExt;
	}
	public void setTreatDateExt(String treatDateExt) {
		this.treatDateExt = treatDateExt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
