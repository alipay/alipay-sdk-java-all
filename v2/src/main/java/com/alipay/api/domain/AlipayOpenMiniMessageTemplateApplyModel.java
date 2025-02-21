package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消息模板申领接口
 *
 * @author auto create
 * @since 1.0, 2024-01-25 21:08:30
 */
public class AlipayOpenMiniMessageTemplateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1199777248228235925L;

	/**
	 * 消息关键词列表，需要传入2到5个关键词，关键词内容需要与对应母板关键词对应。注意需传入json数组格式，[{"name":"第一个关键词"},{"name":"第二个关键词"}]
	 */
	@ApiListField("keyword_list")
	@ApiField("msg_apply_keyword")
	private List<MsgApplyKeyword> keywordList;

	/**
	 * 消息模板库code
	 */
	@ApiField("lib_code")
	private String libCode;

	/**
	 * 订阅规则，分为一次性订阅和长期性订阅
	 */
	@ApiField("scene_rule")
	private String sceneRule;

	public List<MsgApplyKeyword> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<MsgApplyKeyword> keywordList) {
		this.keywordList = keywordList;
	}

	public String getLibCode() {
		return this.libCode;
	}
	public void setLibCode(String libCode) {
		this.libCode = libCode;
	}

	public String getSceneRule() {
		return this.sceneRule;
	}
	public void setSceneRule(String sceneRule) {
		this.sceneRule = sceneRule;
	}

}
