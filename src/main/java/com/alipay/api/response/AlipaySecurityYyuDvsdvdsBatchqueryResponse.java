package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageTemplateParamInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.yyu.dvsdvds.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-22 11:41:39
 */
public class AlipaySecurityYyuDvsdvdsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2342313676797756167L;

	/** 
	 * asd
	 */
	@ApiField("asd")
	private PageTemplateParamInfoDTO asd;

	/** 
	 * sadasdas
	 */
	@ApiField("asdasda")
	private Boolean asdasda;

	/** 
	 * sadf
	 */
	@ApiField("asdf")
	private String asdf;

	/** 
	 * sdfasdf
	 */
	@ApiField("sadf")
	private Boolean sadf;

	public void setAsd(PageTemplateParamInfoDTO asd) {
		this.asd = asd;
	}
	public PageTemplateParamInfoDTO getAsd( ) {
		return this.asd;
	}

	public void setAsdasda(Boolean asdasda) {
		this.asdasda = asdasda;
	}
	public Boolean getAsdasda( ) {
		return this.asdasda;
	}

	public void setAsdf(String asdf) {
		this.asdf = asdf;
	}
	public String getAsdf( ) {
		return this.asdf;
	}

	public void setSadf(Boolean sadf) {
		this.sadf = sadf;
	}
	public Boolean getSadf( ) {
		return this.sadf;
	}

}
