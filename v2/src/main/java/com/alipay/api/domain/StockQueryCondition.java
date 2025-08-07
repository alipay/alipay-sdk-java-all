package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 库存查询条件
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class StockQueryCondition extends AlipayObject {

	private static final long serialVersionUID = 2732548651481824764L;

	/**
	 * 库存查询结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 站点列表
	 */
	@ApiListField("position")
	@ApiField("position")
	private List<Position> position;

	/**
	 * 库存查询起始日期
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Position> getPosition() {
		return this.position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
