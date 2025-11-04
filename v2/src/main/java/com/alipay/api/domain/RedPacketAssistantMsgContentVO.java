package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 红包推荐活动类型的消息内容，对应biz_type 为 red_packet_recommend 时必须传相关内容
 *
 * @author auto create
 * @since 1.0, 2025-08-27 10:11:43
 */
public class RedPacketAssistantMsgContentVO extends AlipayObject {

	private static final long serialVersionUID = 3826719333743281782L;

	/**
	 * 小助手定向消息内容，发送小助手时推送给用户的群内推荐内容
	 */
	@ApiField("recommend_text")
	private String recommendText;

	/**
	 * 小助手红包列表
	 */
	@ApiListField("red_packet_list")
	@ApiField("assistant_red_packet_v_o")
	private List<AssistantRedPacketVO> redPacketList;

	public String getRecommendText() {
		return this.recommendText;
	}
	public void setRecommendText(String recommendText) {
		this.recommendText = recommendText;
	}

	public List<AssistantRedPacketVO> getRedPacketList() {
		return this.redPacketList;
	}
	public void setRedPacketList(List<AssistantRedPacketVO> redPacketList) {
		this.redPacketList = redPacketList;
	}

}
