package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户红包封面信息，包括生效时间区间、封面、封底、按钮、封面故事等视觉信息
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftUserTemplateBoxInfo extends AlipayObject {

	private static final long serialVersionUID = 1626686129851444622L;

	/**
	 * 封面氛围容器，用于拆包页
	 */
	@ApiField("atmosphere_box")
	private GiftTemplateAtmosphereBox atmosphereBox;

	/**
	 * 封底容器，用于拆红包页
	 */
	@ApiField("back_cover_box")
	private GiftTemplateBackCoverBox backCoverBox;

	/**
	 * 封面基础信，包含封面名称、祝福语等等
	 */
	@ApiField("base_info")
	private GiftTemplateBaseInfo baseInfo;

	/**
	 * 封面按钮容器，用于拆红包页
	 */
	@ApiField("button_box")
	private GiftTemplateButtonBox buttonBox;

	/**
	 * 封面容器，使用于拆红包页与红包详情页
	 */
	@ApiField("front_cover_box")
	private GiftTemplateFrontCoverBox frontCoverBox;

	/**
	 * 封面故事容器，用于红包详情页
	 */
	@ApiField("story_box")
	private GiftTemplateStoryBox storyBox;

	/**
	 * 封面是否在有效期内可被领取，true代表在有效期内，false代表不在有效期内
	 */
	@ApiField("valid")
	private Boolean valid;

	/**
	 * 封面的有效期结束时间，is_valid==false时返回，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 封面的有效期开始时间，当is_valid==true时返回，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("valid_start_time")
	private Date validStartTime;

	public GiftTemplateAtmosphereBox getAtmosphereBox() {
		return this.atmosphereBox;
	}
	public void setAtmosphereBox(GiftTemplateAtmosphereBox atmosphereBox) {
		this.atmosphereBox = atmosphereBox;
	}

	public GiftTemplateBackCoverBox getBackCoverBox() {
		return this.backCoverBox;
	}
	public void setBackCoverBox(GiftTemplateBackCoverBox backCoverBox) {
		this.backCoverBox = backCoverBox;
	}

	public GiftTemplateBaseInfo getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(GiftTemplateBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public GiftTemplateButtonBox getButtonBox() {
		return this.buttonBox;
	}
	public void setButtonBox(GiftTemplateButtonBox buttonBox) {
		this.buttonBox = buttonBox;
	}

	public GiftTemplateFrontCoverBox getFrontCoverBox() {
		return this.frontCoverBox;
	}
	public void setFrontCoverBox(GiftTemplateFrontCoverBox frontCoverBox) {
		this.frontCoverBox = frontCoverBox;
	}

	public GiftTemplateStoryBox getStoryBox() {
		return this.storyBox;
	}
	public void setStoryBox(GiftTemplateStoryBox storyBox) {
		this.storyBox = storyBox;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Date getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

}
