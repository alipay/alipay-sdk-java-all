package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交入驻工单信息
 *
 * @author auto create
 * @since 1.0, 2020-04-13 09:54:25
 */
public class AlipayEbppInvoiceRegisterCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1596554212255945768L;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_info")
	private InvoiceContactInfo contactInfo;

	/**
	 * 拓展字段，json格式
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 企业税务信息
	 */
	@ApiField("invoice_company")
	private InvoiceCompanyInfo invoiceCompany;

	/**
	 * 发票订购信息。当业务前台是由服务市场订购后发起入驻时，且register_type是new后者renew时，必填；register_type是init或者online时，为空；
	 */
	@ApiListField("invoice_order")
	@ApiField("invoice_order_info")
	private List<InvoiceOrderInfo> invoiceOrder;

	/**
	 * 支付宝开票链路必传，
定义商户的一级简称，用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。 
只能包含大小写字母，数字，或下划线。匹配规则：^[A-Za-z0-9][A-Za-z_0-9]*$
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 外部业务幂等ID,由业务方自己生成
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 业务平台code, 由发票中台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台商户ID/用户ID
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 入驻类型，可选值：
新订购：new，续订：renew，已有税控初始化：init，线下商户上线：online
	 */
	@ApiField("register_type")
	private String registerType;

	/**
	 * 支付宝开票链路必传，
定义商户的二级简称，用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。 如：肯德基-杭州西湖区文一西路店：KFC_HZ_19003 要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
只能包含大小写字母，数字，或下划线。匹配规则：^[A-Za-z0-9][A-Za-z_0-9]*$
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public InvoiceContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(InvoiceContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public InvoiceCompanyInfo getInvoiceCompany() {
		return this.invoiceCompany;
	}
	public void setInvoiceCompany(InvoiceCompanyInfo invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}

	public List<InvoiceOrderInfo> getInvoiceOrder() {
		return this.invoiceOrder;
	}
	public void setInvoiceOrder(List<InvoiceOrderInfo> invoiceOrder) {
		this.invoiceOrder = invoiceOrder;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getRegisterType() {
		return this.registerType;
	}
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
