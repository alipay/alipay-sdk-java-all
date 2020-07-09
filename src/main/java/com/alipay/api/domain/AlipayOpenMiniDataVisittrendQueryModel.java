package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序访问趋势实时数据查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:27
 */
public class AlipayOpenMiniDataVisittrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5734383798736268243L;

	/**
	 * 查询小程序访问趋势数据的粒度，如HOUR-小时级
	 */
	@ApiField("time_unit")
	private String timeUnit;

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}
