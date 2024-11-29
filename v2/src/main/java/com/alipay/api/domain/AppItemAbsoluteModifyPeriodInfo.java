package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绝对时间修改信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemAbsoluteModifyPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 7695473184949373385L;

	/**
	 * 可用结束时间格式：yyyy-MM-dd HH:mm:ss 匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

}
