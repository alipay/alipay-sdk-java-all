package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品推荐小助手内容
 *
 * @author auto create
 * @since 1.0, 2025-04-01 13:40:54
 */
public class GoodsAssistantMsgContentVO extends AlipayObject {

	private static final long serialVersionUID = 7517886474693585357L;

	/**
	 * 小助手商品活动列表
	 */
	@ApiListField("goods_list")
	@ApiField("assistant_goods_v_o")
	private List<AssistantGoodsVO> goodsList;

	/**
	 * 小助手定向消息内容，发送小助手时推送给用户的群内推荐内容
	 */
	@ApiField("recommend_text")
	private String recommendText;

	public List<AssistantGoodsVO> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<AssistantGoodsVO> goodsList) {
		this.goodsList = goodsList;
	}

	public String getRecommendText() {
		return this.recommendText;
	}
	public void setRecommendText(String recommendText) {
		this.recommendText = recommendText;
	}

}
