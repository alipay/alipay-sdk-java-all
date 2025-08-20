package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方详情
 *
 * @author auto create
 * @since 1.0, 2025-07-17 15:33:53
 */
public class PrscVO extends AlipayObject {

	private static final long serialVersionUID = 2149298873349169115L;

	/**
	 * 订单渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 创建处方的时间，即开方时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 用药人性别,1-男 2-女
	 */
	@ApiField("gender")
	private Long gender;

	/**
	 * 用药人年龄,单位  天/月/岁
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 用药人证件号
	 */
	@ApiField("patient_id_no")
	private String patientIdNo;

	/**
	 * 用药人姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 用药人联系号码
	 */
	@ApiField("patient_phone_no")
	private String patientPhoneNo;

	/**
	 * 处方审核记录
	 */
	@ApiField("prescri_review")
	private PrescReview prescriReview;

	/**
	 * 处方业务类型 1-互医开方 2-处方外流
	 */
	@ApiField("prsc_biz_type")
	private Long prscBizType;

	/**
	 * 处方编号
	 */
	@ApiField("rx_code")
	private String rxCode;

	/**
	 * 开方医师姓名
	 */
	@ApiField("rx_doc_name")
	private String rxDocName;

	/**
	 * 处方唯一id
	 */
	@ApiField("rx_id")
	private String rxId;

	/**
	 * 处方的pdf访问地址链接
	 */
	@ApiField("rx_pdf")
	private String rxPdf;

	/**
	 * 处方笺图片链接
	 */
	@ApiField("rx_picture")
	private String rxPicture;

	/**
	 * 处方状态
	 */
	@ApiField("rx_status")
	private Long rxStatus;

	/**
	 * 商家id
	 */
	@ApiField("seller_key")
	private String sellerKey;

	/**
	 * 门店code
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 最近一次处方单更新时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private Date updateTime;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getGender() {
		return this.gender;
	}
	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientIdNo() {
		return this.patientIdNo;
	}
	public void setPatientIdNo(String patientIdNo) {
		this.patientIdNo = patientIdNo;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhoneNo() {
		return this.patientPhoneNo;
	}
	public void setPatientPhoneNo(String patientPhoneNo) {
		this.patientPhoneNo = patientPhoneNo;
	}

	public PrescReview getPrescriReview() {
		return this.prescriReview;
	}
	public void setPrescriReview(PrescReview prescriReview) {
		this.prescriReview = prescriReview;
	}

	public Long getPrscBizType() {
		return this.prscBizType;
	}
	public void setPrscBizType(Long prscBizType) {
		this.prscBizType = prscBizType;
	}

	public String getRxCode() {
		return this.rxCode;
	}
	public void setRxCode(String rxCode) {
		this.rxCode = rxCode;
	}

	public String getRxDocName() {
		return this.rxDocName;
	}
	public void setRxDocName(String rxDocName) {
		this.rxDocName = rxDocName;
	}

	public String getRxId() {
		return this.rxId;
	}
	public void setRxId(String rxId) {
		this.rxId = rxId;
	}

	public String getRxPdf() {
		return this.rxPdf;
	}
	public void setRxPdf(String rxPdf) {
		this.rxPdf = rxPdf;
	}

	public String getRxPicture() {
		return this.rxPicture;
	}
	public void setRxPicture(String rxPicture) {
		this.rxPicture = rxPicture;
	}

	public Long getRxStatus() {
		return this.rxStatus;
	}
	public void setRxStatus(Long rxStatus) {
		this.rxStatus = rxStatus;
	}

	public String getSellerKey() {
		return this.sellerKey;
	}
	public void setSellerKey(String sellerKey) {
		this.sellerKey = sellerKey;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
