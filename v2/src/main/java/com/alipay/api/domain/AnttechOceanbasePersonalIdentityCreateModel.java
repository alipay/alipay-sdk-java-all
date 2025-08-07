package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝授权个人认证信息传入主站
 *
 * @author auto create
 * @since 1.0, 2024-03-27 16:21:25
 */
public class AnttechOceanbasePersonalIdentityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6624575441941331271L;

	/**
	 * 实人认证姓名
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 使用国密4加密后的身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * oceanbase官网登录后唯一标识
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
