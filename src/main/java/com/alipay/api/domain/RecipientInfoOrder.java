package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无账单申请开票购方邮寄信息
 *
 * @author auto create
 * @since 1.0, 2022-04-14 16:09:02
 */
public class RecipientInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 8323793842847341778L;

	/**
	 * 收件地址的详细地址，寄出纸质发票时方便快递员找到地府
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 购方的收件人的电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 购方的pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 购方收件人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 购方收件人的手机号
	 */
	@ApiField("telephone")
	private String telephone;

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
