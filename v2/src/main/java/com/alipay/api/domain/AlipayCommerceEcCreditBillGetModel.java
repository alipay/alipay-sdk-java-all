package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划查询
 *
 * @author auto create
 * @since 1.0, 2024-07-08 14:33:14
 */
public class AlipayCommerceEcCreditBillGetModel extends AlipayObject {

	private static final long serialVersionUID = 6761627247475156944L;

	/**
	 * 通过企业码1.0接口签约的共同账户，和agreement_no搭配使用。 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 可通过签约消息获取。配合共同账户id使用，当填写企业共同账户id时，此字段必填。 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 授信资产类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 账单月
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 企业Id，企业入驻企业码时自动分配的用于唯一标识的编号
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
