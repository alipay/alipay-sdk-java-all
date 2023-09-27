package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码授结果查询
 *
 * @author auto create
 * @since 1.0, 2023-09-22 14:09:53
 */
public class AlipayCommerceEcAssetAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7446156633864975924L;

	/**
	 * 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 通过企业码2.0签约接口签约，只填写企业id，无需填写共同账户id和授权签约协议号。
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 授信申请时传入的外部业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
