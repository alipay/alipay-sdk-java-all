package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SourceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medregister.sources.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-09 15:07:20
 */
public class AlipayCommerceMedicalMedregisterSourcesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2548398299141424485L;

	/** 
	 * 号源列表
	 */
	@ApiListField("data")
	@ApiField("source_v_o")
	private List<SourceVO> data;

	public void setData(List<SourceVO> data) {
		this.data = data;
	}
	public List<SourceVO> getData( ) {
		return this.data;
	}

}
