package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppGroupExt;
import com.alipay.api.domain.AppSecurityExt;
import com.alipay.api.domain.EncryptConfigExt;
import com.alipay.api.domain.ExterfaceExt;
import com.alipay.api.domain.OpenIdConfigRequestExt;
import com.alipay.api.domain.QueryAppInfoExt;
import com.alipay.api.domain.SecurityProfileExt;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmocktools.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-02 15:43:16
 */
public class AlipayOpenOpenbizmocktoolsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3675692598135195436L;

	/** 
	 * 查询GroupID关系得到的结果
	 */
	@ApiField("app_group_ext")
	private AppGroupExt appGroupExt;

	/** 
	 * 应用密钥配置
	 */
	@ApiListField("app_security_ext")
	@ApiField("app_security_ext")
	private List<AppSecurityExt> appSecurityExt;

	/** 
	 * AES密钥配置
	 */
	@ApiListField("encrypt_config_ext")
	@ApiField("encrypt_config_ext")
	private List<EncryptConfigExt> encryptConfigExt;

	/** 
	 * 接口配置
	 */
	@ApiField("exterface_ext")
	private ExterfaceExt exterfaceExt;

	/** 
	 * 查询openid的灰度配置
	 */
	@ApiField("open_id_config_request_ext")
	private OpenIdConfigRequestExt openIdConfigRequestExt;

	/** 
	 * 压测私钥
	 */
	@ApiField("private_key")
	private String privateKey;

	/** 
	 * 应用的配置信息
	 */
	@ApiField("query_app_info_ext")
	private QueryAppInfoExt queryAppInfoExt;

	/** 
	 * 密钥配置
	 */
	@ApiListField("security_profile_ext")
	@ApiField("security_profile_ext")
	private List<SecurityProfileExt> securityProfileExt;

	/** 
	 * SPI接口配置
	 */
	@ApiField("spi_config")
	private String spiConfig;

	public void setAppGroupExt(AppGroupExt appGroupExt) {
		this.appGroupExt = appGroupExt;
	}
	public AppGroupExt getAppGroupExt( ) {
		return this.appGroupExt;
	}

	public void setAppSecurityExt(List<AppSecurityExt> appSecurityExt) {
		this.appSecurityExt = appSecurityExt;
	}
	public List<AppSecurityExt> getAppSecurityExt( ) {
		return this.appSecurityExt;
	}

	public void setEncryptConfigExt(List<EncryptConfigExt> encryptConfigExt) {
		this.encryptConfigExt = encryptConfigExt;
	}
	public List<EncryptConfigExt> getEncryptConfigExt( ) {
		return this.encryptConfigExt;
	}

	public void setExterfaceExt(ExterfaceExt exterfaceExt) {
		this.exterfaceExt = exterfaceExt;
	}
	public ExterfaceExt getExterfaceExt( ) {
		return this.exterfaceExt;
	}

	public void setOpenIdConfigRequestExt(OpenIdConfigRequestExt openIdConfigRequestExt) {
		this.openIdConfigRequestExt = openIdConfigRequestExt;
	}
	public OpenIdConfigRequestExt getOpenIdConfigRequestExt( ) {
		return this.openIdConfigRequestExt;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getPrivateKey( ) {
		return this.privateKey;
	}

	public void setQueryAppInfoExt(QueryAppInfoExt queryAppInfoExt) {
		this.queryAppInfoExt = queryAppInfoExt;
	}
	public QueryAppInfoExt getQueryAppInfoExt( ) {
		return this.queryAppInfoExt;
	}

	public void setSecurityProfileExt(List<SecurityProfileExt> securityProfileExt) {
		this.securityProfileExt = securityProfileExt;
	}
	public List<SecurityProfileExt> getSecurityProfileExt( ) {
		return this.securityProfileExt;
	}

	public void setSpiConfig(String spiConfig) {
		this.spiConfig = spiConfig;
	}
	public String getSpiConfig( ) {
		return this.spiConfig;
	}

}
