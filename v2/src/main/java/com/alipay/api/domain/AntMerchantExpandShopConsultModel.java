package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁店铺创建咨询
 *
 * @author auto create
 * @since 1.0, 2024-01-06 15:24:52
 */
public class AntMerchantExpandShopConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2516668543663816298L;

	/**
	 * "门店结算卡信息。本业务当前只允许传入一张结算卡。 说明：本参数仅直付通业务使用，其余业务无需关注。"
	 */
	@ApiListField("biz_cards")
	@ApiField("settle_card_info")
	private List<SettleCardInfo> bizCards;

	/**
	 * 品牌id，非加油站等特殊门店无需关注。
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 经营地址。地址对象中省、市、区、地址必填，其余选填
	 */
	@ApiField("business_address")
	private AddressInfo businessAddress;

	/**
	 * 店铺经营时间。
	 */
	@ApiListField("business_time")
	@ApiField("shop_business_time")
	private List<ShopBusinessTime> businessTime;

	/**
	 * 营业执照图片KEY。通过<a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 营业执照名称，填写值为营业执照或统一社会信用代码证上的名称。
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码，请填写店铺营业执照号。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 联系人信息。如果填写，其中名称必填，手机、固话、email 三选一必填。
	 */
	@ApiListField("contact_infos")
	@ApiField("contact_info")
	private List<ContactInfo> contactInfos;

	/**
	 * 店铺联系手机，与店铺联系固话二选一必填
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 店铺的联系固话，和店铺联系手机二选一必填
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 扩展信息列表。key值需要向对应行业的bd进行申请。
	 */
	@ApiListField("ext_infos")
	@ApiField("shop_ext_info")
	private List<ShopExtInfo> extInfos;

	/**
	 * 商户角色id，表示将要开的店属于哪个商户角色。对于直连开店场景，填写商户pid；对于间连开店场景（线上、线下、直付通），填写商户smid。特别说明：IoT设备三绑定场景统一填写商户pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 法人名称。
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 营业执照授权函。需传入<a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id。
蚂蚁门店管理场景可选。
	 */
	@ApiField("license_auth_letter_image")
	private String licenseAuthLetterImage;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 门头照 id，需传入 <a href="https://opendocs.alipay.com/apis/api_1/ant.merchant.expand.indirect.image.upload">ant.merchant.expand.indirect.image.upload</a> 接口上传图片后得到的 image_id
	 */
	@ApiField("out_door_images")
	private String outDoorImages;

	/**
	 * 行业特殊资质。
	 */
	@ApiListField("qualifications")
	@ApiField("industry_qualification_info")
	private List<IndustryQualificationInfo> qualifications;

	/**
	 * 场景，非加油站等特殊门店无需关注。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 结算支付宝账号的登录号，需传入小程序归属账号。若需增加收款账号，可在创建门店后登录<a href="https://b.alipay.com/index2.htm">商家中心</a> ，在 账户中心 > 经营信息 > 门店管理 中选择对应门店选择 更多 > 编辑 > 新增收款账号。
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 <a href="https://ur.alipay.com/4cmn0n">支付宝门店类目-最新</a> 表格。
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺名称。直连开店要保证全局店铺名称+地址唯一，间连开店要保证服务商pid下店铺名称+地址唯一
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺经营类型，01表示直营，02表示加盟
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店编号，表示该门店在该商户角色id(直连pid，间连smid)下，由商户自己定义的外部门店编号
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

	public List<ContactInfo> getContactInfos() {
		return this.contactInfos;
	}
	public void setContactInfos(List<ContactInfo> contactInfos) {
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

	public String getOutDoorImages() {
		return this.outDoorImages;
	}
	public void setOutDoorImages(String outDoorImages) {
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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
