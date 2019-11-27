package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Advert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicAdvertBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5133479675498313367L;

	/** 
	 * 广告位list ,目前只有一个广告位
	 */
	@ApiListField("advert_list")
	@ApiField("advert")
	private List<Advert> advertList;

	public void setAdvertList(List<Advert> advertList) {
		this.advertList = advertList;
	}
	public List<Advert> getAdvertList( ) {
		return this.advertList;
	}

}
