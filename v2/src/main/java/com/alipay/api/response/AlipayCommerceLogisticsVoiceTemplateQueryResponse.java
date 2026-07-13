package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsVoiceTemplate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:30
 */
public class AlipayCommerceLogisticsVoiceTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1732452194236482691L;

	/** 
	 * null
	 */
	@ApiListField("template_list")
	@ApiField("logistics_voice_template")
	private List<LogisticsVoiceTemplate> templateList;

	/** 
	 * 模板总数
	 */
	@ApiField("total")
	private String total;

	public void setTemplateList(List<LogisticsVoiceTemplate> templateList) {
		this.templateList = templateList;
	}
	public List<LogisticsVoiceTemplate> getTemplateList( ) {
		return this.templateList;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
