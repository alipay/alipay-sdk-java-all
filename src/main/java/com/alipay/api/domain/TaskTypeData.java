package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻go数据回传商户传入任务类型的数据
 *
 * @author auto create
 * @since 1.0, 2020-09-01 23:53:18
 */
public class TaskTypeData extends AlipayObject {

	private static final long serialVersionUID = 1793673736643636751L;

	/**
	 * 商户数据回传的任务名称，供C端展示。当累计的数据类型为任务类型时，此为必传字段
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
