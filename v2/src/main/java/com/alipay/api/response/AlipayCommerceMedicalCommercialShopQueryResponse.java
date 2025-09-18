package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopBusinessAddress;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 11:52:33
 */
public class AlipayCommerceMedicalCommercialShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7137456338244124826L;

	/** 
	 * 广申表
	 */
	@ApiField("advertise_service_cert")
	private String advertiseServiceCert;

	/** 
	 * 门店地址
	 */
	@ApiField("business_address")
	private ShopBusinessAddress businessAddress;

	/** 
	 * 证件照片
	 */
	@ApiField("cert_image")
	private String certImage;

	/** 
	 * 门店logo
	 */
	@ApiField("logo")
	private String logo;

	/** 
	 * 门店属性
	 */
	@ApiListField("medical_level_tags")
	@ApiField("string")
	private List<String> medicalLevelTags;

	/** 
	 * 医疗许可证
	 */
	@ApiField("medical_service_cert")
	private String medicalServiceCert;

	/** 
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商家PID
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 门店照片
	 */
	@ApiListField("shop_images")
	@ApiField("string")
	private List<String> shopImages;

	/** 
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public void setAdvertiseServiceCert(String advertiseServiceCert) {
		this.advertiseServiceCert = advertiseServiceCert;
	}
	public String getAdvertiseServiceCert( ) {
		return this.advertiseServiceCert;
	}

	public void setBusinessAddress(ShopBusinessAddress businessAddress) {
		this.businessAddress = businessAddress;
	}
	public ShopBusinessAddress getBusinessAddress( ) {
		return this.businessAddress;
	}

	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}
	public String getCertImage( ) {
		return this.certImage;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo( ) {
		return this.logo;
	}

	public void setMedicalLevelTags(List<String> medicalLevelTags) {
		this.medicalLevelTags = medicalLevelTags;
	}
	public List<String> getMedicalLevelTags( ) {
		return this.medicalLevelTags;
	}

	public void setMedicalServiceCert(String medicalServiceCert) {
		this.medicalServiceCert = medicalServiceCert;
	}
	public String getMedicalServiceCert( ) {
		return this.medicalServiceCert;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopImages(List<String> shopImages) {
		this.shopImages = shopImages;
	}
	public List<String> getShopImages( ) {
		return this.shopImages;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

}
