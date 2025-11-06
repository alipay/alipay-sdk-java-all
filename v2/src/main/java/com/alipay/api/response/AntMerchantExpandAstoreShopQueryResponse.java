package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopBankCard;
import com.alipay.api.domain.AShopBusinessTime;
import com.alipay.api.domain.ShopContactWayInfo;
import com.alipay.api.domain.ShopCertificateInfo;
import com.alipay.api.domain.ShopLicenseInfo;
import com.alipay.api.domain.ShopProofInfo;
import com.alipay.api.domain.ShopSettleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astore.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 10:12:40
 */
public class AntMerchantExpandAstoreShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4513331252958821976L;

	/** 
	 * 店铺ID
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/** 
	 * 门店详细地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 门店结算银行卡信息
	 */
	@ApiListField("bank_cards")
	@ApiField("shop_bank_card")
	private List<ShopBankCard> bankCards;

	/** 
	 * 品牌连锁店时brand_id才返回品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 营业时间
	 */
	@ApiListField("business_time")
	@ApiField("a_shop_business_time")
	private List<AShopBusinessTime> businessTime;

	/** 
	 * 门店联系方式
	 */
	@ApiListField("contact_ways")
	@ApiField("shop_contact_way_info")
	private List<ShopContactWayInfo> contactWays;

	/** 
	 * 数字化门店ID
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

	/** 
	 * 外部门店编号，店铺下唯一
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
	private ShopCertificateInfo legalInfo;

	/** 
	 * 商户主体证照信息
	 */
	@ApiField("license_info")
	private ShopLicenseInfo licenseInfo;

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
	 * 门头照图片
	 */
	@ApiField("out_door_image")
	private String outDoorImage;

	/** 
	 * 证明其它材料
	 */
	@ApiField("proof_info")
	private ShopProofInfo proofInfo;

	/** 
	 * 门店备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 门店结算信息
	 */
	@ApiListField("settle_infos")
	@ApiField("shop_settle_info")
	private List<ShopSettleInfo> settleInfos;

	/** 
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 目前仅支持GROUP_BUY
	 */
	@ApiField("shop_type")
	private String shopType;

	/** 
	 * 门店状态
	 */
	@ApiField("status")
	private String status;

	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}
	public String getaStoreId( ) {
		return this.aStoreId;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBankCards(List<ShopBankCard> bankCards) {
		this.bankCards = bankCards;
	}
	public List<ShopBankCard> getBankCards( ) {
		return this.bankCards;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setBusinessTime(List<AShopBusinessTime> businessTime) {
		this.businessTime = businessTime;
	}
	public List<AShopBusinessTime> getBusinessTime( ) {
		return this.businessTime;
	}

	public void setContactWays(List<ShopContactWayInfo> contactWays) {
		this.contactWays = contactWays;
	}
	public List<ShopContactWayInfo> getContactWays( ) {
		return this.contactWays;
	}

	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
	}
	public String getDigitalPoiId( ) {
		return this.digitalPoiId;
	}

	public void setExternalNo(String externalNo) {
		this.externalNo = externalNo;
	}
	public String getExternalNo( ) {
		return this.externalNo;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLegalInfo(ShopCertificateInfo legalInfo) {
		this.legalInfo = legalInfo;
	}
	public ShopCertificateInfo getLegalInfo( ) {
		return this.legalInfo;
	}

	public void setLicenseInfo(ShopLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}
	public ShopLicenseInfo getLicenseInfo( ) {
		return this.licenseInfo;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMccL1(String mccL1) {
		this.mccL1 = mccL1;
	}
	public String getMccL1( ) {
		return this.mccL1;
	}

	public void setMccL2(String mccL2) {
		this.mccL2 = mccL2;
	}
	public String getMccL2( ) {
		return this.mccL2;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOutDoorImage(String outDoorImage) {
		this.outDoorImage = outDoorImage;
	}
	public String getOutDoorImage( ) {
		return this.outDoorImage;
	}

	public void setProofInfo(ShopProofInfo proofInfo) {
		this.proofInfo = proofInfo;
	}
	public ShopProofInfo getProofInfo( ) {
		return this.proofInfo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setSettleInfos(List<ShopSettleInfo> settleInfos) {
		this.settleInfos = settleInfos;
	}
	public List<ShopSettleInfo> getSettleInfos( ) {
		return this.settleInfos;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType( ) {
		return this.shopType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
