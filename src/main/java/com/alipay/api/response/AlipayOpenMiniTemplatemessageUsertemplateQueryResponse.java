package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserTemplateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.templatemessage.usertemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniTemplatemessageUsertemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1491441165332989421L;

	/** 
	 * 用户的模板id列表
	 */
	@ApiListField("user_template_list")
	@ApiField("user_template_info")
	private List<UserTemplateInfo> userTemplateList;

	public void setUserTemplateList(List<UserTemplateInfo> userTemplateList) {
		this.userTemplateList = userTemplateList;
	}
	public List<UserTemplateInfo> getUserTemplateList( ) {
		return this.userTemplateList;
	}

}
