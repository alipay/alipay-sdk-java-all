package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台用户模型
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:47:50
 */
public class InsOpenUserDTO extends AlipayObject {

	private static final long serialVersionUID = 2131313681136791751L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 证件名称
	 */
	@ApiField("id_card_name")
	private String idCardName;

	/**
	 * 证件号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 10身份证；22社会统一信用代码；55护照；23营业执照
	 */
	@ApiField("id_card_type")
	private Long idCardType;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCardName() {
		return this.idCardName;
	}
	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public Long getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(Long idCardType) {
		this.idCardType = idCardType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
