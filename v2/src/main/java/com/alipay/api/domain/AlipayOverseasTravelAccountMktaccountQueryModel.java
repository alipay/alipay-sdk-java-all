package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询营销账号列表
 *
 * @author auto create
 * @since 1.0, 2023-12-04 14:40:40
 */
public class AlipayOverseasTravelAccountMktaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6515733593298969878L;

	/**
	 * cn账号列表
	 */
	@ApiListField("cn_accounts")
	@ApiField("cn_account_d_t_o")
	private List<CnAccountDTO> cnAccounts;

	public List<CnAccountDTO> getCnAccounts() {
		return this.cnAccounts;
	}
	public void setCnAccounts(List<CnAccountDTO> cnAccounts) {
		this.cnAccounts = cnAccounts;
	}

}
