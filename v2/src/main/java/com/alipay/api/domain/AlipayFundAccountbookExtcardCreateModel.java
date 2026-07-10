package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账本外标卡创建
 *
 * @author auto create
 * @since 1.0, 2026-07-09 19:50:18
 */
public class AlipayFundAccountbookExtcardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6789511694474117758L;

	/**
	 * 记账账簿id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 支付宝协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外标卡类型
	 */
	@ApiField("out_card_type")
	private String outCardType;

	/**
	 * 产品码
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

	public String getOutCardType() {
		return this.outCardType;
	}
	public void setOutCardType(String outCardType) {
		this.outCardType = outCardType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
