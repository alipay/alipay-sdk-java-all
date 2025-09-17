package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生意参谋_人群查询服务_人群匹配与评分查询
 *
 * @author auto create
 * @since 1.0, 2025-06-12 16:59:44
 */
public class AlipayDataAntsycmCrowserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2523215739279431559L;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 1、如果：service_type=is_exist_in_crowd 则入参是：人群ID
2、如果：service_type=tag_score 则入参是：对应打分：标识ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * is_exist_in_crowd:查询用户是否存在于人群中 
tag_score:查询当前用户的评分
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 用户ID
	 */
	@ApiField("user_sign")
	private String userSign;

	/**
	 * 用户ID类型
	 */
	@ApiField("user_sign_type")
	private String userSignType;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getUserSign() {
		return this.userSign;
	}
	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}

	public String getUserSignType() {
		return this.userSignType;
	}
	public void setUserSignType(String userSignType) {
		this.userSignType = userSignType;
	}

}
