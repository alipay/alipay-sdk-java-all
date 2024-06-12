package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连解决方案批次数据提报结果查询
 *
 * @author auto create
 * @since 1.0, 2024-06-05 18:57:00
 */
public class AlipayMerchantSolutionBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6519149633454424727L;

	/**
	 * 提报成功后，支付宝侧生成的提报批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 外部批次号，在外部系统中唯一标识一个提报批次
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

}
