package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ISPTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 15:47:44
 */
public class AlipayCommerceIotMarketingTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5258116639141464649L;

	/** 
	 * 服务商投放模版列表信息
	 */
	@ApiListField("template_info_list")
	@ApiField("i_s_p_template_info")
	private List<ISPTemplateInfo> templateInfoList;

	public void setTemplateInfoList(List<ISPTemplateInfo> templateInfoList) {
		this.templateInfoList = templateInfoList;
	}
	public List<ISPTemplateInfo> getTemplateInfoList( ) {
		return this.templateInfoList;
	}

}
