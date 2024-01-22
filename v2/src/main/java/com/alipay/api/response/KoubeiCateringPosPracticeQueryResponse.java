package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PracticeEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.practice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:26:00
 */
public class KoubeiCateringPosPracticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3465322841755932553L;

	/** 
	 * 做法模型
	 */
	@ApiListField("practice_entity_list")
	@ApiField("practice_entity")
	private List<PracticeEntity> practiceEntityList;

	public void setPracticeEntityList(List<PracticeEntity> practiceEntityList) {
		this.practiceEntityList = practiceEntityList;
	}
	public List<PracticeEntity> getPracticeEntityList( ) {
		return this.practiceEntityList;
	}

}
