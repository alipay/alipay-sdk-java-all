package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * POI信息，包括：POI编码、POI名称、POI地址、区域编码、经度、纬度、POI类型code、POI类型名称等信息
 *
 * @author auto create
 * @since 1.0, 2024-08-15 19:52:51
 */
public class AmapPoiInfo extends AlipayObject {

	private static final long serialVersionUID = 8537787692497499734L;

	/**
	 * 区域编码，area_code属于复杂类型poi_info的子属性，由调用者通过其它途径获取到的poi信息列表中直接携带传入
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 纬度信息，单位一般为度，但是不需携带单位信息，后台有定义好的处理逻辑，调用者无需关心
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度信息，单位一般为度，但是不需携带单位信息，后台有定义好的处理逻辑，调用者无需关心
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * POI地址信息
	 */
	@ApiField("poi_address")
	private String poiAddress;

	/**
	 * POI编码。poi_code是复杂参数poi_info下的一个子属性，当poi_info参数不为空时，该属性为必填项
	 */
	@ApiField("poi_code")
	private String poiCode;

	/**
	 * POI名称
	 */
	@ApiField("poi_name")
	private String poiName;

	/**
	 * POI类型编码，type_code属于复杂类型poi_info的子属性，由调用者通过其它途径获取到的poi信息列表中直接携带传入，没有映射的枚举
	 */
	@ApiField("type_code")
	private String typeCode;

	/**
	 * POI类型名称，由调用者直接携带传入，没有映射的枚举
	 */
	@ApiField("type_name")
	private String typeName;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPoiAddress() {
		return this.poiAddress;
	}
	public void setPoiAddress(String poiAddress) {
		this.poiAddress = poiAddress;
	}

	public String getPoiCode() {
		return this.poiCode;
	}
	public void setPoiCode(String poiCode) {
		this.poiCode = poiCode;
	}

	public String getPoiName() {
		return this.poiName;
	}
	public void setPoiName(String poiName) {
		this.poiName = poiName;
	}

	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
