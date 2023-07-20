package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署人信息
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class Signer extends AlipayObject {

	private static final long serialVersionUID = 2383737619149162211L;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 证件号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 证件类型,详见个人证件类型说明（http://open.esign.cn/docs/xy/%E6%8E%A5%E5%8F%A3%E6%96%87%E6%A1%A3/%E9%99%84%E5%BD%95/%E4%B8%AA%E4%BA%BA%E8%AF%81%E4%BB%B6%E7%B1%BB%E5%9E%8B.html），默认CRED_PSN_CH_IDCARD (证件号不为空，则必填)
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
