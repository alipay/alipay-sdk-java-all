package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询生产单下需要生产的物料详情
 *
 * @author auto create
 * @since 1.0, 2024-08-25 21:03:16
 */
public class AlipayOpenSpNordermaterialsMaterialsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8266423399247629536L;

	/**
	 * 分批查询的页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页的数据量大小，单位条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * spi收到的生产单号对应
	 */
	@ApiField("production_order_no")
	private String productionOrderNo;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductionOrderNo() {
		return this.productionOrderNo;
	}
	public void setProductionOrderNo(String productionOrderNo) {
		this.productionOrderNo = productionOrderNo;
	}

}
