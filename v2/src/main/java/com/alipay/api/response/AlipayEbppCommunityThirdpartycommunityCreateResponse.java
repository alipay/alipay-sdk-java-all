package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.thirdpartycommunity.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-30 15:07:05
 */
public class AlipayEbppCommunityThirdpartycommunityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7578763923737761972L;

	/** 
	 * 行业内部生成的物业小区编号
	 */
	@ApiField("community_id")
	private String communityId;

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

	public void setPropertyCompanyShortName(String propertyCompanyShortName) {
		this.propertyCompanyShortName = propertyCompanyShortName;
	}
	public String getPropertyCompanyShortName( ) {
		return this.propertyCompanyShortName;
	}

}
