package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 规则命中对话信息
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class HitDialogue extends AlipayObject {

	private static final long serialVersionUID = 8884162539317768695L;

	/**
	 * 命中结果高亮
	 */
	@ApiListField("key_words")
	@ApiField("dialogue_key_word")
	private List<DialogueKeyWord> keyWords;

	/**
	 * 对话句子唯一标识
	 */
	@ApiField("pid")
	private Long pid;

	public List<DialogueKeyWord> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<DialogueKeyWord> keyWords) {
		this.keyWords = keyWords;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

}
