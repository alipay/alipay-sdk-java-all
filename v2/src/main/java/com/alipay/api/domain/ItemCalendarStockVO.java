package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 日历库存
 *
 * @author auto create
 * @since 1.0, 2023-11-29 14:37:58
 */
public class ItemCalendarStockVO extends AlipayObject {

	private static final long serialVersionUID = 6563523849287622383L;

	/**
	 * 库存的有效截止日期。 等于或晚于当前日期且在365天内(即不接收365天后的数据) ，有效开始日期和有效结束日期之间的间隔最大为60天。格式：yyyy-MM-dd 如2023-09-26
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 日历中排除某些日期，如["2023-10-01","2023-10-02","2023-10-03"]
	 */
	@ApiListField("exclude_dates")
	@ApiField("string")
	private List<String> excludeDates;

	/**
	 * 库存的有效开始日期。 等于或晚于当前日期且在365天内(即不接收365天后的数据) ，有效开始日期和有效结束日期之间的间隔最大为60天。格式：yyyy-MM-dd 如2023-09-26
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 库存的状态，1:有效/0:删除
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 库存限制类型，1:有限库存/0:无限库存。
	 */
	@ApiField("stock_limit")
	private Long stockLimit;

	/**
	 * 总库存。
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getExcludeDates() {
		return this.excludeDates;
	}
	public void setExcludeDates(List<String> excludeDates) {
		this.excludeDates = excludeDates;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStockLimit() {
		return this.stockLimit;
	}
	public void setStockLimit(Long stockLimit) {
		this.stockLimit = stockLimit;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
