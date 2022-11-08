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
 * @since 1.0, 2022-05-26 09:36:40
 */
public class DatadigitalFincloudFinsaasTagListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879855834294728667L;

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
