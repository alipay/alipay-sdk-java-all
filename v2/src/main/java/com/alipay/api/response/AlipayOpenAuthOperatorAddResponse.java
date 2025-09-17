package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperatorAccountVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.operator.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:57:41
 */
public class AlipayOpenAuthOperatorAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4374436899724263392L;

	/** 
	 * 关联账号列表
	 */
	@ApiListField("accounts")
	@ApiField("operator_account_v_o")
	private List<OperatorAccountVO> accounts;

	/** 
	 * 创建的蚂蚁操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	public void setAccounts(List<OperatorAccountVO> accounts) {
		this.accounts = accounts;
	}
	public List<OperatorAccountVO> getAccounts( ) {
		return this.accounts;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId( ) {
		return this.operatorId;
	}

}
