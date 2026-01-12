package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 骑手身份校验接口
 *
 * @author auto create
 * @since 1.0, 2025-11-13 21:32:36
 */
public class AlipayEbppIndustryCommunityDeliveryrecentorderDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8386358586915845478L;

	/**
	 * 城市国标编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 小区名字
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 物业唯一编码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 物业公司名字
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 骑手支付宝的openId
	 */
	@ApiField("delivery_open_id")
	private String deliveryOpenId;

	/**
	 * 骑手支付宝的userId
	 */
	@ApiField("delivery_user_id")
	private String deliveryUserId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
