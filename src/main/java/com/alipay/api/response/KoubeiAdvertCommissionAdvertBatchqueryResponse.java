package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertAdvDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advert.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionAdvertBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1524247378112271799L;

	/** 
	 * 广告详情信息
	 */
	@ApiListField("data")
	@ApiField("kb_advert_adv_detail_response")
	private List<KbAdvertAdvDetailResponse> data;

	public void setData(List<KbAdvertAdvDetailResponse> data) {
		this.data = data;
	}
	public List<KbAdvertAdvDetailResponse> getData( ) {
		return this.data;
	}

}
