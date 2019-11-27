package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试结果查询，用于测试
 *
 * @author auto create
 * @since 1.0, 2019-05-17 20:00:40
 */
public class AntMerchantExpandTestResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4766576574856424267L;

	/**
	 * 用户名称
	 */
	@ApiListField("username")
	@ApiField("string")
	private List<String> username;

	public List<String> getUsername() {
		return this.username;
	}
	public void setUsername(List<String> username) {
		this.username = username;
	}

}
