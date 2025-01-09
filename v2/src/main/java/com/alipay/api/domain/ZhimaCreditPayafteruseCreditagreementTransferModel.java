package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转换为芝麻先用后付
 *
 * @author auto create
 * @since 1.0, 2024-12-17 17:36:17
 */
public class ZhimaCreditPayafteruseCreditagreementTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4569577467297797569L;

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
	 * 业务扩展参数，Json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 商户外部协议号，不同的支付宝用户需要传递不同的外部单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 商户签约的芝麻产品的产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
