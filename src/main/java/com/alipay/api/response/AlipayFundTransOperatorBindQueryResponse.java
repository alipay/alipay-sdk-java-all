package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.operator.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-30 20:00:54
 */
public class AlipayFundTransOperatorBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5754562323346334358L;

	/** 
	 * true:已绑定
false:未绑定
	 */
	@ApiField("bind")
	private Boolean bind;

	/** 
	 * 操作员姓名
	 */
	@ApiField("operator_name")
	private String operatorName;

	/** 
	 * 操作员角色
	 */
	@ApiListField("operator_role")
	@ApiField("string")
	private List<String> operatorRole;

	public void setBind(Boolean bind) {
		this.bind = bind;
	}
	public Boolean getBind( ) {
		return this.bind;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorName( ) {
		return this.operatorName;
	}

	public void setOperatorRole(List<String> operatorRole) {
		this.operatorRole = operatorRole;
	}
	public List<String> getOperatorRole( ) {
		return this.operatorRole;
	}

}
