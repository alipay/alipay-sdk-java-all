package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:41:31
 */
public class AlipayOpenPublicAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5568844338696477621L;

	/**
	 * 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

}
