package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡更新
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:31:24
 */
public class AlipayMarketingCardUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4471885151379838538L;

	/**
	 * 需要修改的最新卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 扩展信息(暂时无用)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * "注意：此字段已废弃，卡面样式以模板中的定义为准。 会员卡卡面展示样式 参考：展示位置详情参考"商家会员卡->快速接入文档->第四步" 备注：mcard_style_info与card_info下的template_id不能同时更新"
	 */
	@ApiField("mcard_style_info")
	private McardStylInfo mcardStyleInfo;

	/**
	 * 商家会员卡消息信息
	 */
	@ApiField("merchant_card_msg_info")
	private MerchantCardMsgInfo merchantCardMsgInfo;

	/**
	 * 注意：此字段已废弃。
卡信息变更通知消息
1、在列表中定义的消息，才会发送给用户，消息格式一定。
2、根据卡信息变更情况，一次可发送多个消息
	 */
	@ApiListField("notify_messages")
	@ApiField("mcard_notify_message")
	private List<McardNotifyMessage> notifyMessages;

	/**
	 * 业务发生时间，时间格式为"yyyy-MM-dd HH:mm:ss"。
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 付费外卡信息，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("paid_outer_card_info")
	private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

	/**
	 * 支付宝业务卡号：1、3.0（历史版本）版本来源于alipay.marketing.card.open(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值；2、极速版来源于spi.alipay.user.opencard.get(会员卡开通，获取会员卡信息)请求参数中的biz_card_no值。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	public MerchantCard getCardInfo() {
		return this.cardInfo;
	}
	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public McardStylInfo getMcardStyleInfo() {
		return this.mcardStyleInfo;
	}
	public void setMcardStyleInfo(McardStylInfo mcardStyleInfo) {
		this.mcardStyleInfo = mcardStyleInfo;
	}

	public MerchantCardMsgInfo getMerchantCardMsgInfo() {
		return this.merchantCardMsgInfo;
	}
	public void setMerchantCardMsgInfo(MerchantCardMsgInfo merchantCardMsgInfo) {
		this.merchantCardMsgInfo = merchantCardMsgInfo;
	}

	public List<McardNotifyMessage> getNotifyMessages() {
		return this.notifyMessages;
	}
	public void setNotifyMessages(List<McardNotifyMessage> notifyMessages) {
		this.notifyMessages = notifyMessages;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo() {
		return this.paidOuterCardInfo;
	}
	public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
		this.paidOuterCardInfo = paidOuterCardInfo;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
