package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业商业化健康档案同步接口
 *
 * @author auto create
 * @since 1.0, 2025-05-27 17:09:03
 */
public class AlipayCommerceMedicalCommercialHealtharchivesSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6682991719145744424L;

	/**
	 * 用户年龄
	 */
	@ApiField("age")
	private String age;

	/**
	 * 记录商家同步的健康档案类型
	 */
	@ApiField("archives_type")
	private String archivesType;

	/**
	 * 用户user_id，做了open_id映射
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 健康档案信息
	 */
	@ApiField("dental_inquiry_archives_info")
	private DentalInquiryArchivesInfo dentalInquiryArchivesInfo;

	/**
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 记录商户健康档案ID，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getArchivesType() {
		return this.archivesType;
	}
	public void setArchivesType(String archivesType) {
		this.archivesType = archivesType;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public DentalInquiryArchivesInfo getDentalInquiryArchivesInfo() {
		return this.dentalInquiryArchivesInfo;
	}
	public void setDentalInquiryArchivesInfo(DentalInquiryArchivesInfo dentalInquiryArchivesInfo) {
		this.dentalInquiryArchivesInfo = dentalInquiryArchivesInfo;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
