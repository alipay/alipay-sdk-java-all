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
 * @since 1.0, 2024-12-06 17:08:42
 */
public class AlipayCommerceMedicalLargermodelContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7191769897511481116L;

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
