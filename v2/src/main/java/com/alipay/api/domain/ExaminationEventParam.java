package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类事件数据参数
 *
 * @author auto create
 * @since 1.0, 2026-08-13 15:54:25
 */
public class ExaminationEventParam extends AlipayObject {

	private static final long serialVersionUID = 6454752967721798653L;

	/**
	 * 预约时间信息
event_type=bookTimeChanged
时有值
	 */
	@ApiField("book_time")
	private BookTimeParam bookTime;

	/**
	 * 检查单号
	 */
	@ApiField("check_no")
	private String checkNo;

	public BookTimeParam getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(BookTimeParam bookTime) {
		this.bookTime = bookTime;
	}

	public String getCheckNo() {
		return this.checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

}
