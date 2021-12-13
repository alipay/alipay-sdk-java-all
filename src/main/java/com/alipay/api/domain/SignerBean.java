package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署人信息
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:44:20
 */
public class SignerBean extends AlipayObject {

	private static final long serialVersionUID = 5283765161492634926L;

	/**
	 * 个人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 个人证件号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 个人证件类型（证件号不为空时必填，详见个人证件类型说明 ）
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 个人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 个人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 企业信息，signType=org时必填
	 */
	@ApiField("org")
	private Org org;

	/**
	 * 个人唯一标识：可传入平台的个人用户id、支付宝userid、证件号、手机号、邮箱等。
	 */
	@ApiField("third_party_user_id")
	private String thirdPartyUserId;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Org getOrg() {
		return this.org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}
	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
	}

}
