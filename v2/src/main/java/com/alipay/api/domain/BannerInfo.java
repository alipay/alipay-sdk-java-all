package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  新增banner实体数据
 *
 * @author auto create
 * @since 1.0, 2021-04-06 13:45:54
 */
public class BannerInfo extends AlipayObject {

	private static final long serialVersionUID = 8344235443137649986L;

	/**
	 * banner点击后跳转地址，只能是小程序地址。
字段在操作类型为add的时候为必填
	 */
	@ApiField("click_url")
	private String clickUrl;

	/**
	 * 展示结束时间，可不填，后续下线需要调用op_type为offline来操作下线。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 图片地址，新增操作情况下，图片链接为必填字段
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 展示起始时间，可不填，默认为当前时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getClickUrl() {
		return this.clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
