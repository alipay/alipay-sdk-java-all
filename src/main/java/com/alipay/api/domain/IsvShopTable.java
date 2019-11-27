package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 回传的商户操作的桌子具体信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class IsvShopTable extends AlipayObject {

	private static final long serialVersionUID = 3359313184366654536L;

	/**
	 * 最大容量
	 */
	@ApiField("max")
	private Long max;

	/**
	 * 最小容量
	 */
	@ApiField("min")
	private Long min;

	/**
	 * 0空闲 1 占用 2 不可知
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 座位ID， 必填
	 */
	@ApiField("table_id")
	private String tableId;

	/**
	 * 餐桌名称
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 餐桌类型：
1:普通桌;
2:包厢
	 */
	@ApiField("table_type")
	private Long tableType;

	public Long getMax() {
		return this.max;
	}
	public void setMax(Long max) {
		this.max = max;
	}

	public Long getMin() {
		return this.min;
	}
	public void setMin(Long min) {
		this.min = min;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTableId() {
		return this.tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Long getTableType() {
		return this.tableType;
	}
	public void setTableType(Long tableType) {
		this.tableType = tableType;
	}

}
