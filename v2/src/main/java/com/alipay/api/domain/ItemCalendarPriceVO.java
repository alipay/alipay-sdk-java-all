package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 日历价格
 *
 * @author auto create
 * @since 1.0, 2023-11-29 14:37:47
 */
public class ItemCalendarPriceVO extends AlipayObject {

	private static final long serialVersionUID = 8892575999942892522L;

	/**
	 * 价格的有效截止日期。 等于或晚于当前日期且在365天内(即不接收365天后的数据) ，有效开始日期和有效结束日期之间的间隔最大为60天。格式：yyyy-MM-dd 如2023-09-26
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
	 * 原价，单位:分，为非负数。为空则不创建或更新。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价，单位:分，为非负数。为空则不创建或更新。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 价格的有效开始日期。 等于或晚于当前日期且在365天内(即不接收365天后的数据)， 有效开始日期和有效结束日期之间的间隔最大为60天。格式：yyyy-MM-dd 如2023-09-26
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 价格的状态，1:有效/0:删除
	 */
	@ApiField("status")
	private Long status;

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

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
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

}
