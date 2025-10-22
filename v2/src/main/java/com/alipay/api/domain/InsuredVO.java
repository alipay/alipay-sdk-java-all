package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 被保人对象
 *
 * @author auto create
 * @since 1.0, 2025-10-16 14:04:42
 */
public class InsuredVO extends AlipayObject {

	private static final long serialVersionUID = 6872458265232125475L;

	/**
	 * 被保人出生日期
格式：
yyyy-MM-dd
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 被保人证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 公民身份证I，户口簿H
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 被保人性别 
男-M
女-F
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 被保人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被保人电话号码
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 名称	代码
本人	0
配偶	1
父母	2
子女	3
其他	14
	 */
	@ApiField("relation_to_ph")
	private String relationToPh;

	/**
	 * 子订单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRelationToPh() {
		return this.relationToPh;
	}
	public void setRelationToPh(String relationToPh) {
		this.relationToPh = relationToPh;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

}
