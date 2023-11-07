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
 * @since 1.0, 2023-09-11 19:09:42
 */
public class AlipayOpenPublicAdvertBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3793156922386575455L;

	/** 
	 * 广告位列表 。目前只有一个广告位。
	 */
	@ApiListField("advert_list")
	@ApiField("advert")
	private List<Advert> advertList;

	/** 
	 * 广告组数量
	 */
	@ApiField("count")
	private Long count;

	public void setAdvertList(List<Advert> advertList) {
		this.advertList = advertList;
	}
	public List<Advert> getAdvertList( ) {
		return this.advertList;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

}
