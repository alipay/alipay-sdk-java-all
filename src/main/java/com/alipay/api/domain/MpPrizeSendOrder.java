package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中奖流水
 *
 * @author auto create
 * @since 1.0, 2021-06-24 20:50:05
 */
public class MpPrizeSendOrder extends AlipayObject {

	private static final long serialVersionUID = 5427146865871374456L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动流水id
	 */
	@ApiField("camp_log_id")
	private String campLogId;

	/**
	 * logonId的脱敏显示
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 拓展字段, 常用key有: prize_amount(奖品金额,单位为元); prize_type(奖品类型); mobile_send_flag(拉新活动发放凭证标识，标识为true且接口返回错误码CERTIFICATE_SEND_SUCCESS时，表示新用户发凭证成功，引导用户使用该手机号注册支付宝账号); errorMsg(错误信息描述); errorMsgType(错误信息类型，包括：CAMP_NOT_VALID--活动未生效，FREQ_OR_COUNT_LIMIT--频率或次数超限，RULE_NOT_PASS--规则未通过，NOT_WIN--未中奖); ruleErrorCode(规则验证不通过的错误码，值为AE0111709606 且返回的errorMsg为“00005000-规则中心规则不通过”时，表示用户已领取过奖品)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部奖品id，如果为券，则为券id。如果没有，则为空
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 奖品唯一标识
	 */
	@ApiField("prize_flag")
	private String prizeFlag;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 发奖流水
	 */
	@ApiField("prize_log_id")
	private String prizeLogId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 是否幂等，如果为true，代表此次请求幂等，返回的结果为幂等结果。如果为false,代表此次请求是新请求，返回结果为此次触发结果
	 */
	@ApiField("repeat_trigger_flag")
	private String repeatTriggerFlag;

	/**
	 * 是否中奖结果状态，如果为true时返回的结果中的其他字段非空，否则返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private String triggerResult;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampLogId() {
		return this.campLogId;
	}
	public void setCampLogId(String campLogId) {
		this.campLogId = campLogId;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

	public String getPrizeFlag() {
		return this.prizeFlag;
	}
	public void setPrizeFlag(String prizeFlag) {
		this.prizeFlag = prizeFlag;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeLogId() {
		return this.prizeLogId;
	}
	public void setPrizeLogId(String prizeLogId) {
		this.prizeLogId = prizeLogId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getRepeatTriggerFlag() {
		return this.repeatTriggerFlag;
	}
	public void setRepeatTriggerFlag(String repeatTriggerFlag) {
		this.repeatTriggerFlag = repeatTriggerFlag;
	}

	public String getTriggerResult() {
		return this.triggerResult;
	}
	public void setTriggerResult(String triggerResult) {
		this.triggerResult = triggerResult;
	}

}
