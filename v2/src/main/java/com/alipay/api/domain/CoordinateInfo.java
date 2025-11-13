package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片信息坐标
 *
 * @author auto create
 * @since 1.0, 2025-04-15 19:37:27
 */
public class CoordinateInfo extends AlipayObject {

	private static final long serialVersionUID = 1549147569343224134L;

	/**
	 * 识别信息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 结束点横坐标，单位px
	 */
	@ApiField("end_x")
	private String endX;

	/**
	 * 结束点纵坐标，单位px
	 */
	@ApiField("end_y")
	private String endY;

	/**
	 * 起始点横坐标，单位px
	 */
	@ApiField("start_x")
	private String startX;

	/**
	 * 起始点纵坐标，单位px
	 */
	@ApiField("start_y")
	private String startY;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getEndX() {
		return this.endX;
	}
	public void setEndX(String endX) {
		this.endX = endX;
	}

	public String getEndY() {
		return this.endY;
	}
	public void setEndY(String endY) {
		this.endY = endY;
	}

	public String getStartX() {
		return this.startX;
	}
	public void setStartX(String startX) {
		this.startX = startX;
	}

	public String getStartY() {
		return this.startY;
	}
	public void setStartY(String startY) {
		this.startY = startY;
	}

}
