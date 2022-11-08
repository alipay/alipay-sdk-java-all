package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算单和收款单核销
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:49:32
 */
public class AlipayBossFncGfsettleprodWriteofforderVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6219358491848173661L;

	/**
	 * 核销请求openapi核销Order
	 */
	@ApiField("write_off_process_order")
	private WriteOffProcessOrderOpenApiDTO writeOffProcessOrder;

	public WriteOffProcessOrderOpenApiDTO getWriteOffProcessOrder() {
		return this.writeOffProcessOrder;
	}
	public void setWriteOffProcessOrder(WriteOffProcessOrderOpenApiDTO writeOffProcessOrder) {
		this.writeOffProcessOrder = writeOffProcessOrder;
	}

}
