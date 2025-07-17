package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票企业信息、税务信息
 *
 * @author auto create
 * @since 1.0, 2020-01-16 17:52:20
 */
public class InvoiceCompanyInfo extends AlipayObject {

	private static final long serialVersionUID = 7163917869554695396L;

	/**
	 * 发票限额信息，列表类型，按不同票种拆分发票限额
	 */
	@ApiListField("amount_limit_info")
	@ApiField("invoice_amount_limit_info")
	private List<InvoiceAmountLimitInfo> amountLimitInfo;

	/**
	 * 企业所在区
	 */
	@ApiField("area")
	private String area;

	/**
	 * 开户行账号
	 */
	@ApiField("bank_account_id")
	private String bankAccountId;

	/**
	 * 开户行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 企业所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业类型，可选值：
一般纳税人：1;
小规模纳税人：2;
起征点以下纳税人：3;
	 */
	@ApiField("company_type")
	private Long companyType;

	/**
	 * 默认商品名称
	 */
	@ApiField("default_item_name")
	private String defaultItemName;

	/**
	 * 默认税收分类编码
	 */
	@ApiField("default_tax_code")
	private String defaultTaxCode;

	/**
	 * 税率，格式为小数
	 */
	@ApiField("default_tax_rate")
	private String defaultTaxRate;

	/**
	 * 企业地址
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 拓展字段, json格式
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 盘号，为列表类型
	 */
	@ApiListField("invoice_disks")
	@ApiField("string")
	private List<String> invoiceDisks;

	/**
	 * 税号可开发票类型，列表类型。
可选值： 增值税电子普通发票：PLAIN, 增值税专用发票：SPECIAL， 增值税普通发票：PLAIN_INVOICE，增值税普通发票(卷式)：PAPER_INVOICE
	 */
	@ApiListField("invoice_kinds")
	@ApiField("string")
	private List<String> invoiceKinds;

	/**
	 * 企业电话
	 */
	@ApiField("invoice_phone")
	private String invoicePhone;

	/**
	 * 复核人
	 */
	@ApiField("payee_checker")
	private String payeeChecker;

	/**
	 * 默认开票人
	 */
	@ApiField("payee_operator")
	private String payeeOperator;

	/**
	 * 收款人
	 */
	@ApiField("payee_receiver")
	private String payeeReceiver;

	/**
	 * 纳税人识别号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 税控服务商，由服务商在中台入驻后生成
	 */
	@ApiField("provider_key")
	private String providerKey;

	/**
	 * 企业所在省/直辖市
	 */
	@ApiField("province")
	private String province;

	/**
	 * 产品类型，产品码由中台定义。
对应支付宝开票系统中的 productCode, 默认为DOCK_TAX_OPEN 税控托管产品
	 */
	@ApiField("tax_feature")
	private String taxFeature;

	/**
	 * 商户在税控服务开通后，税控厂商会向商户分配秘钥并提供token的生成方法，商户或ISV利用该方法生成token以获得此次调用的操作权限。
目前对于阿里平台来说，不需要校验该权限，如果底层税控对接的是阿里平台的话，该字段可不填，其它的税控厂商该字段为必填。
register_type=init时候必填
	 */
	@ApiField("tax_token")
	private String taxToken;

	public List<InvoiceAmountLimitInfo> getAmountLimitInfo() {
		return this.amountLimitInfo;
	}
	public void setAmountLimitInfo(List<InvoiceAmountLimitInfo> amountLimitInfo) {
		this.amountLimitInfo = amountLimitInfo;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getBankAccountId() {
		return this.bankAccountId;
	}
	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(Long companyType) {
		this.companyType = companyType;
	}

	public String getDefaultItemName() {
		return this.defaultItemName;
	}
	public void setDefaultItemName(String defaultItemName) {
		this.defaultItemName = defaultItemName;
	}

	public String getDefaultTaxCode() {
		return this.defaultTaxCode;
	}
	public void setDefaultTaxCode(String defaultTaxCode) {
		this.defaultTaxCode = defaultTaxCode;
	}

	public String getDefaultTaxRate() {
		return this.defaultTaxRate;
	}
	public void setDefaultTaxRate(String defaultTaxRate) {
		this.defaultTaxRate = defaultTaxRate;
	}

	public String getDetailedAddress() {
		return this.detailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public List<String> getInvoiceDisks() {
		return this.invoiceDisks;
	}
	public void setInvoiceDisks(List<String> invoiceDisks) {
		this.invoiceDisks = invoiceDisks;
	}

	public List<String> getInvoiceKinds() {
		return this.invoiceKinds;
	}
	public void setInvoiceKinds(List<String> invoiceKinds) {
		this.invoiceKinds = invoiceKinds;
	}

	public String getInvoicePhone() {
		return this.invoicePhone;
	}
	public void setInvoicePhone(String invoicePhone) {
		this.invoicePhone = invoicePhone;
	}

	public String getPayeeChecker() {
		return this.payeeChecker;
	}
	public void setPayeeChecker(String payeeChecker) {
		this.payeeChecker = payeeChecker;
	}

	public String getPayeeOperator() {
		return this.payeeOperator;
	}
	public void setPayeeOperator(String payeeOperator) {
		this.payeeOperator = payeeOperator;
	}

	public String getPayeeReceiver() {
		return this.payeeReceiver;
	}
	public void setPayeeReceiver(String payeeReceiver) {
		this.payeeReceiver = payeeReceiver;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getProviderKey() {
		return this.providerKey;
	}
	public void setProviderKey(String providerKey) {
		this.providerKey = providerKey;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getTaxFeature() {
		return this.taxFeature;
	}
	public void setTaxFeature(String taxFeature) {
		this.taxFeature = taxFeature;
	}

	public String getTaxToken() {
		return this.taxToken;
	}
	public void setTaxToken(String taxToken) {
		this.taxToken = taxToken;
	}

}
