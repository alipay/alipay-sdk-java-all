package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取应用已绑定门店的三方门店编码
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:37
 */
public class AlipayCommerceMedicalStoreCodelistGetModel extends AlipayObject {

	private static final long serialVersionUID = 5214586364332397964L;

	/**
	 * 每次获取数据限制的最大条数，举例：传100时，则在数据量满足的情况下，单次最多返回100条数据
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 用于分批获取门店编码的偏移量；举例：每一次调用接口获取100条，则第一次传0，第二次传100，第N次传（N-1）*100
	 */
	@ApiField("offset")
	private Long offset;

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

}
