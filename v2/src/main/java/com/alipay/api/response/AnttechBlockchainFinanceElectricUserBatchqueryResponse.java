package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnergyAggrElectricUserInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.electric.user.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-21 09:57:22
 */
public class AnttechBlockchainFinanceElectricUserBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1535586461155552723L;

	/** 
	 * 返回的是用电用户信息列表
	 */
	@ApiListField("electric_user_list")
	@ApiField("energy_aggr_electric_user_info_d_t_o")
	private List<EnergyAggrElectricUserInfoDTO> electricUserList;

	/** 
	 * 数据总条数，分页查询需要用到
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setElectricUserList(List<EnergyAggrElectricUserInfoDTO> electricUserList) {
		this.electricUserList = electricUserList;
	}
	public List<EnergyAggrElectricUserInfoDTO> getElectricUserList( ) {
		return this.electricUserList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
