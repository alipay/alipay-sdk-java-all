package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 11:02:33
 */
public class AlipaySocialBaseChatGmemberConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3198382219199734564L;

	/** 
	 * 所属的群id
	 */
	@ApiField("group_id")
	private String groupId;

	/** 
	 * 是否在群中
	 */
	@ApiField("result")
	private Boolean result;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
