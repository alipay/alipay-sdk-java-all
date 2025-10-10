package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意模版与交互行为配置查询返回对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class CreativeActionAndTemplateResponse extends AlipayObject {

	private static final long serialVersionUID = 3646597872782928763L;

	/**
	 * 当前创建创意时可选择的交互类型集合,会根据挂载单元查询出对应所有创意模版对应的可选交互类型集合信息
	 */
	@ApiListField("action_type_list")
	@ApiField("string")
	private List<String> actionTypeList;

	/**
	 * 创意模版信息
	 */
	@ApiField("creative_template_resp")
	private CreativeTemplateResp creativeTemplateResp;

	public List<String> getActionTypeList() {
		return this.actionTypeList;
	}
	public void setActionTypeList(List<String> actionTypeList) {
		this.actionTypeList = actionTypeList;
	}

	public CreativeTemplateResp getCreativeTemplateResp() {
		return this.creativeTemplateResp;
	}
	public void setCreativeTemplateResp(CreativeTemplateResp creativeTemplateResp) {
		this.creativeTemplateResp = creativeTemplateResp;
	}

}
