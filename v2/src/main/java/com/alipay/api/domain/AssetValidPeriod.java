package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益实体有效期
 *
 * @author auto create
 * @since 1.0, 2021-04-27 23:57:38
 */
public class AssetValidPeriod extends AlipayObject {

	private static final long serialVersionUID = 1216961432868956552L;

	/**
	 * 权益实体的有效期，可以是相对模板过期时间基础上增加的时间也可以是绝对时间，相对时间：2d表示相对模板过期增加2天，10h表示增加10个小时，5m表示增加5分钟，绝对时间的格式为： yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
