package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约公司主体信息
 *
 * @author auto create
 * @since 1.0, 2020-03-25 15:57:56
 */
public class CorpEntity extends AlipayObject {

	private static final long serialVersionUID = 1398445649714752693L;

	/**
	 * 企业支付宝登录账号(邮箱或手机号)
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 企业统一社会信用编码
	 */
	@ApiField("corp_code")
	private String corpCode;

	/**
	 * xxx测试公司
	 */
	@ApiField("corp_name")
	private String corpName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getCorpCode() {
		return this.corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

}
