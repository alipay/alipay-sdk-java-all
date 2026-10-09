package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitUseVO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:40:28
 */
public class AlipayVoyagerMarketingFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859281632569495427L;

	/** 
	 * null
	 */
	@ApiListField("benefit_use_infos")
	@ApiField("benefit_use_v_o")
	private List<BenefitUseVO> benefitUseInfos;

	/** 
	 * 冻结单号，后续核销/退款必传
	 */
	@ApiField("freeze_order_id")
	private String freezeOrderId;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setBenefitUseInfos(List<BenefitUseVO> benefitUseInfos) {
		this.benefitUseInfos = benefitUseInfos;
	}
	public List<BenefitUseVO> getBenefitUseInfos( ) {
		return this.benefitUseInfos;
	}

	public void setFreezeOrderId(String freezeOrderId) {
		this.freezeOrderId = freezeOrderId;
	}
	public String getFreezeOrderId( ) {
		return this.freezeOrderId;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
