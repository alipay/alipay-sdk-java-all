package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MassifBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkruralindustry.massif.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:54:51
 */
public class MybankCreditLoanapplyBkruralindustryMassifQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5851981722783321538L;

	/** 
	 * 地块列表信息
	 */
	@ApiListField("massif_info_list")
	@ApiField("massif_base_info")
	private List<MassifBaseInfo> massifInfoList;

	public void setMassifInfoList(List<MassifBaseInfo> massifInfoList) {
		this.massifInfoList = massifInfoList;
	}
	public List<MassifBaseInfo> getMassifInfoList( ) {
		return this.massifInfoList;
	}

}
