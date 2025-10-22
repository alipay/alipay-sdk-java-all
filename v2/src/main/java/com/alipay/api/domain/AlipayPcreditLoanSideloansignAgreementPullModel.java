package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 代签协议获取
 *
 * @author auto create
 * @since 1.0, 2025-07-25 14:59:53
 */
public class AlipayPcreditLoanSideloansignAgreementPullModel extends AlipayObject {

	private static final long serialVersionUID = 6464469545774524566L;

	/**
	 * 信贷业务场景类型Code
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 支付宝用户id，客户在支付宝的身份证
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 授信类型
	 */
	@ApiField("credit_type")
	private String creditType;

	/**
	 * 传入拉取代签协议列表前, 扩展信息透传相关业务场景的咨询结果信息
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 授信机构Id
	 */
	@ApiField("fund_supplier_code")
	private String fundSupplierCode;

	/**
	 * 授信机构id列表
	 */
	@ApiListField("fund_supplier_code_list")
	@ApiField("string")
	private List<String> fundSupplierCodeList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁借贷款产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 子授信模式，目前仅在签支合一的情况下传入
	 */
	@ApiField("sub_credit_type")
	private String subCreditType;

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCreditType() {
		return this.creditType;
	}
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFundSupplierCode() {
		return this.fundSupplierCode;
	}
	public void setFundSupplierCode(String fundSupplierCode) {
		this.fundSupplierCode = fundSupplierCode;
	}

	public List<String> getFundSupplierCodeList() {
		return this.fundSupplierCodeList;
	}
	public void setFundSupplierCodeList(List<String> fundSupplierCodeList) {
		this.fundSupplierCodeList = fundSupplierCodeList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubCreditType() {
		return this.subCreditType;
	}
	public void setSubCreditType(String subCreditType) {
		this.subCreditType = subCreditType;
	}

}
