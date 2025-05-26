package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容疲劳度配置
 *
 * @author auto create
 * @since 1.0, 2023-02-28 11:26:08
 */
public class DeliveryFatigueContent extends AlipayObject {

	private static final long serialVersionUID = 2381993524852192864L;

	/**
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 增长展位代码
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

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

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
