package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品销量
 *
 * @author auto create
 * @since 1.0, 2021-01-06 11:22:34
 */
public class GoodsSalesVolume extends AlipayObject {

	private static final long serialVersionUID = 6471744545864197227L;

	/**
	 * 商品销量周期。使用枚举值
MONTH/HALF_YEAR/YEAR 分别表示月/半年/年
	 */
	@ApiField("period")
	private String period;

	/**
	 * 销量数值串，需要为整数
	 */
	@ApiField("volume")
	private Long volume;

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
