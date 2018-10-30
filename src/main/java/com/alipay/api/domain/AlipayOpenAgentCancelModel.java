package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消代商户签约、创建应用事务
 *
 * @author auto create
 * @since 1.0, 2017-12-29 11:04:33
 */
public class AlipayOpenAgentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4837115663791328143L;

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
