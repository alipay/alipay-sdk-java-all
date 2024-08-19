package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机器对话问答接口回复澄清卡片详情
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:41
 */
public class AnswerClarifyCardDetail extends AlipayObject {

	private static final long serialVersionUID = 1745186631473674716L;

	/**
	 * 澄清卡片，多轮问答的反问内容。
	 */
	@ApiListField("dst_list")
	@ApiField("string")
	private List<String> dstList;

	/**
	 * 关注的问题。澄清卡片前置文案
	 */
	@ApiField("follow_question")
	private String followQuestion;

	public List<String> getDstList() {
		return this.dstList;
	}
	public void setDstList(List<String> dstList) {
		this.dstList = dstList;
	}

	public String getFollowQuestion() {
		return this.followQuestion;
	}
	public void setFollowQuestion(String followQuestion) {
		this.followQuestion = followQuestion;
	}

}
