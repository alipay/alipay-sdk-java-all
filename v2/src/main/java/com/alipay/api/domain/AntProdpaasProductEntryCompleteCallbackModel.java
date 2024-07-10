package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链调入指令反馈
 *
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:48
 */
public class AntProdpaasProductEntryCompleteCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 4358493742815189394L;

	/**
	 * 实收数量
	 */
	@ApiField("actual_qty")
	private Long actualQty;

	/**
	 * 批次编码
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 入库单号,入库指令编号
	 */
	@ApiField("entry_order_code")
	private String entryOrderCode;

	/**
	 * 商品过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 供应链商品属性集合
	 */
	@ApiListField("extend_pros")
	@ApiField("supplier_item_attr_field")
	private List<SupplierItemAttrField> extendPros;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 外部业务编码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 商品生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 商品序列号
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	/**
	 * 入库单状态: 待入库WAIT_INBOUND，已入库ALL_INBOUND
	 */
	@ApiField("status")
	private String status;

	/**
	 * 仓库编号,由供应商提供
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Long getActualQty() {
		return this.actualQty;
	}
	public void setActualQty(Long actualQty) {
		this.actualQty = actualQty;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getEntryOrderCode() {
		return this.entryOrderCode;
	}
	public void setEntryOrderCode(String entryOrderCode) {
		this.entryOrderCode = entryOrderCode;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public List<SupplierItemAttrField> getExtendPros() {
		return this.extendPros;
	}
	public void setExtendPros(List<SupplierItemAttrField> extendPros) {
		this.extendPros = extendPros;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getProduceCode() {
		return this.produceCode;
	}
	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public Date getProductDate() {
		return this.productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
