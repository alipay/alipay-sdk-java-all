package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.partner.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenOperationPartnerIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2228796857493537568L;

	/** 
	 * 当前账号是否实名认证。true表示已经实名认证；false表示未实名认证。
	 */
	@ApiField("certified")
	private Boolean certified;

	/** 
	 * 登录账号是否主账号。若当前账号已经是开放平台合作伙伴的子账号（即操作员身份），则返回false；否则返回true。
	 */
	@ApiField("master")
	private Boolean master;

	/** 
	 * 如已入驻，则返回该账号拥有的开放平台身份。
枚举如下：
自研开发者 -- IDENTITY_OPEN_SELF_RESEARCH_DEVELOPER，
系统服务商 -- IDENTITY_OPEN_SYSTEM_SERVICE_PROVIDER，
地推服务商 -- IDENTITY_OPEN_PUSH_SERVICE_PROVIDER
	 */
	@ApiListField("roles")
	@ApiField("string")
	private List<String> roles;

	/** 
	 * 当前账号是否已入驻蚂蚁开放平台。true表示已入驻；false表示未入驻。
	 */
	@ApiField("settled")
	private Boolean settled;

	public void setCertified(Boolean certified) {
		this.certified = certified;
	}
	public Boolean getCertified( ) {
		return this.certified;
	}

	public void setMaster(Boolean master) {
		this.master = master;
	}
	public Boolean getMaster( ) {
		return this.master;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public List<String> getRoles( ) {
		return this.roles;
	}

	public void setSettled(Boolean settled) {
		this.settled = settled;
	}
	public Boolean getSettled( ) {
		return this.settled;
	}

}
