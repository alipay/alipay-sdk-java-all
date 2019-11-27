package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.fundunion.link.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataFundunionLinkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2563637372772168551L;

	/** 
	 * 上数生成的业务唯一标识，用于标识商户的一笔业务
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户业务流水号，如果商户有传入，则原样返回。如果商户没有传入，则有系统生成返回
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/** 
	 * 返回的url地址
	 */
	@ApiField("url")
	private String url;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}
	public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
