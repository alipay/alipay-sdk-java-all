package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 记账本通知订阅关系查询
 *
 * @author auto create
 * @since 1.0, 2022-10-31 11:13:15
 */
public class AlipayFundAccountbookNotifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4371657939793347282L;

	/**
	 * 记账本ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 协议号。 若是基于协议的记账本，则agreement_no必传； 若是自创建的记账本，则agreement_no不传；
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码。固定为DEFAULT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 产品码。固定为SATF_FUND_BOOK
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
