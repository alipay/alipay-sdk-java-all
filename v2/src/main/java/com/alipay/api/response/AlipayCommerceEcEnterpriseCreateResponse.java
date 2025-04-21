package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-22 17:41:11
 */
public class AlipayCommerceEcEnterpriseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8793682241496215274L;

	/** 
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 封闭场景（如班车）的人脸库id，如果入参create_iot_group传false，则不会创建企业人脸库，该字段为空。
	 */
	@ApiField("iot_group_id")
	private String iotGroupId;

	/** 
	 * 开放场景（如团餐）的人脸库id，如果入参create_iot_group传false，则不会创建企业人脸库，该字段为空。
	 */
	@ApiField("iot_logic_group_id")
	private String iotLogicGroupId;

	/** 
	 * 资金代付签约链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setIotGroupId(String iotGroupId) {
		this.iotGroupId = iotGroupId;
	}
	public String getIotGroupId( ) {
		return this.iotGroupId;
	}

	public void setIotLogicGroupId(String iotLogicGroupId) {
		this.iotLogicGroupId = iotLogicGroupId;
	}
	public String getIotLogicGroupId( ) {
		return this.iotLogicGroupId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
