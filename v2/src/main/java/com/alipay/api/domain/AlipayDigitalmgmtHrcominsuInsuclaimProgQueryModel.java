package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询理赔进度
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:47:38
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimProgQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3343386358957471243L;

	/**
	 * data_key+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * is_submit+不唯一+供应商查询未提交给理赔公司的，理赔状态为进行中的理赔报案数据+枚举值(有)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("is_submit")
	private Long isSubmit;

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public Long getIsSubmit() {
		return this.isSubmit;
	}
	public void setIsSubmit(Long isSubmit) {
		this.isSubmit = isSubmit;
	}

}
