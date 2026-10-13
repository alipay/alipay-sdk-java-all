package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BenefitDisplayVO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.batchconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingBatchconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1717122553517793632L;

	/** 
	 * 最优的优惠列表
	 */
	@ApiField("best_benefit_list")
	private BenefitDisplayVO bestBenefitList;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setBestBenefitList(BenefitDisplayVO bestBenefitList) {
		this.bestBenefitList = bestBenefitList;
	}
	public BenefitDisplayVO getBestBenefitList( ) {
		return this.bestBenefitList;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
