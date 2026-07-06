package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.issuer.vcconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-17 13:02:43
 */
public class AlipaySecurityProdIssuerVcconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8361918675189175854L;

	/** 
	 * 凭证中所要包含字段的schema
	 */
	@ApiField("attribute_schema")
	private String attributeSchema;

	/** 
	 * 凭证安全等级
256在导入凭证时不需要验证pin码，257在导入凭证时需要验证pin码
	 */
	@ApiField("security_level")
	private String securityLevel;

	/** 
	 * 是否支持撤销
true表示支持，false表示不支持
	 */
	@ApiField("support_revoke")
	private Boolean supportRevoke;

	/** 
	 * 是否支持选择性披露
true表示支持，false表示不支持
	 */
	@ApiField("support_select")
	private Boolean supportSelect;

	public void setAttributeSchema(String attributeSchema) {
		this.attributeSchema = attributeSchema;
	}
	public String getAttributeSchema( ) {
		return this.attributeSchema;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}
	public String getSecurityLevel( ) {
		return this.securityLevel;
	}

	public void setSupportRevoke(Boolean supportRevoke) {
		this.supportRevoke = supportRevoke;
	}
	public Boolean getSupportRevoke( ) {
		return this.supportRevoke;
	}

	public void setSupportSelect(Boolean supportSelect) {
		this.supportSelect = supportSelect;
	}
	public Boolean getSupportSelect( ) {
		return this.supportSelect;
	}

}
