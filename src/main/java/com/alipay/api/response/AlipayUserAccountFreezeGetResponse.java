package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccountFreeze;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.freeze.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserAccountFreezeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3759732893112559675L;

	/** 
	 * 冻结金额列表
	 */
	@ApiListField("freeze_items")
	@ApiField("account_freeze")
	private List<AccountFreeze> freezeItems;

	/** 
	 * 冻结总条数
	 */
	@ApiField("total_results")
	private String totalResults;

	public void setFreezeItems(List<AccountFreeze> freezeItems) {
		this.freezeItems = freezeItems;
	}
	public List<AccountFreeze> getFreezeItems( ) {
		return this.freezeItems;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getTotalResults( ) {
		return this.totalResults;
	}

}
