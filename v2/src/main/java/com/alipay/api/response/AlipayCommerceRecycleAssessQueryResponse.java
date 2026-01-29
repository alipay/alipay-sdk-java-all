package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleAssessDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.assess.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-03 16:27:32
 */
public class AlipayCommerceRecycleAssessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3374712715459538389L;

	/** 
	 * 估价集合
	 */
	@ApiListField("assess_info_list")
	@ApiField("recycle_assess_d_t_o")
	private List<RecycleAssessDTO> assessInfoList;

	public void setAssessInfoList(List<RecycleAssessDTO> assessInfoList) {
		this.assessInfoList = assessInfoList;
	}
	public List<RecycleAssessDTO> getAssessInfoList( ) {
		return this.assessInfoList;
	}

}
