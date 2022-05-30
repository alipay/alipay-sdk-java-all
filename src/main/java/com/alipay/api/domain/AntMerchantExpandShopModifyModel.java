package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改蚂蚁店铺
 *
 * @author auto create
 * @since 1.0, 2022-05-24 15:44:22
 */
public class AntMerchantExpandShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8231249964633786363L;

	/**
	 * 门店结算卡信息。本业务当前只允许传入一张结算卡。
说明：本参数仅直付通业务使用，其余业务无需关注。
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/**
	 * 品牌id。若无需更新本信息项，可以不填写
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 经营地址。若填写本对象，其中省、市、区、地址必填，其余选填。无需更新本信息项时请整体留空，如有填写将整体覆盖本信息项
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 店铺经营时间。若无需更新本信息项，可以不填写
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 营业执照图片url。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。若无需更新本信息项，可以不填写
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。若无需更新本信息项，可以不填写
注意：若传入 cert_no 则本参数必填。
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码。请填写店铺营业执照号。若无需更新本信息项，可以不填写，以原有值为准
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，取值范围：201：营业执照；2011:多证合一(统一社会信用代码)。若无需更新本信息项，可以不填写。
注意：若传入 cert_no 则本参数必填。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 联系人信息。如果填写，其中名称必填，手机、固话、email三选一必填。填写则会将本信息项整体更新，覆盖原有的所有联系人
	 */
	@ApiField("contact_infos")
	private ContactInfo contactInfos;

	/**
	 * 店铺联系手机。若无需更新本信息项，可以不填写，以原有值为准
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话。若无需更新本信息项，可以不填写，以原有值为准
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 扩展信息列表。key值需要向对应行业的bd进行申请。传入本项时，按key进行更新或补充
	 */
	@ApiListField("ext_infos")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfos;

	/**
	 * 商户角色id，表示将要修改的店属于哪个商户角色，和store_id一起定位待修改的门店。对于直连场景，填写商户pid；对于间连场景（线上、线下、直付通），填写商户smid。本接口中，如果没传shop_id，则本字段与store_id均必填。本信息项不可修改
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 法人身份证号。如果要更新，必须和legal_name成对传入
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称。如果要更新，必须和legal_cert_no成对传入
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。若无需更新本信息项，可以不填写
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 备注。若无需更新本信息项，可以不填写
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。若无需更新本信息项，可以不填写。若填写则会整体覆盖原有的门头照列表
	 */
	@ApiListField("out_door_images")
	@ApiField("string")
	private List<String> outDoorImages;

	/**
	 * 行业特殊资质。若无需更新本信息项，可以不填写。填写会按类型进行更新或补充
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 场景。若无需更新本信息项，可以不填写
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 结算支付宝账号的登录号。若无需更新本信息项，可以不填写
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原shop_category映射关系参见表格 https://ur.alipay.com/2qv1f9。若无需更新本信息项，可以不填写
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 蚂蚁店铺id，用于查出待修改的门店。填写本参数的话，store_id和ip_role_id可以不填。本信息项不可修改
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称。直连开店要保证全局店铺名称+地址唯一，间连开店要保证服务商pid下店铺名称+地址唯一。若无需更新本信息项，可以不填写
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号。用于查出待修改的门店。本接口中，如果没传shop_id，则本字段与ip_role_id均必填；传入shop_id情况下，以shop_id为准查询门店，并修改本信息项
	 */
	@ApiField("store_id")
	private String storeId;

	public List<SettleCardInfo> getBizCards() {
		return this.bizCards;
	}
	public void setBizCards(List<SettleCardInfo> bizCards) {
		this.bizCards = bizCards;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public AddressInfo getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(AddressInfo businessAddress) {
		this.businessAddress = businessAddress;
	}

	public List<ShopBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<ShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

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

	public ContactInfo getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(ContactInfo contactInfos) {
		this.contactInfos = contactInfos;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public List<ShopExtInfo> getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(List<ShopExtInfo> extInfos) {
		this.extInfos = extInfos;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLicenseAuthLetterImage() {
		return this.licenseAuthLetterImage;
	}
	public void setLicenseAuthLetterImage(String licenseAuthLetterImage) {
		this.licenseAuthLetterImage = licenseAuthLetterImage;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<String> getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(List<String> outDoorImages) {
		this.outDoorImages = outDoorImages;
	}

	public List<IndustryQualificationInfo> getQualifications() {
		return this.qualifications;
	}
	public void setQualifications(List<IndustryQualificationInfo> qualifications) {
		this.qualifications = qualifications;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSettleAlipayLogonId() {
		return this.settleAlipayLogonId;
	}
	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
