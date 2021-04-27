package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代商户签约，提交信息确认接口
 *
 * @author auto create
 * @since 1.0, 2021-04-09 15:47:22
 */
public class AlipayOpenAgentCommonsignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2874368899498462991L;

	/**
	 * ISV 代商户操作事务编号，通过事务开启接口alipay.open.agent.create调用返回。
	 */
	@ApiField("batch_no")
	private String batchNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

}
