package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗投放单元查询接口
 *
 * @author auto create
 * @since 1.0, 2021-01-05 19:48:59
 */
public class AlipayPcreditHuabeiDeliverQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2787689228736511545L;

	/**
	 * 业务参数
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
