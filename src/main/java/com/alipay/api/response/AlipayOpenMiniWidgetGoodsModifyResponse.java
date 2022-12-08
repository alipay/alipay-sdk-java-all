package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.widget.goods.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 19:41:36
 */
public class AlipayOpenMiniWidgetGoodsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3217711472171856739L;

	/** 
	 * 商品修改返回的提交ID，用于查询商品信息的审核状态
	 */
	@ApiField("commit_id")
	private String commitId;

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getCommitId( ) {
		return this.commitId;
	}

}
