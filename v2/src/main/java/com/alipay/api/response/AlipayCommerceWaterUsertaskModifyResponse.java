package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertask.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:43
 */
public class AlipayCommerceWaterUsertaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3621825158336459954L;

	/** 
	 * 修改状态是否成功
	 */
	@ApiField("change_result")
	private Boolean changeResult;

	/** 
	 * NORMAL-正常还桶
	 */
	@ApiField("change_type")
	private String changeType;

	public void setChangeResult(Boolean changeResult) {
		this.changeResult = changeResult;
	}
	public Boolean getChangeResult( ) {
		return this.changeResult;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public String getChangeType( ) {
		return this.changeType;
	}

}
