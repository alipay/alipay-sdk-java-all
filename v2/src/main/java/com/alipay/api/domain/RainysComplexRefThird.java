package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-03-07 18:47:25
 */
public class RainysComplexRefThird extends AlipayObject {

	private static final long serialVersionUID = 2492753857798467797L;

	/**
	 * 测试数据
	 */
	@ApiField("ob_num")
	private Long obNum;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("object_string")
	private String objectString;

	public Long getObNum() {
		return this.obNum;
	}
	public void setObNum(Long obNum) {
		this.obNum = obNum;
	}

	public String getObjectString() {
		return this.objectString;
	}
	public void setObjectString(String objectString) {
		this.objectString = objectString;
	}

}
