package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询库存变更记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:27
 */
public class KoubeiRetailWmsInventoryrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7336693873644823677L;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 出入库截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型（ZP=正品, CC=残次,JS=机损, XS= 箱损, ZT=在途库存）
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 库存操作类型（INBOUND＝入库，OUTBOUND＝出库）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 页码（默认值为1，必须为正整数）
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小（最小1，默认20，最大100）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 出入库开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
