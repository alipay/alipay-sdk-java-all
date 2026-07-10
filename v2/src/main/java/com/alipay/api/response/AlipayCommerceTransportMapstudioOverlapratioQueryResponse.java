package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LineRepetitionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.mapstudio.overlapratio.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-06 11:42:56
 */
public class AlipayCommerceTransportMapstudioOverlapratioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6634537198275293913L;

	/** 
	 * 线路重复度返回值
	 */
	@ApiListField("result")
	@ApiField("line_repetition_v_o")
	private List<LineRepetitionVO> result;

	public void setResult(List<LineRepetitionVO> result) {
		this.result = result;
	}
	public List<LineRepetitionVO> getResult( ) {
		return this.result;
	}

}
