package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AddressInfo;
import com.alipay.api.domain.BankCardInfo;
import com.alipay.api.domain.ContactInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-30 11:35:00
 */
public class AntMerchantExpandIndirectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7814584396482595919L;

	/** 
	 * 商户地址信息
	 */
	@ApiListField("address_info")
	@ApiField("address_info")
	private List<AddressInfo> addressInfo;

	/** 
	 * 商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/** 
	 * 商户对应银行所开立的结算卡信息
	 */
	@ApiListField("bankcard_info")
	@ApiField("bank_card_info")
	private List<BankCardInfo> bankcardInfo;

	/** 
	 * 商户证件编号（企业或者个体工商户提供营业执照，事业单位提供事证号）
	 */
	@ApiField("business_license")
	private String businessLicense;

	/** 
	 * 商户证件类型，取值范围：NATIONAL_LEGAL：营业执照；NATIONAL_LEGAL_MERGE:营业执照(多证合一)；INST_RGST_CTF：事业单位法人证书
	 */
	@ApiField("business_license_type")
	private String businessLicenseType;

	/** 
	 * 商户经营类目，参考文档：https://doc.open.alipay.com/doc2/detail?&docType=1&articleId=105444
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商户联系人信息
	 */
	@ApiListField("contact_info")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfo;

	/** 
	 * 商户编号，由机构定义，需要保证在机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 间连商户等级。INDIRECT_LEVEL_M0:M0等级;INDIRECT_LEVEL_M1:M1等级;INDIRECT_LEVEL_M2:M2等级;INDIRECT_LEVEL_M3:M3等级
	 */
	@ApiField("indirect_level")
	private String indirectLevel;

	/** 
	 * 受理商户的支付宝账号（用于关联商户生活号、原服务窗，打通口碑营销活动）
	 */
	@ApiListField("logon_id")
	@ApiField("string")
	private List<String> logonId;

	/** 
	 * 商户备注信息，可填写额外信息
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 受理商户的固定二维码链接地址（即一码多付页面地址，用于后续支付宝营销活动）
商户所属的银行或ISV 给商户的二维码url值
一码多付方案:https://doc.open.alipay.com/docs/doc.htm?&docType=1&articleId=105672
	 */
	@ApiListField("pay_code_info")
	@ApiField("string")
	private List<String> payCodeInfo;

	/** 
	 * 商户客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/** 
	 * 商户来源机构标识，填写机构在支付宝的pid
	 */
	@ApiField("source")
	private String source;

	/** 
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}
	public List<AddressInfo> getAddressInfo( ) {
		return this.addressInfo;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAliasName( ) {
		return this.aliasName;
	}

	public void setBankcardInfo(List<BankCardInfo> bankcardInfo) {
		this.bankcardInfo = bankcardInfo;
	}
	public List<BankCardInfo> getBankcardInfo( ) {
		return this.bankcardInfo;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getBusinessLicense( ) {
		return this.businessLicense;
	}

	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}
	public String getBusinessLicenseType( ) {
		return this.businessLicenseType;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setContactInfo(List<ContactInfo> contactInfo) {
		this.contactInfo = contactInfo;
	}
	public List<ContactInfo> getContactInfo( ) {
		return this.contactInfo;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setIndirectLevel(String indirectLevel) {
		this.indirectLevel = indirectLevel;
	}
	public String getIndirectLevel( ) {
		return this.indirectLevel;
	}

	public void setLogonId(List<String> logonId) {
		this.logonId = logonId;
	}
	public List<String> getLogonId( ) {
		return this.logonId;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPayCodeInfo(List<String> payCodeInfo) {
		this.payCodeInfo = payCodeInfo;
	}
	public List<String> getPayCodeInfo( ) {
		return this.payCodeInfo;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone( ) {
		return this.servicePhone;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
