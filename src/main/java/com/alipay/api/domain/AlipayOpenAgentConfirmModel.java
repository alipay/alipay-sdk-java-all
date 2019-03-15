package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交代商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2018-06-15 11:24:58
 */
public class AlipayOpenAgentConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 7812924767591583798L;

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
