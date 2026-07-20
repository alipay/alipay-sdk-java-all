package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询批次订单下的申请订单信息
 *
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:17
 */
public class AlipayCommerceIotDapplyOrdersimpleinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2342529958926414951L;

	/**
	 * 批次申请订单号
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
