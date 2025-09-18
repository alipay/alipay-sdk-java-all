package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-05 17:02:39
 */
public class KnowledgeBaseSearchOption extends AlipayObject {

	private static final long serialVersionUID = 8676294215524881834L;

	/**
	 * 知识库ID
	 */
	@ApiField("knowledge_base_id")
	private String knowledgeBaseId;

	/**
	 * null
	 */
	@ApiListField("legacy_pre_filters")
	@ApiField("legacy_pre_filter_detail")
	private List<LegacyPreFilterDetail> legacyPreFilters;

	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}
	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public List<LegacyPreFilterDetail> getLegacyPreFilters() {
		return this.legacyPreFilters;
	}
	public void setLegacyPreFilters(List<LegacyPreFilterDetail> legacyPreFilters) {
		this.legacyPreFilters = legacyPreFilters;
	}

}
