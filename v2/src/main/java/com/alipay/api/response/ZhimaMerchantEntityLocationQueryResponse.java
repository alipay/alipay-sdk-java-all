package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.entity.location.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:17:15
 */
public class ZhimaMerchantEntityLocationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825461245632817624L;

	/** 
	 * 充电宝位置
	 */
	@ApiField("address_desc")
	private String addressDesc;

	/** 
	 * 充电宝小程序的链接
	 */
	@ApiField("applet_link")
	private String appletLink;

	/** 
	 * 充电宝的品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/** 
	 * 是否存在
	 */
	@ApiField("exist")
	private Boolean exist;

	/** 
	 * h5链接
	 */
	@ApiField("h_five_link")
	private String hFiveLink;

	/** 
	 * 充电宝支持的接口类型
	 */
	@ApiField("interface_type")
	private String interfaceType;

	/** 
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 充电宝充电价格
	 */
	@ApiField("price")
	private String price;

	/** 
	 * 支付宝配置的文案
	 */
	@ApiField("zfb_text_content")
	private String zfbTextContent;

	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public String getAddressDesc( ) {
		return this.addressDesc;
	}

	public void setAppletLink(String appletLink) {
		this.appletLink = appletLink;
	}
	public String getAppletLink( ) {
		return this.appletLink;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance( ) {
		return this.distance;
	}

	public void setExist(Boolean exist) {
		this.exist = exist;
	}
	public Boolean getExist( ) {
		return this.exist;
	}

	public void sethFiveLink(String hFiveLink) {
		this.hFiveLink = hFiveLink;
	}
	public String gethFiveLink( ) {
		return this.hFiveLink;
	}

	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public String getInterfaceType( ) {
		return this.interfaceType;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice( ) {
		return this.price;
	}

	public void setZfbTextContent(String zfbTextContent) {
		this.zfbTextContent = zfbTextContent;
	}
	public String getZfbTextContent( ) {
		return this.zfbTextContent;
	}

}
