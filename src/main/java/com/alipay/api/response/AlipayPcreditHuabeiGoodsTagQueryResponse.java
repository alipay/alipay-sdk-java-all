package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsTagResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-31 09:40:40
 */
public class AlipayPcreditHuabeiGoodsTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8488336533734556925L;

	/** 
	 * 是否请求成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 标签列表
	 */
	@ApiListField("tags")
	@ApiField("goods_tag_result")
	private List<GoodsTagResult> tags;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTags(List<GoodsTagResult> tags) {
		this.tags = tags;
	}
	public List<GoodsTagResult> getTags( ) {
		return this.tags;
	}

}
