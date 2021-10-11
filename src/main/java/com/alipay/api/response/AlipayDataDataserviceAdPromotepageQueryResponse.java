package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotePage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.promotepage.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:47:31
 */
public class AlipayDataDataserviceAdPromotepageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1113636342152447841L;

	/** 
	 * 留资页信息列表
	 */
	@ApiListField("list")
	@ApiField("promote_page")
	private List<PromotePage> list;

	public void setList(List<PromotePage> list) {
		this.list = list;
	}
	public List<PromotePage> getList( ) {
		return this.list;
	}

}
