package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体-视频跟练-同步爱动课程
 *
 * @author auto create
 * @since 1.0, 2023-07-07 16:57:36
 */
public class AlipayCommerceSportsLessonBackstageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5412918784312635869L;

	/**
	 * 投放结束时间
	 */
	@ApiField("deliver_end_time")
	private Date deliverEndTime;

	/**
	 * 投放开始时间
	 */
	@ApiField("deliver_start_time")
	private Date deliverStartTime;

	/**
	 * 卡路里
	 */
	@ApiField("lesson_calorie")
	private Long lessonCalorie;

	/**
	 * 收费类型
	 */
	@ApiField("lesson_charge_type")
	private String lessonChargeType;

	/**
	 * 课程时长
	 */
	@ApiField("lesson_duration")
	private Long lessonDuration;

	/**
	 * 课程器械
	 */
	@ApiListField("lesson_ext_tag")
	@ApiField("string")
	private List<String> lessonExtTag;

	/**
	 * 课程图片(URL),来自于三方上传至阿里云oss的URL
	 */
	@ApiField("lesson_image")
	private String lessonImage;

	/**
	 * 课程介绍
	 */
	@ApiField("lesson_intro")
	private String lessonIntro;

	/**
	 * 长图(URL)，来自于三方上传至阿里云oss后的图片url
	 */
	@ApiField("lesson_intro_image")
	private String lessonIntroImage;

	/**
	 * 限免结束时间
	 */
	@ApiField("lesson_limit_free_end_time")
	private Date lessonLimitFreeEndTime;

	/**
	 * 限免开始时间
	 */
	@ApiField("lesson_limit_free_start_time")
	private Date lessonLimitFreeStartTime;

	/**
	 * 课程名
	 */
	@ApiField("lesson_name")
	private String lessonName;

	/**
	 * 外部课程id
	 */
	@ApiField("lesson_out_id")
	private String lessonOutId;

	/**
	 * 课程来源
	 */
	@ApiField("lesson_source")
	private String lessonSource;

	/**
	 * 课程标签
	 */
	@ApiListField("lesson_tag")
	@ApiField("string")
	private List<String> lessonTag;

	/**
	 * 课程类型
	 */
	@ApiField("lesson_type")
	private String lessonType;

	/**
	 * 课程链接
	 */
	@ApiField("lesson_url")
	private String lessonUrl;

	/**
	 * 版本号
	 */
	@ApiField("version_no")
	private Long versionNo;

	public Date getDeliverEndTime() {
		return this.deliverEndTime;
	}
	public void setDeliverEndTime(Date deliverEndTime) {
		this.deliverEndTime = deliverEndTime;
	}

	public Date getDeliverStartTime() {
		return this.deliverStartTime;
	}
	public void setDeliverStartTime(Date deliverStartTime) {
		this.deliverStartTime = deliverStartTime;
	}

	public Long getLessonCalorie() {
		return this.lessonCalorie;
	}
	public void setLessonCalorie(Long lessonCalorie) {
		this.lessonCalorie = lessonCalorie;
	}

	public String getLessonChargeType() {
		return this.lessonChargeType;
	}
	public void setLessonChargeType(String lessonChargeType) {
		this.lessonChargeType = lessonChargeType;
	}

	public Long getLessonDuration() {
		return this.lessonDuration;
	}
	public void setLessonDuration(Long lessonDuration) {
		this.lessonDuration = lessonDuration;
	}

	public List<String> getLessonExtTag() {
		return this.lessonExtTag;
	}
	public void setLessonExtTag(List<String> lessonExtTag) {
		this.lessonExtTag = lessonExtTag;
	}

	public String getLessonImage() {
		return this.lessonImage;
	}
	public void setLessonImage(String lessonImage) {
		this.lessonImage = lessonImage;
	}

	public String getLessonIntro() {
		return this.lessonIntro;
	}
	public void setLessonIntro(String lessonIntro) {
		this.lessonIntro = lessonIntro;
	}

	public String getLessonIntroImage() {
		return this.lessonIntroImage;
	}
	public void setLessonIntroImage(String lessonIntroImage) {
		this.lessonIntroImage = lessonIntroImage;
	}

	public Date getLessonLimitFreeEndTime() {
		return this.lessonLimitFreeEndTime;
	}
	public void setLessonLimitFreeEndTime(Date lessonLimitFreeEndTime) {
		this.lessonLimitFreeEndTime = lessonLimitFreeEndTime;
	}

	public Date getLessonLimitFreeStartTime() {
		return this.lessonLimitFreeStartTime;
	}
	public void setLessonLimitFreeStartTime(Date lessonLimitFreeStartTime) {
		this.lessonLimitFreeStartTime = lessonLimitFreeStartTime;
	}

	public String getLessonName() {
		return this.lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getLessonOutId() {
		return this.lessonOutId;
	}
	public void setLessonOutId(String lessonOutId) {
		this.lessonOutId = lessonOutId;
	}

	public String getLessonSource() {
		return this.lessonSource;
	}
	public void setLessonSource(String lessonSource) {
		this.lessonSource = lessonSource;
	}

	public List<String> getLessonTag() {
		return this.lessonTag;
	}
	public void setLessonTag(List<String> lessonTag) {
		this.lessonTag = lessonTag;
	}

	public String getLessonType() {
		return this.lessonType;
	}
	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}

	public String getLessonUrl() {
		return this.lessonUrl;
	}
	public void setLessonUrl(String lessonUrl) {
		this.lessonUrl = lessonUrl;
	}

	public Long getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(Long versionNo) {
		this.versionNo = versionNo;
	}

}
