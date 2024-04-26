package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消息模板内容，包括消息模板标题，关键词内容以及消息卡片跳链
 *
 * @author auto create
 * @since 1.0, 2024-01-14 22:42:48
 */
public class MsgTemplateContentVO extends AlipayObject {

	private static final long serialVersionUID = 2764264539858973674L;

	/**
	 * 消息卡片跳转地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 消息卡片上关键词展示信息，包括关键词对应的名称和关键词具体的内容
	 */
	@ApiListField("keyword_list")
	@ApiField("keyword_v_o")
	private List<KeywordVO> keywordList;

	/**
	 * 消息模板标题
	 */
	@ApiField("title")
	private String title;

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public List<KeywordVO> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<KeywordVO> keywordList) {
		this.keywordList = keywordList;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
