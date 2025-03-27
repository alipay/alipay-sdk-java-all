package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PageContentCardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-27 17:07:25
 */
public class AlipayCommerceMedicalLargermodelContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123663128689545232L;

	/** 
	 * 卡片数据列表
	 */
	@ApiListField("list")
	@ApiField("page_content_card_detail")
	private List<PageContentCardDetail> list;

	public void setList(List<PageContentCardDetail> list) {
		this.list = list;
	}
	public List<PageContentCardDetail> getList( ) {
		return this.list;
	}

}
