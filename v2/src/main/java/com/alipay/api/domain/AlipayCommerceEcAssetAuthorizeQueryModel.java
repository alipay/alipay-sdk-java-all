package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码授结果查询
 *
 * @author auto create
 * @since 1.0, 2024-07-08 14:33:16
 */
public class AlipayCommerceEcAssetAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1651317199427421949L;

	/**
	 * 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 当前字段已废弃(历史兼容逻辑冗余的字段统一移除)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 当前字段已废弃(历史兼容逻辑冗余的字段统一移除)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 企业Id，企业入驻企业码时自动分配的用于唯一标识的编号
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
