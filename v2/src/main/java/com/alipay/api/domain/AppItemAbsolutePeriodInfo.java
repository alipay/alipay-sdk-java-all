package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绝对核销时间
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemAbsolutePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 1578396352628957782L;

	/**
	 * 可用开始时间， 格式：yyyy-MM-dd HH:mm:ss
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 可用结束时间格式：yyyy-MM-dd HH:mm:ss
匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

}
