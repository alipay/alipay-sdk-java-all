package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预估标签圈人数量
 *
 * @author auto create
 * @since 1.0, 2022-05-26 09:37:15
 */
public class DatadigitalFincloudFinsaasTagcrowdCountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2198459712935187169L;

	/**
	 * 标签组规则列表+不唯一
	 */
	@ApiListField("rules")
	@ApiField("tag_rule_group_d_t_o")
	private List<TagRuleGroupDTO> rules;

	/**
	 * 场景编码+唯一
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<TagRuleGroupDTO> getRules() {
		return this.rules;
	}
	public void setRules(List<TagRuleGroupDTO> rules) {
		this.rules = rules;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
