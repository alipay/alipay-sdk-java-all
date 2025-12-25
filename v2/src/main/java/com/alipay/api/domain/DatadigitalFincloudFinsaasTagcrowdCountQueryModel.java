package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预估标签圈人数量
 *
 * @author auto create
 * @since 1.0, 2023-07-18 21:47:17
 */
public class DatadigitalFincloudFinsaasTagcrowdCountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6165817991251827763L;

	/**
	 * 标签组规则列表+不唯一
	 */
	@ApiListField("rules")
	@ApiField("tag_rule_group_d_t_o")
	private List<TagRuleGroupDTO> rules;

	/**
	 * 场景编码+唯一 当前字段已废弃(迁移图灵平台后，预估人群数API不需要传递sceneCode)
	 */
	@ApiField("scene_code")
	@Deprecated
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
