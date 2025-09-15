package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HitSegmentDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.knowledge.rag.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-05 17:02:39
 */
public class AlipayCloudCloudpromoKnowledgeRagGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5159845942513883678L;

	/** 
	 * null
	 */
	@ApiListField("hits")
	@ApiField("hit_segment_detail")
	private List<HitSegmentDetail> hits;

	public void setHits(List<HitSegmentDetail> hits) {
		this.hits = hits;
	}
	public List<HitSegmentDetail> getHits( ) {
		return this.hits;
	}

}
