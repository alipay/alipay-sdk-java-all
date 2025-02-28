package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.thirdpartycommunity.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-13 10:17:23
 */
public class AlipayEbppCommunityThirdpartycommunityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6347314488665612811L;

	/** 
	 * 行业内部生成的物业小区编号
	 */
	@ApiField("community_id")
	private String communityId;

	/** 
	 * 小区名称缩写
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/** 
	 * 对应请求参数「物业公司 community_property_company」「公司缩写 short_name」
后续小区绑定物业公司实现快速关联。物业公司信息更新时使用。
	 */
	@ApiField("property_company_short_name")
	private String propertyCompanyShortName;

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}
	public String getCommunityShortName( ) {
		return this.communityShortName;
	}

	public void setPropertyCompanyShortName(String propertyCompanyShortName) {
		this.propertyCompanyShortName = propertyCompanyShortName;
	}
	public String getPropertyCompanyShortName( ) {
		return this.propertyCompanyShortName;
	}

}
