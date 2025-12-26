package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceContentDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.riskdetect.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class AlipayCommercePropertyRiskdetectContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1477511677612564194L;

	/** 
	 * null
	 */
	@ApiListField("content_results")
	@ApiField("device_content_d_t_o")
	private List<DeviceContentDTO> contentResults;

	/** 
	 * 数据总数
	 */
	@ApiField("total")
	private Long total;

	public void setContentResults(List<DeviceContentDTO> contentResults) {
		this.contentResults = contentResults;
	}
	public List<DeviceContentDTO> getContentResults( ) {
		return this.contentResults;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
