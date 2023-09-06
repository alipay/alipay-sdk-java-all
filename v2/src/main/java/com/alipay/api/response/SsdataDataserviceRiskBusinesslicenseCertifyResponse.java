package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.businesslicense.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:28:03
 */
public class SsdataDataserviceRiskBusinesslicenseCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3823814928134724917L;

	/** 
	 * 营业执照的公司地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 业务令牌，由服务端生成后下发，是联系图片认证和非图片认证的桥梁，非图片认证时设置biz_id为上次图片认证调用返回的bis_token，视为一次调用，不会重复计费
	 */
	@ApiField("bis_token")
	private String bisToken;

	/** 
	 * 图片本次检测结果，true：认证成功；false：认证未成功
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/** 
	 * 企业营业执照统一信用码，每个企业唯一的编号
	 */
	@ApiField("credit_code")
	private String creditCode;

	/** 
	 * 营业执照法人名称
	 */
	@ApiField("ent_legal_name")
	private String entLegalName;

	/** 
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/** 
	 * 营业执照营业期限
	 */
	@ApiField("expires")
	private String expires;

	/** 
	 * 有效期终止时间
	 */
	@ApiField("expires_end")
	private String expiresEnd;

	/** 
	 * 有效期起始时间
	 */
	@ApiField("expires_start")
	private String expiresStart;

	/** 
	 * 返回匹配的字段，多个字段一英文逗号分割 ，企业营业执照统一信用码在底层数据库中为空，字段返回空。
	 */
	@ApiField("match_param")
	private String matchParam;

	/** 
	 * 不匹配的字段，多个字段以英文逗号分割，企业营业执照统一信用码在底层数据库中为空，字段返回空。
	 */
	@ApiField("no_match_param")
	private String noMatchParam;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBisToken(String bisToken) {
		this.bisToken = bisToken;
	}
	public String getBisToken( ) {
		return this.bisToken;
	}

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}
	public String getCreditCode( ) {
		return this.creditCode;
	}

	public void setEntLegalName(String entLegalName) {
		this.entLegalName = entLegalName;
	}
	public String getEntLegalName( ) {
		return this.entLegalName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntName( ) {
		return this.entName;
	}

	public void setExpires(String expires) {
		this.expires = expires;
	}
	public String getExpires( ) {
		return this.expires;
	}

	public void setExpiresEnd(String expiresEnd) {
		this.expiresEnd = expiresEnd;
	}
	public String getExpiresEnd( ) {
		return this.expiresEnd;
	}

	public void setExpiresStart(String expiresStart) {
		this.expiresStart = expiresStart;
	}
	public String getExpiresStart( ) {
		return this.expiresStart;
	}

	public void setMatchParam(String matchParam) {
		this.matchParam = matchParam;
	}
	public String getMatchParam( ) {
		return this.matchParam;
	}

	public void setNoMatchParam(String noMatchParam) {
		this.noMatchParam = noMatchParam;
	}
	public String getNoMatchParam( ) {
		return this.noMatchParam;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
