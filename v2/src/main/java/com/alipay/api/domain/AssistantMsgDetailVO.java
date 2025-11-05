package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小助手定向消息详情模型
 *
 * @author auto create
 * @since 1.0, 2025-08-27 10:11:43
 */
public class AssistantMsgDetailVO extends AlipayObject {

	private static final long serialVersionUID = 8518798954146773187L;

	/**
	 * 自定义活动内容
	 */
	@ApiField("activity_content")
	private ActivityAssistantMsgContentVO activityContent;

	/**
	 * 权益推荐小助手内容
	 */
	@ApiField("benefit_content")
	private BenefitAssistantMsgContentVO benefitContent;

	/**
	 * 小助手类型，目前支持 activity_recommend (自定义活动)、benefit_recommend（权益推荐）、goods_recommend（商品推荐）、red_packet_recommend（红包推荐）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 小助手消息内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 消息发送时间
	 */
	@ApiField("gmt_published")
	private Date gmtPublished;

	/**
	 * 商品推荐小助手内容
	 */
	@ApiField("goods_content")
	private GoodsAssistantMsgContentVO goodsContent;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 消息名称，b侧展示用，不在c侧群内透出
	 */
	@ApiField("name")
	private String name;

	/**
	 * 红包推荐小助手内容
	 */
	@ApiField("red_packet_content")
	private RedPacketAssistantMsgContentVO redPacketContent;

	/**
	 * 消息发送状态

INIT( 初始化),
AUDITING (审核中),
DENY (审核驳回),
PENDING (待生效),
VALID (生效),
INVALID (下线),
DELETED (删除);
	 */
	@ApiField("status")
	private String status;

	public ActivityAssistantMsgContentVO getActivityContent() {
		return this.activityContent;
	}
	public void setActivityContent(ActivityAssistantMsgContentVO activityContent) {
		this.activityContent = activityContent;
	}

	public BenefitAssistantMsgContentVO getBenefitContent() {
		return this.benefitContent;
	}
	public void setBenefitContent(BenefitAssistantMsgContentVO benefitContent) {
		this.benefitContent = benefitContent;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Date getGmtPublished() {
		return this.gmtPublished;
	}
	public void setGmtPublished(Date gmtPublished) {
		this.gmtPublished = gmtPublished;
	}

	public GoodsAssistantMsgContentVO getGoodsContent() {
		return this.goodsContent;
	}
	public void setGoodsContent(GoodsAssistantMsgContentVO goodsContent) {
		this.goodsContent = goodsContent;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public RedPacketAssistantMsgContentVO getRedPacketContent() {
		return this.redPacketContent;
	}
	public void setRedPacketContent(RedPacketAssistantMsgContentVO redPacketContent) {
		this.redPacketContent = redPacketContent;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
