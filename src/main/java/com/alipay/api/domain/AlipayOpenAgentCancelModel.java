package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消代商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2019-11-18 14:27:27
 */
public class AlipayOpenAgentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3297334372713418251L;

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
