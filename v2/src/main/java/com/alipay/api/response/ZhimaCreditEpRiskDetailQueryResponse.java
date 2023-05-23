package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskDoc;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.risk.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:36:58
 */
public class ZhimaCreditEpRiskDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5248399738215378466L;

	/** 
	 * 风险列表
	 */
	@ApiField("risk_list")
	private RiskDoc riskList;

	/** 
	 * 风险合计数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setRiskList(RiskDoc riskList) {
		this.riskList = riskList;
	}
	public RiskDoc getRiskList( ) {
		return this.riskList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
