package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupmealOpenAuthAddResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.groupmeal.openauth.add response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-17 11:42:44
 */
public class AlipayOfflineProviderGroupmealOpenauthAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5512548235526268324L;

	/** 
	 * 团餐碰一下签约授权开通结果对象
	 */
	@ApiField("groupmeal_openauth_add_result")
	private GroupmealOpenAuthAddResult groupmealOpenauthAddResult;

	public void setGroupmealOpenauthAddResult(GroupmealOpenAuthAddResult groupmealOpenauthAddResult) {
		this.groupmealOpenauthAddResult = groupmealOpenauthAddResult;
	}
	public GroupmealOpenAuthAddResult getGroupmealOpenauthAddResult( ) {
		return this.groupmealOpenauthAddResult;
	}

}
