package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账户资金池绑定
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:10
 */
public class AlipayAccountCashpoolAccountBindModel extends AlipayObject {

	private static final long serialVersionUID = 2864411468168843228L;

	/**
	 * 资金池账户关联关系
	 */
	@ApiListField("cash_pool_account_mapping_vo_list")
	@ApiField("inst_cash_pool_account_mapping_v_o")
	private List<InstCashPoolAccountMappingVO> cashPoolAccountMappingVoList;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	public List<InstCashPoolAccountMappingVO> getCashPoolAccountMappingVoList() {
		return this.cashPoolAccountMappingVoList;
	}
	public void setCashPoolAccountMappingVoList(List<InstCashPoolAccountMappingVO> cashPoolAccountMappingVoList) {
		this.cashPoolAccountMappingVoList = cashPoolAccountMappingVoList;
	}

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
