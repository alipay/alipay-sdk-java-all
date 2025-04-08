package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BailDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.bail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:48
 */
public class AlipayDataBillBailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6629912713641639174L;

	/** 
	 * 保证金明细列表，最多返回5000条
	 */
	@ApiListField("detail_list")
	@ApiField("bail_detail_result")
	private List<BailDetailResult> detailList;

	public void setDetailList(List<BailDetailResult> detailList) {
		this.detailList = detailList;
	}
	public List<BailDetailResult> getDetailList( ) {
		return this.detailList;
	}

}
