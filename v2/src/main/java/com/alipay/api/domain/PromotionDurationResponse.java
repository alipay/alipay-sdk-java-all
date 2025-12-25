package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠可用时段
 *
 * @author auto create
 * @since 1.0, 2025-01-10 10:12:11
 */
public class PromotionDurationResponse extends AlipayObject {

	private static final long serialVersionUID = 1339235628335433952L;

	/**
	 * 时段列表，如：01:00:00-02:00:00，代表1点到2点
	 */
	@ApiListField("hour_list")
	@ApiField("string")
	private List<String> hourList;

	/**
	 * 周时间列表，如：["1","2"]，代表周一、周二
	 */
	@ApiListField("week_list")
	@ApiField("string")
	private List<String> weekList;

	public List<String> getHourList() {
		return this.hourList;
	}
	public void setHourList(List<String> hourList) {
		this.hourList = hourList;
	}

	public List<String> getWeekList() {
		return this.weekList;
	}
	public void setWeekList(List<String> weekList) {
		this.weekList = weekList;
	}

}
