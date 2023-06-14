package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * POS机-员工管理批量删除操作员接口
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:42:42
 */
public class KoubeiMerchantOperatorBatchDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1248153311162971236L;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 要删除的操作员ID列表，类型是List<String>； 一次最多删除16个操作员；
删除规则： 
1. 传入的操作员ID对应的操作员必须都存在
2.传入的操作员ID对应的操作员必须是未激活状态，即未激活的操作员才能被删除
3.管理员和权限复核员不能删除
	 */
	@ApiListField("operators")
	@ApiField("string")
	private List<String> operators;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public List<String> getOperators() {
		return this.operators;
	}
	public void setOperators(List<String> operators) {
		this.operators = operators;
	}

}
