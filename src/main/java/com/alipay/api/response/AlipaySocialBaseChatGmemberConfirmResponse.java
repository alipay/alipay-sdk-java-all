package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.gmember.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseChatGmemberConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5657311835939953353L;

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
