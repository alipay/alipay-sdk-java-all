package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放活动－奖品适用门店
 *
 * @author auto create
 * @since 1.0, 2016-03-14 15:03:10
 */
public class OpenPromoPrizeRelativeTime extends AlipayObject {

	private static final long serialVersionUID = 6745572164625922324L;

	/**
	 * 时间维度,
     MI：表示 分
     H：表示 时
     D：表示 日
     W：表示 周
     M：表示 月
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 相对值
	 */
	@ApiField("value")
	private String value;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
