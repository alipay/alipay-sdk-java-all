package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-13 17:07:16
 */
public class AlipayCommerceMedicalAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1336122579841635788L;

	/** 
	 * 支持：true,不支持：false
	 */
	@ApiField("institution_ecode_status")
	private Boolean institutionEcodeStatus;

	/** 
	 * ecode_open:开通一码付
	 */
	@ApiField("page_suggestion")
	private String pageSuggestion;

	/** 
	 * 跳转引导页的地址
	 */
	@ApiField("page_url")
	private String pageUrl;

	/** 
	 * 一码付签约状态
	 */
	@ApiField("status")
	private String status;

	public void setInstitutionEcodeStatus(Boolean institutionEcodeStatus) {
		this.institutionEcodeStatus = institutionEcodeStatus;
	}
	public Boolean getInstitutionEcodeStatus( ) {
		return this.institutionEcodeStatus;
	}

	public void setPageSuggestion(String pageSuggestion) {
		this.pageSuggestion = pageSuggestion;
	}
	public String getPageSuggestion( ) {
		return this.pageSuggestion;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPageUrl( ) {
		return this.pageUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
