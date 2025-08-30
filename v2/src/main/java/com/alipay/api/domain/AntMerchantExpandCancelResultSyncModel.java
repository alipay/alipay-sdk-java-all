package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单据撤销结果反馈接口
 *
 * @author auto create
 * @since 1.0, 2025-04-21 10:30:43
 */
public class AntMerchantExpandCancelResultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1368454641315129192L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * AO单号
	 */
	@ApiListField("order_id")
	@ApiField("string")
	private List<String> orderId;

	/**
	 * 撤销失败
	 */
	@ApiField("status")
	private String status;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<String> getOrderId() {
		return this.orderId;
	}
	public void setOrderId(List<String> orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
