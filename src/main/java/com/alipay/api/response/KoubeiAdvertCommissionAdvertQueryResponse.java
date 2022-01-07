package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertAdvResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advert.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionAdvertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6599181891275747436L;

	/** 
	 * 推广详情集合
	 */
	@ApiListField("data")
	@ApiField("kb_advert_adv_response")
	private List<KbAdvertAdvResponse> data;

	public void setData(List<KbAdvertAdvResponse> data) {
		this.data = data;
	}
	public List<KbAdvertAdvResponse> getData( ) {
		return this.data;
	}

}
