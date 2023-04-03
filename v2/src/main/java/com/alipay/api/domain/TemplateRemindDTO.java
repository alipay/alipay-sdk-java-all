package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版提醒信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateRemindDTO extends AlipayObject {

	private static final long serialVersionUID = 5795977365384541152L;

	/**
	 * 提醒默认的提前秒数，3600-24×3600秒之间。即将到期时提醒用户使用卡券，不设置则按照券类型默认时间提醒，一般为36小时。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("offset")
	private String offset;

	public String getOffset() {
		return this.offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}

}
