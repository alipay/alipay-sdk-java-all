package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户查询入参模型
 *
 * @author auto create
 * @since 1.0, 2023-12-06 11:11:33
 */
public class SubAccountQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 7478278925579259488L;

	/**
	 * 支付宝虚拟账号，也称2088账号，由每个sourceUid申请得到一个
	 */
	@ApiField("alipay_virtual_id")
	private String alipayVirtualId;

	public String getAlipayVirtualId() {
		return this.alipayVirtualId;
	}
	public void setAlipayVirtualId(String alipayVirtualId) {
		this.alipayVirtualId = alipayVirtualId;
	}

}
