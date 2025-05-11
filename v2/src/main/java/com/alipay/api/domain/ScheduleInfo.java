package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间表，定义当前服务者在一定时间范围内，可以提供服务的时间窗口
 *
 * @author auto create
 * @since 1.0, 2017-01-12 17:05:10
 */
public class ScheduleInfo extends AlipayObject {

	private static final long serialVersionUID = 2851929518323629997L;

	/**
	 * 根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用
	 */
	@ApiField("bitmap")
	private String bitmap;

	/**
	 * 时间，默认YYYY-MM-DD格式，如果是单位是月，就填写YYYY-01-01格式，如果单位是周和日，就是YYYY-MM-01格式
	 */
	@ApiField("date")
	private String date;

	public String getBitmap() {
		return this.bitmap;
	}
	public void setBitmap(String bitmap) {
		this.bitmap = bitmap;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
