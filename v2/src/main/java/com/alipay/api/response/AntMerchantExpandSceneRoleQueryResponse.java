package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AddressInfo;
import com.alipay.api.domain.MerchantContactPerson;
import com.alipay.api.domain.MerchantCertificateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scene.role.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8194387798924123665L;

	/** 
	 * 商户别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/** 
	 * 经营地址
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/** 
	 * 类目，场景接入前咨询
	 */
	@ApiField("category_code")
	private String categoryCode;

	/** 
	 * 联系人信息及证照信息
	 */
	@ApiField("contact_persons")
	private MerchantContactPerson contactPersons;

	/** 
	 * null
	 */
	@ApiListField("contact_phones")
	@ApiField("string")
	private List<String> contactPhones;

	/** 
	 * 商户编号，由调用方定义，需要保证在调用方下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 法人证照信息
	 */
	@ApiField("legal_info")
	private MerchantCertificateInfo legalInfo;

	/** 
	 * 主体证照信息
	 */
	@ApiField("license_info")
	private MerchantCertificateInfo licenseInfo;

	/** 
	 * 主合作伙伴ID
	 */
	@ApiField("master_partner_id")
	private String masterPartnerId;

	/** 
	 * 商户类型，01：企业；license_info.cert_type填写201（营业执照）；license_info.cert_no填写营业执照号； 02：事业单位：license_info.cert_type填写218（事业单位法人证书）；license_info.cert_no填写事业单位法人证书编号； 03：民办非企业组织：license_info.cert_type填写204（民办非企业登记证书）；license_info.cert_no填写民办非企业登记证书编号； 04：社会团体：license_info.cert_type填写206（社会团体法人登记证书）；license_info.cert_no填写社会团体法人登记证书编号； 05：党政及国家机关：license_info.cert_type填写219（党政机关批准设立文件/行政执法主体资格证）；license_info.cert_no填写党政机关批准设立文件/行政执法主体资格证编号； 06：个人商户：license_info.cert_type填写100（个人身份证）；license_info.cert_no填写个人身份证号码； 07：个体工商户：license_info.cert_type填写201（营业执照）；license_info.cert_no填写营业执照编号；
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/** 
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 图片通过通过 ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("out_door_pic")
	private String outDoorPic;

	/** 
	 * 合作伙伴id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	/** 
	 * null
	 */
	@ApiListField("service_phones")
	@ApiField("string")
	private List<String> servicePhones;

	/** 
	 * 结算用支付宝账号
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAliasName( ) {
		return this.aliasName;
	}

	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}
	public AddressInfo getBusinessAddress( ) {
		return this.businessAddress;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryCode( ) {
		return this.categoryCode;
	}

	public void setContactPersons(MerchantContactPerson contactPersons) {
		this.contactPersons = contactPersons;
	}
	public MerchantContactPerson getContactPersons( ) {
		return this.contactPersons;
	}

	public void setContactPhones(List<String> contactPhones) {
		this.contactPhones = contactPhones;
	}
	public List<String> getContactPhones( ) {
		return this.contactPhones;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setLegalInfo(MerchantCertificateInfo legalInfo) {
		this.legalInfo = legalInfo;
	}
	public MerchantCertificateInfo getLegalInfo( ) {
		return this.legalInfo;
	}

	public void setLicenseInfo(MerchantCertificateInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}
	public MerchantCertificateInfo getLicenseInfo( ) {
		return this.licenseInfo;
	}

	public void setMasterPartnerId(String masterPartnerId) {
		this.masterPartnerId = masterPartnerId;
	}
	public String getMasterPartnerId( ) {
		return this.masterPartnerId;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantType( ) {
		return this.merchantType;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOutDoorPic(String outDoorPic) {
		this.outDoorPic = outDoorPic;
	}
	public String getOutDoorPic( ) {
		return this.outDoorPic;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setServicePhones(List<String> servicePhones) {
		this.servicePhones = servicePhones;
	}
	public List<String> getServicePhones( ) {
		return this.servicePhones;
	}

	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}
	public String getSettleAlipayLogonId( ) {
		return this.settleAlipayLogonId;
	}

}
