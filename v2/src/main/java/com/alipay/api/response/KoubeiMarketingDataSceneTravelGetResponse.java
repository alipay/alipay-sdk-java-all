package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneMarketingContentGroup;
import com.alipay.api.domain.SceneMarketingHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.scene.travel.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:13:18
 */
public class KoubeiMarketingDataSceneTravelGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6582179227318351159L;

	/** 
	 * 场景营销内容分组场景营
	 */
	@ApiListField("content")
	@ApiField("scene_marketing_content_group")
	private List<SceneMarketingContentGroup> content;

	/** 
	 * 场景营销头部信息
	 */
	@ApiField("header")
	private SceneMarketingHeader header;

	public void setContent(List<SceneMarketingContentGroup> content) {
		this.content = content;
	}
	public List<SceneMarketingContentGroup> getContent( ) {
		return this.content;
	}

	public void setHeader(SceneMarketingHeader header) {
		this.header = header;
	}
	public SceneMarketingHeader getHeader( ) {
		return this.header;
	}

}
