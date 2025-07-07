package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景商户角色创建
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1275556263276295768L;

	/**
	 * 商户别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 经营地址
	 */
	@ApiField("business_address")
	private MerchantAddressInfo businessAddress;

	/**
	 * 类目,按照场景要求传参
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * null
	 */
	@ApiListField("contact_persons")
	@ApiField("merchant_contact_person")
	private List<MerchantContactPerson> contactPersons;

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
	 * 法人证照
	 */
	@ApiField("legal_info")
	private MerchantCertificateInfo legalInfo;

	/**
	 * 主体证照
	 */
	@ApiField("license_info")
	private MerchantCertificateInfo licenseInfo;

	/**
	 * 场景关联的2088
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

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public MerchantAddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(MerchantAddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<MerchantContactPerson> getContactPersons() {
		return this.contactPersons;
	}
	public void setContactPersons(List<MerchantContactPerson> contactPersons) {
		this.contactPersons = contactPersons;
	}

	public List<String> getContactPhones() {
		return this.contactPhones;
	}
	public void setContactPhones(List<String> contactPhones) {
		this.contactPhones = contactPhones;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public MerchantCertificateInfo getLegalInfo() {
		return this.legalInfo;
	}
	public void setLegalInfo(MerchantCertificateInfo legalInfo) {
		this.legalInfo = legalInfo;
	}

	public MerchantCertificateInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(MerchantCertificateInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMasterPartnerId() {
		return this.masterPartnerId;
	}
	public void setMasterPartnerId(String masterPartnerId) {
		this.masterPartnerId = masterPartnerId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutDoorPic() {
		return this.outDoorPic;
	}
	public void setOutDoorPic(String outDoorPic) {
		this.outDoorPic = outDoorPic;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<String> getServicePhones() {
		return this.servicePhones;
	}
	public void setServicePhones(List<String> servicePhones) {
		this.servicePhones = servicePhones;
	}

	public String getSettleAlipayLogonId() {
		return this.settleAlipayLogonId;
	}
	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}

}
