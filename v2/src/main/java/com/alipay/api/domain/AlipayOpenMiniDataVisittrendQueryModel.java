package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序访问趋势实时数据查询
 *
 * @author auto create
 * @since 1.0, 2021-06-01 14:34:14
 */
public class AlipayOpenMiniDataVisittrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4691333264248541149L;

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
