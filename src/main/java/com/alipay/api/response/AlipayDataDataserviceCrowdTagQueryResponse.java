package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceCrowdTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176786654122791794L;

	/** 
	 * 创建人群分组
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<String> getTags( ) {
		return this.tags;
	}

}
