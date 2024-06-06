package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间区间
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:19:47
 */
public class DateRangeDTO extends AlipayObject {

	private static final long serialVersionUID = 4742482245436582816L;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private Date end;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private Date start;

	public Date getEnd() {
		return this.end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	public Date getStart() {
		return this.start;
	}
	public void setStart(Date start) {
		this.start = start;
	}

}
