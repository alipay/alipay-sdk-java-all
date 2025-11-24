package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单团单批次信息
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:32:45
 */
public class InsGroupOrderBatchDigest extends AlipayObject {

	private static final long serialVersionUID = 5152329642958332343L;

	/**
	 * 批次单号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
