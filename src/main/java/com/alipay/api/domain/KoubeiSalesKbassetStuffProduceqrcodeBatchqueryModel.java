package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页获取口碑码数据
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:43:26
 */
public class KoubeiSalesKbassetStuffProduceqrcodeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5348811681832255981L;

	/**
	 * 口碑批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 每页容量，最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 生产单号
	 */
	@ApiField("produce_order_id")
	private String produceOrderId;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProduceOrderId() {
		return this.produceOrderId;
	}
	public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
	}

}
