package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户信息申请记录查询响应模型
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:28:14
 */
public class AuthFieldResponse extends AlipayObject {

	private static final long serialVersionUID = 3778678725277521867L;

	/**
	 * 用户信息申请记录列表
	 */
	@ApiListField("records")
	@ApiField("auth_field_d_t_o")
	private List<AuthFieldDTO> records;

	public List<AuthFieldDTO> getRecords() {
		return this.records;
	}
	public void setRecords(List<AuthFieldDTO> records) {
		this.records = records;
	}

}
