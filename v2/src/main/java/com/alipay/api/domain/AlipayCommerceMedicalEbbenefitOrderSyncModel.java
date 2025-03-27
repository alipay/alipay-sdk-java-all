package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务订单同步
 *
 * @author auto create
 * @since 1.0, 2025-03-13 16:47:23
 */
public class AlipayCommerceMedicalEbbenefitOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1425854113882399722L;

	/**
	 * 采购企业id （蚂蚁提供）
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 医生头像地址
	 */
	@ApiField("doctor_avatar_url")
	private String doctorAvatarUrl;

	/**
	 * 医生所在科室
	 */
	@ApiField("doctor_department")
	private String doctorDepartment;

	/**
	 * 医生教学职称
	 */
	@ApiField("doctor_education_title")
	private String doctorEducationTitle;

	/**
	 * 医生所在医院
	 */
	@ApiField("doctor_hospital")
	private String doctorHospital;

	/**
	 * 医生所在医院级别
	 */
	@ApiField("doctor_hospital_level")
	private String doctorHospitalLevel;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 会员id
	 */
	@ApiField("eb_user_id")
	private String ebUserId;

	/**
	 * 服务类型 
图文问诊:IMAGE_INQUIRY
电话问诊:PHONE_INQUIRY
视频问诊:VIDEO_INQUIRY
快速图文:QUICK_IMAGE_INQUIRY
快速电话:QUICK_PHONE_INQUIRY
快速视频:QUICK_VIDEO_INQUIRY
互联网门诊（电话）:
INTERNET_CLINIC_PHONE
互联网门诊（视频）:
INTERNET_CLINIC_VIDEO
门诊安排：CLINIC_ARRANGEMENT
住院安排：HOSPITALIZATION_ARRANGEMENTS
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 家庭成员年龄
	 */
	@ApiField("member_age")
	private String memberAge;

	/**
	 * 家庭成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 三方订单详情链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 三方im链接
	 */
	@ApiField("order_im_url")
	private String orderImUrl;

	/**
	 * 专家问诊：（待接诊、问诊中、已完成、已取消）体检解读：（待接诊、问诊中、已取消、已完成）家庭医生：（待接诊、问诊中、已取消、已完成）就医协助：（问诊中、已完成）
顾问服务：（进行中、已完成）
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单类型  专家问诊、体检解读、就医协助、家庭医生、顾问服务
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部订单id
	 */
	@ApiField("out_doctor_id")
	private String outDoctorId;

	/**
	 * 外部家庭成员id
	 */
	@ApiField("out_member_id")
	private String outMemberId;

	/**
	 * 外部订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部父单号
	 */
	@ApiField("out_parent_order_id")
	private String outParentOrderId;

	/**
	 * 外部子用户ID
	 */
	@ApiField("out_sub_user_id")
	private String outSubUserId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 产品id（蚂蚁提供）
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 服务提供企业id（蚂蚁提供）
	 */
	@ApiField("provide_company_id")
	private String provideCompanyId;

	/**
	 * 是否自费，1自费，0非自费
	 */
	@ApiField("self_funded")
	private String selfFunded;

	/**
	 * 订单创建 CREATE_ORDER,
状态同步 STATUS_CHANGE
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getDoctorAvatarUrl() {
		return this.doctorAvatarUrl;
	}
	public void setDoctorAvatarUrl(String doctorAvatarUrl) {
		this.doctorAvatarUrl = doctorAvatarUrl;
	}

	public String getDoctorDepartment() {
		return this.doctorDepartment;
	}
	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	public String getDoctorEducationTitle() {
		return this.doctorEducationTitle;
	}
	public void setDoctorEducationTitle(String doctorEducationTitle) {
		this.doctorEducationTitle = doctorEducationTitle;
	}

	public String getDoctorHospital() {
		return this.doctorHospital;
	}
	public void setDoctorHospital(String doctorHospital) {
		this.doctorHospital = doctorHospital;
	}

	public String getDoctorHospitalLevel() {
		return this.doctorHospitalLevel;
	}
	public void setDoctorHospitalLevel(String doctorHospitalLevel) {
		this.doctorHospitalLevel = doctorHospitalLevel;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getEbUserId() {
		return this.ebUserId;
	}
	public void setEbUserId(String ebUserId) {
		this.ebUserId = ebUserId;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getMemberAge() {
		return this.memberAge;
	}
	public void setMemberAge(String memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderImUrl() {
		return this.orderImUrl;
	}
	public void setOrderImUrl(String orderImUrl) {
		this.orderImUrl = orderImUrl;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutDoctorId() {
		return this.outDoctorId;
	}
	public void setOutDoctorId(String outDoctorId) {
		this.outDoctorId = outDoctorId;
	}

	public String getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(String outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutParentOrderId() {
		return this.outParentOrderId;
	}
	public void setOutParentOrderId(String outParentOrderId) {
		this.outParentOrderId = outParentOrderId;
	}

	public String getOutSubUserId() {
		return this.outSubUserId;
	}
	public void setOutSubUserId(String outSubUserId) {
		this.outSubUserId = outSubUserId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProvideCompanyId() {
		return this.provideCompanyId;
	}
	public void setProvideCompanyId(String provideCompanyId) {
		this.provideCompanyId = provideCompanyId;
	}

	public String getSelfFunded() {
		return this.selfFunded;
	}
	public void setSelfFunded(String selfFunded) {
		this.selfFunded = selfFunded;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
