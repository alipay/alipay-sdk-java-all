package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠券消息内容
 *
 * @author auto create
 * @since 1.0, 2024-07-01 15:00:50
 */
public class CouponMsgVO extends AlipayObject {

	private static final long serialVersionUID = 4219185528146392347L;

	/**
	 * 活动id，即券id
	 */
	@ApiField("activity_id")
	private String activityId;

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
