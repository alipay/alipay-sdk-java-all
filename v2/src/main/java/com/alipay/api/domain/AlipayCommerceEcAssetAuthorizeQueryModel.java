package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码授结果查询
 *
 * @author auto create
 * @since 1.0, 2024-10-16 14:01:18
 */
public class AlipayCommerceEcAssetAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4822529711825554872L;

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
	 * 企业统一社会信用代码，与enterprise_id二选一
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业码内部自动生成企业唯一标识，与enterprise_code二选一
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

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
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
