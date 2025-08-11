package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户签约申请
 *
 * @author auto create
 * @since 1.0, 2025-07-28 19:29:06
 */
public class AlipayCommerceEcFundSignApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7353813933329596651L;

	/**
	 * 系统自动生成企业唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 出资账户类型
	 */
	@ApiField("fund_account_type")
	private String fundAccountType;

	/**
	 * 是否进行企业同人校验，检验信息为社会信用代码
默认开启
	 */
	@ApiField("identity_verify")
	private Boolean identityVerify;

	/**
	 * 签约终端类型
	 */
	@ApiField("sign_terminal")
	private String signTerminal;

	/**
	 * 签约人支付宝账号类型
	 */
	@ApiField("signer_category")
	private String signerCategory;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getFundAccountType() {
		return this.fundAccountType;
	}
	public void setFundAccountType(String fundAccountType) {
		this.fundAccountType = fundAccountType;
	}

	public Boolean getIdentityVerify() {
		return this.identityVerify;
	}
	public void setIdentityVerify(Boolean identityVerify) {
		this.identityVerify = identityVerify;
	}

	public String getSignTerminal() {
		return this.signTerminal;
	}
	public void setSignTerminal(String signTerminal) {
		this.signTerminal = signTerminal;
	}

	public String getSignerCategory() {
		return this.signerCategory;
	}
	public void setSignerCategory(String signerCategory) {
		this.signerCategory = signerCategory;
	}

}
