package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健管订单创建
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class AlipayCommerceMedicalHmEquityorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2425775716951712378L;

	/**
	 * null
	 */
	@ApiListField("appoint_info_list")
	@ApiField("hm_appoint_info")
	private List<HmAppointInfo> appointInfoList;

	/**
	 * 基础权益Code
	 */
	@ApiField("benefit_code")
	private String benefitCode;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_serial_no")
	private String bizSerialNo;

	/**
	 * 订单的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户证件号
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 该字段定义的枚举为:
中国居民身份证:IDENTITY_CARD
军人证:THE_MILITARY_CARD
港澳回乡证或台胞证:BACK_HOMETOWN_CARD
台湾通行证:HOME_VISIT_PERMIT_TAIWAN
护照:PASSPORT
港澳台居民居住证:RESIDENCE_PERMIT_HK_MC_TW
外国人永久居留身份证:PERMANENT_RESIDENCE_FOREIGNER
港澳通行证:HOME_VISIT_PERMIT_HK_MC
其他证件:OTHER_CARD
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 权益包编码
	 */
	@ApiField("equity_package_code")
	private String equityPackageCode;

	/**
	 * 健管用户ID（UID）
	 */
	@ApiField("hm_uid")
	private String hmUid;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 订单创建时间（yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 该字段定义的枚举为:
线上购药:BUY_MEDICINE
折扣购药:DISCOUNT_MEDICINE
全年无限次图文问诊:GRAPHICS_INQUIRY
全年无限次视频问诊:VIDEO_INQUIRY
就医绿通:GREEN_CHANNEL
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部out_uid
	 */
	@ApiField("out_uid")
	private String outUid;

	/**
	 * null
	 */
	@ApiListField("pay_info_list")
	@ApiField("hm_pay_info")
	private List<HmPayInfo> payInfoList;

	/**
	 * null
	 */
	@ApiListField("product_info_list")
	@ApiField("hm_product_info")
	private List<HmProductInfo> productInfoList;

	/**
	 * null
	 */
	@ApiListField("refund_info_list")
	@ApiField("hm_refund_info")
	private List<HmRefundInfo> refundInfoList;

	/**
	 * 供应商订单号
	 */
	@ApiField("supplier_order_id")
	private String supplierOrderId;

	/**
	 * 订单的总金额（所有费用总金额）单位：分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/**
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 支付宝uid
	 */
	@ApiField("uid_open_id")
	private String uidOpenId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public List<HmAppointInfo> getAppointInfoList() {
		return this.appointInfoList;
	}
	public void setAppointInfoList(List<HmAppointInfo> appointInfoList) {
		this.appointInfoList = appointInfoList;
	}

	public String getBenefitCode() {
		return this.benefitCode;
	}
	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

	public String getBizSerialNo() {
		return this.bizSerialNo;
	}
	public void setBizSerialNo(String bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertificateNo() {
		return this.certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getEquityPackageCode() {
		return this.equityPackageCode;
	}
	public void setEquityPackageCode(String equityPackageCode) {
		this.equityPackageCode = equityPackageCode;
	}

	public String getHmUid() {
		return this.hmUid;
	}
	public void setHmUid(String hmUid) {
		this.hmUid = hmUid;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutUid() {
		return this.outUid;
	}
	public void setOutUid(String outUid) {
		this.outUid = outUid;
	}

	public List<HmPayInfo> getPayInfoList() {
		return this.payInfoList;
	}
	public void setPayInfoList(List<HmPayInfo> payInfoList) {
		this.payInfoList = payInfoList;
	}

	public List<HmProductInfo> getProductInfoList() {
		return this.productInfoList;
	}
	public void setProductInfoList(List<HmProductInfo> productInfoList) {
		this.productInfoList = productInfoList;
	}

	public List<HmRefundInfo> getRefundInfoList() {
		return this.refundInfoList;
	}
	public void setRefundInfoList(List<HmRefundInfo> refundInfoList) {
		this.refundInfoList = refundInfoList;
	}

	public String getSupplierOrderId() {
		return this.supplierOrderId;
	}
	public void setSupplierOrderId(String supplierOrderId) {
		this.supplierOrderId = supplierOrderId;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUidOpenId() {
		return this.uidOpenId;
	}
	public void setUidOpenId(String uidOpenId) {
		this.uidOpenId = uidOpenId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
