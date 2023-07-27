package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RelationCombinedVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.combined.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:08:05
 */
public class AlipaySocialBaseRelationCombinedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3662931595289996249L;

	/** 
	 * 复合关系数据
	 */
	@ApiListField("relation_combined_list")
	@ApiField("relation_combined_v_o")
	private List<RelationCombinedVO> relationCombinedList;

	public void setRelationCombinedList(List<RelationCombinedVO> relationCombinedList) {
		this.relationCombinedList = relationCombinedList;
	}
	public List<RelationCombinedVO> getRelationCombinedList( ) {
		return this.relationCombinedList;
	}

}
