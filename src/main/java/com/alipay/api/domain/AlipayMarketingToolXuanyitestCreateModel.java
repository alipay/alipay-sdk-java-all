package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源测试接口2.0
 *
 * @author auto create
 * @since 1.0, 2022-08-01 15:13:04
 */
public class AlipayMarketingToolXuanyitestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7733473573846916165L;

	/**
	 * 这是一个复杂类型测试描述
	 */
	@ApiListField("test_12")
	@ApiField("transfer_result_info")
	private List<TransferResultInfo> test12;

	public List<TransferResultInfo> getTest12() {
		return this.test12;
	}
	public void setTest12(List<TransferResultInfo> test12) {
		this.test12 = test12;
	}

}
