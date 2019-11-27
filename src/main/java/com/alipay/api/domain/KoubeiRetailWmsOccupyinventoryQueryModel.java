package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 占用库存查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-19 14:17:10
 */
public class KoubeiRetailWmsOccupyinventoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8882876423831164326L;

	/**
	 * 商品code
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 分页页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
