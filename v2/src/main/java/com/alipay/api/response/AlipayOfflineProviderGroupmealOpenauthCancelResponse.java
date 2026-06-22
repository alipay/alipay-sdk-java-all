package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupmealOpenAuthCancelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.groupmeal.openauth.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 19:22:43
 */
public class AlipayOfflineProviderGroupmealOpenauthCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8772475933711537917L;

	/** 
	 * 碰一下团餐批量解约授权开通结果对象
	 */
	@ApiField("groupmeal_openauth_cancel_result")
	private GroupmealOpenAuthCancelResult groupmealOpenauthCancelResult;

	public void setGroupmealOpenauthCancelResult(GroupmealOpenAuthCancelResult groupmealOpenauthCancelResult) {
		this.groupmealOpenauthCancelResult = groupmealOpenauthCancelResult;
	}
	public GroupmealOpenAuthCancelResult getGroupmealOpenauthCancelResult( ) {
		return this.groupmealOpenauthCancelResult;
	}

}
