package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业税务信息
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:59:33
 */
public class InvoiceCompanyDTO extends AlipayObject {

	private static final long serialVersionUID = 3857958548879345281L;

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
	 * 入驻商户的营业执照，图像二进制数据的base64编码
	 */
	@ApiField("business_license_img")
	private String businessLicenseImg;

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
	 * 企业类型，可选值： 一般纳税人：1，小规模纳税人：2，起征点以下纳税人：3
	 */
	@ApiField("company_type")
	private Long companyType;

	/**
	 * 商品名称
	 */
	@ApiField("default_item_name")
	private String defaultItemName;

	/**
	 * 税收分类编码
	 */
	@ApiField("default_tax_code")
	private String defaultTaxCode;

	/**
	 * 税率
	 */
	@ApiField("default_tax_rate")
	private String defaultTaxRate;

	/**
	 * 企业地址
	 */
	@ApiField("detailed_address")
	private String detailedAddress;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 税盘
	 */
	@ApiListField("invoice_disks")
	@ApiField("string")
	private List<String> invoiceDisks;

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
	 * 开票人
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
	 * 企业所在省/直辖市
	 */
	@ApiField("province")
	private String province;

	/**
	 * 商户在税控服务开通后，税控厂商会向商户分配秘钥并提供token的生成方法，商户或ISV利用该方法生成token以获得此次调用的操作权限
	 */
	@ApiField("tax_token")
	private String taxToken;

	/**
	 * 0税率标识，可选值：出口零税率：0，免税：1，不征收：2，普通零税率：3
	 */
	@ApiField("zero_tax_rate_flag")
	private String zeroTaxRateFlag;

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

	public String getBusinessLicenseImg() {
		return this.businessLicenseImg;
	}
	public void setBusinessLicenseImg(String businessLicenseImg) {
		this.businessLicenseImg = businessLicenseImg;
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

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getTaxToken() {
		return this.taxToken;
	}
	public void setTaxToken(String taxToken) {
		this.taxToken = taxToken;
	}

	public String getZeroTaxRateFlag() {
		return this.zeroTaxRateFlag;
	}
	public void setZeroTaxRateFlag(String zeroTaxRateFlag) {
		this.zeroTaxRateFlag = zeroTaxRateFlag;
	}

}
