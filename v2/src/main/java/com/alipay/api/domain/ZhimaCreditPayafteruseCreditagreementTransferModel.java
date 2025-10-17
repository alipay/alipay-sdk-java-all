package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转换为芝麻先用后付
 *
 * @author auto create
 * @since 1.0, 2025-08-21 15:44:20
 */
public class ZhimaCreditPayafteruseCreditagreementTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5441164713993522811L;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 芝麻开通/授权协议号，在用户开通芝麻先享服务后，由芝麻生成并返回给商户；只有当opertaion_type传入AGREEMENT_TRANSFER值是，该字段必传；其他场景不需要传入
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

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
	 * AGREEMENT_TRANSFER代表是存量先享协议的主体切换功能；其他场景不需要传入；默认为空；
	 */
	@ApiField("operation_type")
	private String operationType;

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

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
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

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
