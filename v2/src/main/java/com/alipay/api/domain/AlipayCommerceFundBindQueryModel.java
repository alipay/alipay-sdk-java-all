package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金绑卡进度查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-08 17:14:12
 */
public class AlipayCommerceFundBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8446984175326628585L;

	/**
	 * 绑卡流水号，此处需要绑卡接口指定的out_bind_no
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	public String getOutBindNo() {
		return this.outBindNo;
	}
	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}

}
