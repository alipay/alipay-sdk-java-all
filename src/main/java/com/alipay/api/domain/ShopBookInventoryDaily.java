package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单日库存信息
 *
 * @author auto create
 * @since 1.0, 2019-03-25 11:02:40
 */
public class ShopBookInventoryDaily extends AlipayObject {

	private static final long serialVersionUID = 7263955521258853413L;

	/**
	 * 可预订时间。格式： HH:mm:ss
	 */
	@ApiField("book_time")
	private String bookTime;

	/**
	 * 桌台最大人数
	 */
	@ApiField("max_table_num")
	private Long maxTableNum;

	/**
	 * 桌台最小人数
	 */
	@ApiField("min_table_num")
	private Long minTableNum;

	/**
	 * 订座桌台位置。如lobby表示大厅；如box表示包厢。
	 */
	@ApiField("table_position")
	private String tablePosition;

	public String getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}

	public Long getMaxTableNum() {
		return this.maxTableNum;
	}
	public void setMaxTableNum(Long maxTableNum) {
		this.maxTableNum = maxTableNum;
	}

	public Long getMinTableNum() {
		return this.minTableNum;
	}
	public void setMinTableNum(Long minTableNum) {
		this.minTableNum = minTableNum;
	}

	public String getTablePosition() {
		return this.tablePosition;
	}
	public void setTablePosition(String tablePosition) {
		this.tablePosition = tablePosition;
	}

}
