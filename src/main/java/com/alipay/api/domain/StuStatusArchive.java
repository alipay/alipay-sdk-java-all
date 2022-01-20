package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学籍档案
 *
 * @author auto create
 * @since 1.0, 2021-01-04 19:25:16
 */
public class StuStatusArchive extends AlipayObject {

	private static final long serialVersionUID = 6467128262623339169L;

	/**
	 * 所在学校名称
	 */
	@ApiField("inst_name")
	private String instName;

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

}
