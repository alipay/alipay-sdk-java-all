package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试文档缺失数据迁移
 *
 * @author auto create
 * @since 1.0, 2020-02-13 23:08:33
 */
public class AlipayOpenAppDedfDdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3748536268416122534L;

	/**
	 * 10
	 */
	@ApiField("zyde")
	private String zyde;

	public String getZyde() {
		return this.zyde;
	}
	public void setZyde(String zyde) {
		this.zyde = zyde;
	}

}
