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
 * @since 1.0, 2021-03-23 20:04:17
 */
public class AlipayMarketingCardUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8366278447922874739L;

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
	 * 注意：此字段已废弃，卡面样式以模板中的定义为准。
会员卡卡面展示样式
参考：展示位置详情参考"商户会员卡->快速接入文档->第四步" 
备注：mcard_style_info与card_info下的template_id不能同时更新
	 */
	@ApiField("mcard_style_info")
	private McardStylInfo mcardStyleInfo;

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
	 * 标识业务发生时间，时间格式为"yyyy-MM-dd HH:mm:ss"。
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 支付宝业务卡号，即通过<a href="">alipay.marketing.card.open</a>(会员卡开卡)接口开卡后获取的 card_info.biz_card_no 值。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型。支持：
BIZ_CARD：支付宝业务卡号（商户会员卡场景使用）。
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
