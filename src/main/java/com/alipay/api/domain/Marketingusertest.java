package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试的复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-08-01 16:02:31
 */
public class Marketingusertest extends AlipayObject {

	private static final long serialVersionUID = 5557338667845254149L;

	/**
	 * 这是一个测试
	 */
	@ApiListField("test_12")
	@ApiField("transfer_address_info")
	private List<TransferAddressInfo> test12;

	public List<TransferAddressInfo> getTest12() {
		return this.test12;
	}
	public void setTest12(List<TransferAddressInfo> test12) {
		this.test12 = test12;
	}

}
