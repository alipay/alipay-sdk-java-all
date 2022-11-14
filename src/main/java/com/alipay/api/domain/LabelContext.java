package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签组发圈人条件
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:56:25
 */
public class LabelContext extends AlipayObject {

	private static final long serialVersionUID = 1239435839157183986L;

	/**
	 * 标签组发圈人的单个过滤器信息
	 */
	@ApiField("a")
	private LabelFilter a;

	public LabelFilter getA() {
		return this.a;
	}
	public void setA(LabelFilter a) {
		this.a = a;
	}

}
