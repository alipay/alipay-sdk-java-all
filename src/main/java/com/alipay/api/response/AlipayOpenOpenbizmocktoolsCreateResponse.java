package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmocktools.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-25 11:00:40
 */
public class AlipayOpenOpenbizmocktoolsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6841366175837631592L;

	/** 
	 * 创建应用的APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	/** 
	 * 授权令牌
	 */
	@ApiField("auth_token")
	private String authToken;

	/** 
	 * group_id值
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * OPENID值
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 功能包编码
	 */
	@ApiField("package_code")
	private String packageCode;

	/** 
	 * SPI接口的配置
	 */
	@ApiField("spi_config")
	private String spiConfig;

	/** 
	 * UID值
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * union_id值
	 */
	@ApiField("union_id")
	private String unionId;

	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}
	public String getAppNumber( ) {
		return this.appNumber;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken( ) {
		return this.authToken;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}
	public String getPackageCode( ) {
		return this.packageCode;
	}

	public void setSpiConfig(String spiConfig) {
		this.spiConfig = spiConfig;
	}
	public String getSpiConfig( ) {
		return this.spiConfig;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	public String getUnionId( ) {
		return this.unionId;
	}

}
