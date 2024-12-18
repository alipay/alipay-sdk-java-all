package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生意参谋置顶商圈-新增商圈
 *
 * @author auto create
 * @since 1.0, 2024-04-30 10:07:52
 */
public class AlipayDataDataserviceBusinessMallCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2353742367753736175L;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * LBS距离范围，值小于等于5000
	 */
	@ApiField("mall_distance")
	private String mallDistance;

	/**
	 * 商圈纬度
	 */
	@ApiField("mall_latitude")
	private String mallLatitude;

	/**
	 * 商圈经度
	 */
	@ApiField("mall_longitude")
	private String mallLongitude;

	/**
	 * 商圈名称
	 */
	@ApiField("mall_name")
	private String mallName;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getMallDistance() {
		return this.mallDistance;
	}
	public void setMallDistance(String mallDistance) {
		this.mallDistance = mallDistance;
	}

	public String getMallLatitude() {
		return this.mallLatitude;
	}
	public void setMallLatitude(String mallLatitude) {
		this.mallLatitude = mallLatitude;
	}

	public String getMallLongitude() {
		return this.mallLongitude;
	}
	public void setMallLongitude(String mallLongitude) {
		this.mallLongitude = mallLongitude;
	}

	public String getMallName() {
		return this.mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
