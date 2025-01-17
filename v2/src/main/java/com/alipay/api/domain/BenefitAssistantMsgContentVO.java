package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益推荐小助手内容模型
 *
 * @author auto create
 * @since 1.0, 2024-12-13 10:26:01
 */
public class BenefitAssistantMsgContentVO extends AlipayObject {

	private static final long serialVersionUID = 4665884443882939833L;

	/**
	 * 活动id，即券id。传入活动id后可支持在群内发小助手优惠券定向消息。请先通过优惠券创建接口创建优惠券<a href="https://opendocs.alipay.com/open/7ad3a7bf_alipay.marketing.activity.ordervoucher.create?scene=a0667e04ac87431eb7e6adc5f13cc8ba&pathHash=3262435d">https://opendocs.alipay.com/open/7ad3a7bf_alipay.marketing.activity.ordervoucher.create?scene=a0667e04ac87431eb7e6adc5f13cc8ba&pathHash=3262435d</a>并获取activity_id优惠券id作为这个入参的值。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动id列表
	 */
	@ApiListField("activity_id_list")
	@ApiField("string")
	private List<String> activityIdList;

	/**
	 * 人群code，需要通过棋盘人群创建接口<a href="https://opendocs.alipay.com/open/09c10677_alipay.marketing.qipan.crowdoperation.create?pathHash=3d8bad63">https://opendocs.alipay.com/open/09c10677_alipay.marketing.qipan.crowdoperation.create?pathHash=3d8bad63</a>创建并获取返回crowd_code作为这个地方传的人群code参数
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 该字段用于描述本群发消息是否使用券包样式, 若为true, 则群发消息展示使用券包样式, 否则使用普通样式
	 */
	@ApiField("multi_coupon")
	private Boolean multiCoupon;

	/**
	 * 小助手定向消息内容，发送小助手时推送给用户的群内权益推荐内容
	 */
	@ApiField("recommend_text")
	private String recommendText;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<String> getActivityIdList() {
		return this.activityIdList;
	}
	public void setActivityIdList(List<String> activityIdList) {
		this.activityIdList = activityIdList;
	}

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public Boolean getMultiCoupon() {
		return this.multiCoupon;
	}
	public void setMultiCoupon(Boolean multiCoupon) {
		this.multiCoupon = multiCoupon;
	}

	public String getRecommendText() {
		return this.recommendText;
	}
	public void setRecommendText(String recommendText) {
		this.recommendText = recommendText;
	}

}
