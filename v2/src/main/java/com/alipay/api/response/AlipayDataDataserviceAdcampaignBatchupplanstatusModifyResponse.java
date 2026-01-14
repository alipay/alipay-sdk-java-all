package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.batchupplanstatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 16:22:31
 */
public class AlipayDataDataserviceAdcampaignBatchupplanstatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1367483136248778961L;

	/** 
	 * 操作成功计划id集合
	 */
	@ApiListField("result_list")
	@ApiField("number")
	private List<Long> resultList;

	public void setResultList(List<Long> resultList) {
		this.resultList = resultList;
	}
	public List<Long> getResultList( ) {
		return this.resultList;
	}

}
