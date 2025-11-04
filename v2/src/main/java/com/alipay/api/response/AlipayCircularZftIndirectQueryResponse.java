package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZftIndirectRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.zft.indirect.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:37:53
 */
public class AlipayCircularZftIndirectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687326893497952968L;

	/** 
	 * 进件记录
	 */
	@ApiListField("relations")
	@ApiField("zft_indirect_relation")
	private List<ZftIndirectRelation> relations;

	public void setRelations(List<ZftIndirectRelation> relations) {
		this.relations = relations;
	}
	public List<ZftIndirectRelation> getRelations( ) {
		return this.relations;
	}

}
