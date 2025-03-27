package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询字典信息
 *
 * @author auto create
 * @since 1.0, 2023-08-22 14:08:20
 */
public class AlipayCloudDevopsDictQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6566473192781677675L;

	/**
	 * 任务重试黑名单列表
	 */
	@ApiField("value")
	private String value;

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
