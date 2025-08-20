package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展数据,兼容授信专户业务参数
 *
 * @author auto create
 * @since 1.0, 2025-01-07 17:06:29
 */
public class ParticipantBizParam extends AlipayObject {

	private static final long serialVersionUID = 4363752822988737744L;

	/**
	 * 代发专户ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 出资比例
	 */
	@ApiField("fund_ratio")
	private String fundRatio;

	/**
	 * 出资类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 间连商户ID
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 间连商户类型
	 */
	@ApiField("sub_merchant_id_type")
	private String subMerchantIdType;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(String fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantIdType() {
		return this.subMerchantIdType;
	}
	public void setSubMerchantIdType(String subMerchantIdType) {
		this.subMerchantIdType = subMerchantIdType;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
