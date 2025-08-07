package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EvnetResultVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.riskdetect.event.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class AlipayCommercePropertyRiskdetectEventQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7253785335823492191L;

	/** 
	 * null
	 */
	@ApiListField("event_results")
	@ApiField("evnet_result_v_o")
	private List<EvnetResultVO> eventResults;

	/** 
	 * 数据总数
	 */
	@ApiField("total")
	private Long total;

	public void setEventResults(List<EvnetResultVO> eventResults) {
		this.eventResults = eventResults;
	}
	public List<EvnetResultVO> getEventResults( ) {
		return this.eventResults;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
