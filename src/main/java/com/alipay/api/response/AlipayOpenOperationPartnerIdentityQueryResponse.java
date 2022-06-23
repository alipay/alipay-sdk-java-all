package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.partner.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenOperationPartnerIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3317874644832292727L;

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

	public void setSettled(Boolean settled) {
		this.settled = settled;
	}
	public Boolean getSettled( ) {
		return this.settled;
	}

}
