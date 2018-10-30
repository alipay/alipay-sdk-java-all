package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询销账机构列表
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:09
 */
public class AlipayEbppProdmodeChargeoffinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5569477216645789841L;

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
