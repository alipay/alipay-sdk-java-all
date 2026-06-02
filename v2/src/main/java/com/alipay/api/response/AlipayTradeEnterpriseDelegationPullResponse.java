package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriseDelegationAuth;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.enterprise.delegation.pull response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 14:02:50
 */
public class AlipayTradeEnterpriseDelegationPullResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899223133927749431L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("enterprise_delegation_auth")
	private List<EnterpriseDelegationAuth> dataList;

	/** 
	 * 授权列表总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setDataList(List<EnterpriseDelegationAuth> dataList) {
		this.dataList = dataList;
	}
	public List<EnterpriseDelegationAuth> getDataList( ) {
		return this.dataList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
