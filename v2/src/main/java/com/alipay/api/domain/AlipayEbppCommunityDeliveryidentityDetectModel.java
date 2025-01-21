package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外卖骑手进小区核验接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 19:58:16
 */
public class AlipayEbppCommunityDeliveryidentityDetectModel extends AlipayObject {

	private static final long serialVersionUID = 2756267994223882479L;

	/**
	 * 城市名
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 标识唯一小区id
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区名
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 物业编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 物业公司名字
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 骑手支付宝的openId。
	 */
	@ApiField("delivery_open_id")
	private String deliveryOpenId;

	/**
	 * 骑手支付宝的userId。
	 */
	@ApiField("delivery_user_id")
	private String deliveryUserId;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeliveryOpenId() {
		return this.deliveryOpenId;
	}
	public void setDeliveryOpenId(String deliveryOpenId) {
		this.deliveryOpenId = deliveryOpenId;
	}

	public String getDeliveryUserId() {
		return this.deliveryUserId;
	}
	public void setDeliveryUserId(String deliveryUserId) {
		this.deliveryUserId = deliveryUserId;
	}

}
