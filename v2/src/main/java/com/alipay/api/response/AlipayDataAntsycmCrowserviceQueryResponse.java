package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.antsycm.crowservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 16:12:54
 */
public class AlipayDataAntsycmCrowserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4779145619228975323L;

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
	 * 1、如果 service_type=is_exist_in_crowd，则返回 1表示存在、0表示不存在
2、如果 service_type=tag_score，则返回具体打分值，如0、99.24等
	 */
	@ApiField("value")
	private String value;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceType( ) {
		return this.serviceType;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}
	public String getUserSign( ) {
		return this.userSign;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public String getValue( ) {
		return this.value;
	}

}
