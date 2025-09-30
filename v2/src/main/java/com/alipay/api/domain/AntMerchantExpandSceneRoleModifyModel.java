package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景商户角色修改
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:47:36
 */
public class AntMerchantExpandSceneRoleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2111237836463621415L;

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
	 * 类目,按照场景要求传参
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
	 * 场景关联的2088
	 */
	@ApiField("master_partner_id")
	private String masterPartnerId;

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

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public MerchantContactPerson getContactPersons() {
		return this.contactPersons;
	}
	public void setContactPersons(MerchantContactPerson contactPersons) {
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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
