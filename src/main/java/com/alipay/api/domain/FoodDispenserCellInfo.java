package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取餐柜单元格信息模型
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:17
 */
public class FoodDispenserCellInfo extends AlipayObject {

	private static final long serialVersionUID = 5811722437735836989L;

	/**
	 * 业务状态
空闲：IDLE
预占：FREEZE
占用：OCCUPIED
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 单元格编号
	 */
	@ApiField("cell_code")
	private String cellCode;

	/**
	 * 单元格名称
	 */
	@ApiField("cell_name")
	private String cellName;

	/**
	 * 列数
	 */
	@ApiField("column_no")
	private String columnNo;

	/**
	 * 行数
	 */
	@ApiField("row_no")
	private String rowNo;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getCellCode() {
		return this.cellCode;
	}
	public void setCellCode(String cellCode) {
		this.cellCode = cellCode;
	}

	public String getCellName() {
		return this.cellName;
	}
	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public String getColumnNo() {
		return this.columnNo;
	}
	public void setColumnNo(String columnNo) {
		this.columnNo = columnNo;
	}

	public String getRowNo() {
		return this.rowNo;
	}
	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
	}

}
