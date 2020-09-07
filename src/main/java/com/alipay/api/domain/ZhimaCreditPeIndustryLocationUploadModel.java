package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品地图点位上传
 *
 * @author auto create
 * @since 1.0, 2019-04-23 19:18:48
 */
public class ZhimaCreditPeIndustryLocationUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5572392572241279647L;

	/**
	 * 业务场景,分时租赁平台:car_sharing_zhima,具体业务对应的业务场景请联系业务确认
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 是否可用，Y：可用，N不可用。
	 */
	@ApiField("can_use")
	private String canUse;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码, 分时租赁共享汽车场景下必填
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 地址位置纬度，取值范围：纬度-90~90，中国地区经度范围：纬度3.86~53.55
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 点位地址
	 */
	@ApiField("location_address")
	private String locationAddress;

	/**
	 * 点位编码，唯一标识一个点位,需要保证唯一
	 */
	@ApiField("location_code")
	private String locationCode;

	/**
	 * 点位名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 地址位置经度，取值范围：经度-180~180，中国地区经度范围：73.66~135.05
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCanUse() {
		return this.canUse;
	}
	public void setCanUse(String canUse) {
		this.canUse = canUse;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocationAddress() {
		return this.locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getLocationCode() {
		return this.locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
