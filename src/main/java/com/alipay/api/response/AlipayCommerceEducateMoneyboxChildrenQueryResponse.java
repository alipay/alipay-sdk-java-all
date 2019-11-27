package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MoneyboxChildren;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.moneybox.children.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceEducateMoneyboxChildrenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193755152335954888L;

	/** 
	 * 小钱袋注册用户孩子信息
	 */
	@ApiListField("result")
	@ApiField("moneybox_children")
	private List<MoneyboxChildren> result;

	public void setResult(List<MoneyboxChildren> result) {
		this.result = result;
	}
	public List<MoneyboxChildren> getResult( ) {
		return this.result;
	}

}
