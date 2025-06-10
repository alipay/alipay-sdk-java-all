package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.newscene.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:48
 */
public class AlipayUserNewsceneTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8882355692333377355L;

	/** 
	 * 对于传入的tag进行输出，格式为json，true表示是 fasle表示否，invalid表示无法判断，例如传入的账号不存在
	 */
	@ApiField("tags_result")
	private String tagsResult;

	public void setTagsResult(String tagsResult) {
		this.tagsResult = tagsResult;
	}
	public String getTagsResult( ) {
		return this.tagsResult;
	}

}
