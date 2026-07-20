package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务权益项列表
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:00:14
 */
public class RightInfo extends AlipayObject {

	private static final long serialVersionUID = 1858159981431236951L;

	/**
	 * 权益副标题
	 */
	@ApiField("right_subtitle")
	private String rightSubtitle;

	/**
	 * 权益标题
	 */
	@ApiField("right_title")
	private String rightTitle;

	/**
	 * 权益总数
	 */
	@ApiField("total_times")
	private String totalTimes;

	public String getRightSubtitle() {
		return this.rightSubtitle;
	}
	public void setRightSubtitle(String rightSubtitle) {
		this.rightSubtitle = rightSubtitle;
	}

	public String getRightTitle() {
		return this.rightTitle;
	}
	public void setRightTitle(String rightTitle) {
		this.rightTitle = rightTitle;
	}

	public String getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(String totalTimes) {
		this.totalTimes = totalTimes;
	}

}
