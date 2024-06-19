package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 策略组疲劳度
 *
 * @author auto create
 * @since 1.0, 2024-06-11 17:51:32
 */
public class StrategyGroupFatigue extends AlipayObject {

	private static final long serialVersionUID = 7877331236276916985L;

	/**
	 * 展位内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 展位内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 疲劳度平台对应id
	 */
	@ApiField("fatigue_id")
	private String fatigueId;

	/**
	 * 展位代码
	 */
	@ApiField("space_id")
	private String spaceId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFatigueId() {
		return this.fatigueId;
	}
	public void setFatigueId(String fatigueId) {
		this.fatigueId = fatigueId;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
