package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存分页查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:15
 */
public class KoubeiRetailWmsInventoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8683318747378129911L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品类型，ZP("正品"),CC("残次"),JS("机损"), XS("箱损"),ZT("在途库存")
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 页码（默认1，正整数）
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小(最小为1，默认20，最大100)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
