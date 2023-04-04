package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.jobcard.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:37:32
 */
public class AlipayUserJobcardApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8661672495658483331L;

	/** 
	 * 职位申请ID，由职位申请系统内部生成唯一序列号
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
