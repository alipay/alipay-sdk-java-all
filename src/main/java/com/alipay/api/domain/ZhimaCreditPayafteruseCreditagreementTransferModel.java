package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转换为芝麻先用后付
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:25:52
 */
public class ZhimaCreditPayafteruseCreditagreementTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4577255152281922456L;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 用户的代扣协议号
	 */
	@ApiField("deduct_agreement_no")
	private String deductAgreementNo;

	/**
	 * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 芝麻信用服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDeductAgreementNo() {
		return this.deductAgreementNo;
	}
	public void setDeductAgreementNo(String deductAgreementNo) {
		this.deductAgreementNo = deductAgreementNo;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
