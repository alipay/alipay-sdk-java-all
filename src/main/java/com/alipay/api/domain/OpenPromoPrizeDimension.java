package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 周期性使用时段规则
 *
 * @author auto create
 * @since 1.0, 2016-03-14 15:03:10
 */
public class OpenPromoPrizeDimension extends AlipayObject {

	private static final long serialVersionUID = 1539912948622145288L;

	/**
	 * 时间维度,
W：表示 周[1,4,5]
MIOD：表示 每天X分钟[0,1439]
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 参考dimension 后面的值
	 */
	@ApiListField("values")
	@ApiField("number")
	private List<Long> values;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public List<Long> getValues() {
		return this.values;
	}
	public void setValues(List<Long> values) {
		this.values = values;
	}

}
