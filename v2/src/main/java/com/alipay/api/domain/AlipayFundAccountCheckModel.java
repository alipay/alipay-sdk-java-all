package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业账户一致性校验
 *
 * @author auto create
 * @since 1.0, 2024-05-11 10:08:01
 */
public class AlipayFundAccountCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4688115848464166956L;

	/**
	 * 支付宝会员的登陆外标，仅支持邮箱或手机号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 待识别的主体证件号（营业执照、统一社会信用代码）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 待识别的用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
