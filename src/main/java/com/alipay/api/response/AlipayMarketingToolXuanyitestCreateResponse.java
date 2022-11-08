package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransferResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.xuanyitest.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-01 16:07:01
 */
public class AlipayMarketingToolXuanyitestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5489373954547795443L;

	/** 
	 * 这是一个复杂类型测试描述
	 */
	@ApiListField("test_12")
	@ApiField("transfer_result_info")
	private List<TransferResultInfo> test12;

	public void setTest12(List<TransferResultInfo> test12) {
		this.test12 = test12;
	}
	public List<TransferResultInfo> getTest12( ) {
		return this.test12;
	}

}
