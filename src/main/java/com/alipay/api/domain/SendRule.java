package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @since 1.0, 2019-06-27 19:09:24
 */
public class SendRule extends AlipayObject {

	private static final long serialVersionUID = 7541878524242429891L;

	/**
	 * 是否允许重复发奖：
true代表允许，false代表不允许
默认不设置，表明用户领取券后如果没有核销则不允许再次领取券
如果设置为true，表明如果用户领取券后没有核销，还可以继续领取该券（只有配置publish_channels中type为URL_WITH_TOKEN外部发券时，该字段生效）
	 */
	@ApiField("allow_repeat_send")
	private String allowRepeatSend;

	/**
	 * 发券最低消费金额，单位元
活动类型为消费送且不是消费送礼包时设置
多营销工具之间不允许设置重复值
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 券的预算数量（仅对口令送随机抽奖有效，即当活动类型为GUESS_SEND，且营销工具PromoTool的个数大于1时，此字段必填，其余情况此字段必为空）
	 */
	@ApiField("send_budget")
	private String sendBudget;

	/**
	 * 发券数目
最少发1张券，最多发5张券
	 */
	@ApiField("send_num")
	private String sendNum;

	public String getAllowRepeatSend() {
		return this.allowRepeatSend;
	}
	public void setAllowRepeatSend(String allowRepeatSend) {
		this.allowRepeatSend = allowRepeatSend;
	}

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public String getSendBudget() {
		return this.sendBudget;
	}
	public void setSendBudget(String sendBudget) {
		this.sendBudget = sendBudget;
	}

	public String getSendNum() {
		return this.sendNum;
	}
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}

}
