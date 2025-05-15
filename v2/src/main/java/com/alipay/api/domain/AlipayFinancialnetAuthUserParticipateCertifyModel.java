package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 以旧换新政府补贴资格认证接口
 *
 * @author auto create
 * @since 1.0, 2025-01-10 16:23:19
 */
public class AlipayFinancialnetAuthUserParticipateCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 2714329764292762718L;

	/**
	 * 进行认证的证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 代表进行认证的证件类型（如：身份证）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 进行认证的用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 进行认证的用户的手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 传入外部商户的名称即可，记录发起认证的用户来自哪一个外部商户
	 */
	@ApiField("source")
	private String source;

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

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
