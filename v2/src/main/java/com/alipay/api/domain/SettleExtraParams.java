package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO结算退出与任务描述信息
 *
 * @author auto create
 * @since 1.0, 2023-07-13 14:17:27
 */
public class SettleExtraParams extends AlipayObject {

	private static final long serialVersionUID = 7662377331664536983L;

	/**
	 * quit_type为USER_CANCEL_QUIT或者SETTLE_APPLY_QUIT
	 */
	@ApiField("quit_type")
	private String quitType;

	/**
	 * 商链通权益抵扣信息,  当前只有运营商使用,  未使用权益抵扣忽略该字段

fundRuleList为对应的出资信息，目前该列表不支持多对象，长度限制为1。其中fundAgreementNo为本笔交易实际出资的协议，由(商链通二方通用版本接入文档)2.3.2获取，fundAmount为该出资协议出资的金额。

bizScene和subBizScene为(商链通二方通用版本接入文档)2.1.3中支付宝侧分配的信息。

bizMode=MERCHANT_ORDER为固定值。
	 */
	@ApiField("scene_pay_link_info")
	private String scenePayLinkInfo;

	/**
	 * action_type选择PAY_TO_ZERO时必填，
"SERVICE_CANCELED":"服务已取消",
"OTHER_CHANNEL_PERFORMANCE":"户已通过其他方式履约"
	 */
	@ApiField("settle_adjust_reason")
	private String settleAdjustReason;

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

	public String getScenePayLinkInfo() {
		return this.scenePayLinkInfo;
	}
	public void setScenePayLinkInfo(String scenePayLinkInfo) {
		this.scenePayLinkInfo = scenePayLinkInfo;
	}

	public String getSettleAdjustReason() {
		return this.settleAdjustReason;
	}
	public void setSettleAdjustReason(String settleAdjustReason) {
		this.settleAdjustReason = settleAdjustReason;
	}

}
