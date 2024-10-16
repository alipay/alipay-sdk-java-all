package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISP非bizContent创建测试
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:15:05
 */
public class AlipayMerchantOrderHahaNobizcontentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6252597186951226211L;

	/**
	 * delete
	 */
	@ApiField("delete")
	private String delete;

	/**
	 * test
	 */
	@ApiField("input")
	private String input;

	public String getDelete() {
		return this.delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

}
