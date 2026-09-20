package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单干系人列表
 *
 * @author auto create
 * @since 1.0, 2026-09-10 10:42:56
 */
public class PolicyPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 6854322562766664247L;

	/**
	 * 干系人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 干系人证件类型
01	身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 干系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 干系人类型
HOLDER 	投保人
INSURED  被保人
	 */
	@ApiField("person_type")
	private String personType;

	/**
	 * 干系人联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 与投保人关系
1	本人
2	配偶
3	父母
4	子女
5	其他
	 */
	@ApiField("relation_to_holder")
	private String relationToHolder;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPersonType() {
		return this.personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationToHolder() {
		return this.relationToHolder;
	}
	public void setRelationToHolder(String relationToHolder) {
		this.relationToHolder = relationToHolder;
	}

}
