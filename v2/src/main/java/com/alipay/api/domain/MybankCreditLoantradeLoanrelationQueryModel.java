package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客户的申贷记录
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:44:03
 */
public class MybankCreditLoantradeLoanrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2514494265597599144L;

	/**
	 * 工商注册号或者身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 当客户为公司时，certtype是全国组织机构代码证书。当客户为个人时，是居民身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 预留的扩展字段
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 当客户是公司时，entityname是公司名全称；当客户是个人时，entityname是姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
