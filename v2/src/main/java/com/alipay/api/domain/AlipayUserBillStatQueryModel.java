package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝账单统计数据
 *
 * @author auto create
 * @since 1.0, 2021-10-27 21:24:26
 */
public class AlipayUserBillStatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1785124269978832417L;

	/**
	 * 查询数据开始时间，包含此时间数据，待隐私合规改造后必填
	 */
	@ApiField("begin_date")
	private Date beginDate;

	/**
	 * 消费记录来源
4000：淘宝
3008：支付宝
other：其他商家

为空则查询所有来源账单
	 */
	@ApiListField("consume_sites")
	@ApiField("string")
	private List<String> consumeSites;

	/**
	 * 查询数据结束时间，包含此时间数据，待隐私合规改造后必填
	 */
	@ApiField("end_date")
	private Date endDate;

	public Date getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public List<String> getConsumeSites() {
		return this.consumeSites;
	}
	public void setConsumeSites(List<String> consumeSites) {
		this.consumeSites = consumeSites;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
