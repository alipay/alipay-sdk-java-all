package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaybillMatchInfoObj;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.token.waybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-27 17:22:25
 */
public class AlipayCommerceLogisticsTokenWaybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6134239672461916986L;

	/** 
	 * 寄件信息
	 */
	@ApiListField("match_waybill_list")
	@ApiField("waybill_match_info_obj")
	private List<WaybillMatchInfoObj> matchWaybillList;

	public void setMatchWaybillList(List<WaybillMatchInfoObj> matchWaybillList) {
		this.matchWaybillList = matchWaybillList;
	}
	public List<WaybillMatchInfoObj> getMatchWaybillList( ) {
		return this.matchWaybillList;
	}

}
