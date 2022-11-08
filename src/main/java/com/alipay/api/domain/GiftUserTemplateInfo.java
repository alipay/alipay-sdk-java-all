package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户红包皮肤的数据信息，包括有效期起始，对应的视觉样式等等
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class GiftUserTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 4135822561765925472L;

	/**
	 * 红包封面下半部分不带“开”字按钮的图片url
	 */
	@ApiField("template_down_url")
	private String templateDownUrl;

	/**
	 * 封面缩略图url
图片宽高：400x560像素
图片格式：JPG
文件大小：≤100K
	 */
	@ApiField("template_thumb_nail")
	private String templateThumbNail;

	/**
	 * 红包封面上半部分带“开”字按钮的图片url
图片宽高：600x864像素
图片格式：PNG
文件大小：≤150K
	 */
	@ApiField("template_up_url")
	private String templateUpUrl;

	/**
	 * 封面是否在有效期内可被领取，true代表在有效期内，false代表不在有效期内
	 */
	@ApiField("valid")
	private String valid;

	/**
	 * 封面的有效期结束时间，is_valid==false时返回，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("valid_end_time")
	private String validEndTime;

	/**
	 * 封面的有效期开始时间，当is_valid==true时返回，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("valid_start_time")
	private String validStartTime;

	public String getTemplateDownUrl() {
		return this.templateDownUrl;
	}
	public void setTemplateDownUrl(String templateDownUrl) {
		this.templateDownUrl = templateDownUrl;
	}

	public String getTemplateThumbNail() {
		return this.templateThumbNail;
	}
	public void setTemplateThumbNail(String templateThumbNail) {
		this.templateThumbNail = templateThumbNail;
	}

	public String getTemplateUpUrl() {
		return this.templateUpUrl;
	}
	public void setTemplateUpUrl(String templateUpUrl) {
		this.templateUpUrl = templateUpUrl;
	}

	public String getValid() {
		return this.valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(String validEndTime) {
		this.validEndTime = validEndTime;
	}

	public String getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(String validStartTime) {
		this.validStartTime = validStartTime;
	}

}
