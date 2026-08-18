package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预约时间信息参数
 *
 * @author auto create
 * @since 1.0, 2026-08-13 15:54:25
 */
public class BookTimeParam extends AlipayObject {

	private static final long serialVersionUID = 6663715157253564932L;

	/**
	 * 修改后的预约结束时间
yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("book_end_time")
	private String bookEndTime;

	/**
	 * 修改后的预约开始时间
yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("book_start_time")
	private String bookStartTime;

	public String getBookEndTime() {
		return this.bookEndTime;
	}
	public void setBookEndTime(String bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	public String getBookStartTime() {
		return this.bookStartTime;
	}
	public void setBookStartTime(String bookStartTime) {
		this.bookStartTime = bookStartTime;
	}

}
