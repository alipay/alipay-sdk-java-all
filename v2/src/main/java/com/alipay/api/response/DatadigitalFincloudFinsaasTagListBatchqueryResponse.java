package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OneCategoryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.tag.list.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 21:37:01
 */
public class DatadigitalFincloudFinsaasTagListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7795723418345869874L;

	/** 
	 * 标签类目列表+不唯一
	 */
	@ApiListField("category_list")
	@ApiField("one_category_d_t_o")
	private List<OneCategoryDTO> categoryList;

	public void setCategoryList(List<OneCategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}
	public List<OneCategoryDTO> getCategoryList( ) {
		return this.categoryList;
	}

}
