package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.jobcard.apply.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-26 17:32:57
 */
public class AlipayUserJobcardApplySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6734758753514434361L;

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
