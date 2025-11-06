package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店模型
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseShopModel extends AlipayObject {

	private static final long serialVersionUID = 6441679342851765188L;

	/**
	 * 门店详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店结算银行卡信息
	 */
	@ApiListField("bank_cards")
	@ApiField("group_purchase_bank_card")
	private List<GroupPurchaseBankCard> bankCards;

	/**
	 * 营业时间
	 */
	@ApiListField("business_time")
	@ApiField("group_purchase_business_time")
	private List<GroupPurchaseBusinessTime> businessTime;

	/**
	 * 门店联系方式
	 */
	@ApiListField("contact_ways")
	@ApiField("group_purchase_shop_contact_way_info")
	private List<GroupPurchaseShopContactWayInfo> contactWays;

	/**
	 * 数字化门店ID
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/**
	 * 外部门店编号
店铺下唯一
	 */
	@ApiField("external_no")
	private String externalNo;

	/**
	 * 门店维度，度（degrees）为单位
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 法人证照身份证信息
	 */
	@ApiField("legal_info")
	private GroupPurchaseCertificateInfo legalInfo;

	/**
	 * 商户主体证照信息，支持的商家账号类型：企业账号/个体工商户/民办非企业：
1.若选择企业或个体工商户，则需上传的是“营业执照信息”；
2.若选择"民办非企业"则需上传的是“民办非企业登记证书”。
	 */
	@ApiField("license_info")
	private GroupPurchaseShopLicenseInfo licenseInfo;

	/**
	 * 门店经度,以度（degrees）为单位
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * mcc一级类目
	 */
	@ApiField("mcc_l_1")
	private String mccL1;

	/**
	 * mcc二级类目
	 */
	@ApiField("mcc_l_2")
	private String mccL2;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门头照图片，使用openApi接口ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id。文件最小为 5KB，最大为5M，图片格式必须为：png、jpg、jpeg。
	 */
	@ApiField("out_door_image")
	private String outDoorImage;

	/**
	 * 证明其它材料，产权证明/租赁合同/授权材料，无营业执照三选一。
	 */
	@ApiField("proof_info")
	private GroupPurchaseProofInfo proofInfo;

	/**
	 * 门店结算信息
	 */
	@ApiListField("settle_infos")
	@ApiField("group_purchase_settle_info")
	private List<GroupPurchaseSettleInfo> settleInfos;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<GroupPurchaseBankCard> getBankCards() {
		return this.bankCards;
	}
	public void setBankCards(List<GroupPurchaseBankCard> bankCards) {
		this.bankCards = bankCards;
	}

	public List<GroupPurchaseBusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<GroupPurchaseBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

	public List<GroupPurchaseShopContactWayInfo> getContactWays() {
		return this.contactWays;
	}
	public void setContactWays(List<GroupPurchaseShopContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}

	public String getExternalNo() {
		return this.externalNo;
	}
	public void setExternalNo(String externalNo) {
		this.externalNo = externalNo;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public GroupPurchaseCertificateInfo getLegalInfo() {
		return this.legalInfo;
	}
	public void setLegalInfo(GroupPurchaseCertificateInfo legalInfo) {
		this.legalInfo = legalInfo;
	}

	public GroupPurchaseShopLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(GroupPurchaseShopLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMccL1() {
		return this.mccL1;
	}
	public void setMccL1(String mccL1) {
		this.mccL1 = mccL1;
	}

	public String getMccL2() {
		return this.mccL2;
	}
	public void setMccL2(String mccL2) {
		this.mccL2 = mccL2;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutDoorImage() {
		return this.outDoorImage;
	}
	public void setOutDoorImage(String outDoorImage) {
		this.outDoorImage = outDoorImage;
	}

	public GroupPurchaseProofInfo getProofInfo() {
		return this.proofInfo;
	}
	public void setProofInfo(GroupPurchaseProofInfo proofInfo) {
		this.proofInfo = proofInfo;
	}

	public List<GroupPurchaseSettleInfo> getSettleInfos() {
		return this.settleInfos;
	}
	public void setSettleInfos(List<GroupPurchaseSettleInfo> settleInfos) {
		this.settleInfos = settleInfos;
	}

}
