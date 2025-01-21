package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发放规则修改模型
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemVoucherModifySendRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 1159112156296649511L;

	/**
	 * 券发放结束时间， 格式：yyyy-MM-dd HH:mm:ss 匹配格式yyyy-MM-dd HH:mm:ss的date类型
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

}
