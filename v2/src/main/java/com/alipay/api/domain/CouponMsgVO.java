package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠券消息内容
 *
 * @author auto create
 * @since 1.0, 2025-09-23 14:37:45
 */
public class CouponMsgVO extends AlipayObject {

	private static final long serialVersionUID = 7291796132385972717L;

	/**
	 * 活动id，即券id
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
	 * 图片id
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 长文本介绍文案
	 */
	@ApiField("long_introduce_text")
	private String longIntroduceText;

	/**
	 * 该字段用于描述本群发消息是否使用券包样式, 若为true, 则群发消息展示使用券包样式, 否则使用普通样式
	 */
	@ApiField("multi_coupon")
	private Boolean multiCoupon;

	/**
	 * 短文本介绍文案列表
	 */
	@ApiListField("short_introduce_text_list")
	@ApiField("string")
	private List<String> shortIntroduceTextList;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

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

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getLongIntroduceText() {
		return this.longIntroduceText;
	}
	public void setLongIntroduceText(String longIntroduceText) {
		this.longIntroduceText = longIntroduceText;
	}

	public Boolean getMultiCoupon() {
		return this.multiCoupon;
	}
	public void setMultiCoupon(Boolean multiCoupon) {
		this.multiCoupon = multiCoupon;
	}

	public List<String> getShortIntroduceTextList() {
		return this.shortIntroduceTextList;
	}
	public void setShortIntroduceTextList(List<String> shortIntroduceTextList) {
		this.shortIntroduceTextList = shortIntroduceTextList;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
