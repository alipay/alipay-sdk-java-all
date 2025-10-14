package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款条款
 *
 * @author auto create
 * @since 1.0, 2022-09-30 14:56:13
 */
public class PayContractDTO extends AlipayObject {

	private static final long serialVersionUID = 6668336977299166335L;

	/**
	 * 账号扩展属性，主要是国际付款涉及到的swfitcode信息
	 */
	@ApiField("account_ext_info")
	private MapTypeParam accountExtInfo;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行卡:BANKCARD
支付宝账号:ALIPAYACCOUNT
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * P2P为PO号，O2P为合约号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 合约来源，与合约号一起确认路由查询合约信息
	 */
	@ApiField("agreement_source")
	private String agreementSource;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pdcode")
	private String bizPdcode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * OU公司代码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 币种代码，人民币:156
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 幂等号
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 蚂蚁商户2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * pid来源
	 */
	@ApiField("ip_role_source")
	private String ipRoleSource;

	/**
	 * 发起人/操作者的域账号，发起审批后作为展示需要
	 */
	@ApiField("operator_domain_id")
	private String operatorDomainId;

	/**
	 * 付款条款明细
	 */
	@ApiListField("pay_contract_items")
	@ApiField("pay_contract_item_d_t_o")
	private List<PayContractItemDTO> payContractItems;

	/**
	 * 付款类型，货到付款:PAY_AFTER_RECEIPT,阶段付款:MILESTONE
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 端产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 签约销售产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	/**
	 * 系统来源
	 */
	@ApiField("source")
	private String source;

	public MapTypeParam getAccountExtInfo() {
		return this.accountExtInfo;
	}
	public void setAccountExtInfo(MapTypeParam accountExtInfo) {
		this.accountExtInfo = accountExtInfo;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementSource() {
		return this.agreementSource;
	}
	public void setAgreementSource(String agreementSource) {
		this.agreementSource = agreementSource;
	}

	public String getBizPdcode() {
		return this.bizPdcode;
	}
	public void setBizPdcode(String bizPdcode) {
		this.bizPdcode = bizPdcode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleSource() {
		return this.ipRoleSource;
	}
	public void setIpRoleSource(String ipRoleSource) {
		this.ipRoleSource = ipRoleSource;
	}

	public String getOperatorDomainId() {
		return this.operatorDomainId;
	}
	public void setOperatorDomainId(String operatorDomainId) {
		this.operatorDomainId = operatorDomainId;
	}

	public List<PayContractItemDTO> getPayContractItems() {
		return this.payContractItems;
	}
	public void setPayContractItems(List<PayContractItemDTO> payContractItems) {
		this.payContractItems = payContractItems;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
