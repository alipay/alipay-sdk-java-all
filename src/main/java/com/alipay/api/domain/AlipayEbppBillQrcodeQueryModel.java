package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询预创单据发码、支付、受理进度
 *
 * @author auto create
 * @since 1.0, 2017-08-04 23:02:21
 */
public class AlipayEbppBillQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1314199581237619681L;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
