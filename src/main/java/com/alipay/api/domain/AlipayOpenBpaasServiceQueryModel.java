package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝IOT-bpaas平台服务查询
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:57:31
 */
public class AlipayOpenBpaasServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6835421248568374757L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
