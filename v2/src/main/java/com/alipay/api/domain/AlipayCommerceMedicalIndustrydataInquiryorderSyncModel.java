package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新_问诊订单回流接口
 *
 * @author auto create
 * @since 1.0, 2025-04-27 14:29:35
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7148848542222948174L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单金额，单位元，保留小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private PlatformInquiryOrderExtInfo extInfo;

	/**
	 * 外部排班Id
	 */
	@ApiField("ext_shift_case_id")
	private String extShiftCaseId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 枚举值：
图文问诊:IMAGE_INQUIRY
电话问诊:PHONE_INQUIRY
视频问诊:VIDEO_INQUIRY
快速图文:QUICK_IMAGE_INQUIRY
快速电话:QUICK_PHONE_INQUIRY
快速视频:QUICK_VIDEO_INQUIR
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 枚举值：
咨询:FIRST_CONSULTATION
复诊:FURTHER_CONSULTATION
报告解读:REPORT_INTERPRET
会诊:MEETING_CONSULTATION
义诊:FREE_CONSULTATION
咨询+复诊:FIRST_FURTHER_CONSULTATION
加号:PLUS_REGISTER
	 */
	@ApiField("inquiry_type")
	private String inquiryType;

	/**
	 * 外部平台医生id
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 必须是支付宝小程序链接
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 待支付：WAIT_PAY、待接诊：WAIT_INQUIRY
订单在待支付/待接诊状态时回流
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 订单创建时间，不可晚于当前时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 枚举值：
是:Y
否:N
	 */
	@ApiField("order_hidden_flag")
	private String orderHiddenFlag;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private Date orderModifiedTime;

	/**
	 * 枚举值：
问诊订单:INQUIRY_ORDER
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * out_biz_no，唯一，外部商户自有订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 枚举值：
问诊订单:INQUIRY_ORDER
义诊订单:PUBLIC_WELFARE
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 患者年龄
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 患者身份证号
	 */
	@ApiField("patient_idcard")
	private String patientIdcard;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 患者手机号
	 */
	@ApiField("patient_phone")
	private String patientPhone;

	/**
	 * 枚举值：
男：MALE 
女：FEMALE
	 */
	@ApiField("patient_sex")
	private String patientSex;

	/**
	 * 平台编码号
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 实际支付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 预约问诊时间
	 */
	@ApiField("scheduled_time")
	private Date scheduledTime;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public PlatformInquiryOrderExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(PlatformInquiryOrderExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getExtShiftCaseId() {
		return this.extShiftCaseId;
	}
	public void setExtShiftCaseId(String extShiftCaseId) {
		this.extShiftCaseId = extShiftCaseId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getInquiryType() {
		return this.inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderHiddenFlag() {
		return this.orderHiddenFlag;
	}
	public void setOrderHiddenFlag(String orderHiddenFlag) {
		this.orderHiddenFlag = orderHiddenFlag;
	}

	public Date getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(Date orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientIdcard() {
		return this.patientIdcard;
	}
	public void setPatientIdcard(String patientIdcard) {
		this.patientIdcard = patientIdcard;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhone() {
		return this.patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientSex() {
		return this.patientSex;
	}
	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

}
