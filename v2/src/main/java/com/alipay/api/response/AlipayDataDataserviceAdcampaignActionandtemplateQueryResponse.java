package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreativeActionAndTemplateResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.actionandtemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 16:22:26
 */
public class AlipayDataDataserviceAdcampaignActionandtemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7825959398493474761L;

	/** 
	 * 创意模版与交互类型返回结果集合
	 */
	@ApiListField("result_list")
	@ApiField("creative_action_and_template_response")
	private List<CreativeActionAndTemplateResponse> resultList;

	public void setResultList(List<CreativeActionAndTemplateResponse> resultList) {
		this.resultList = resultList;
	}
	public List<CreativeActionAndTemplateResponse> getResultList( ) {
		return this.resultList;
	}

}
