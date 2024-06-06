package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LmCategoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:40
 */
public class AlipayCloudCloudpromoMallCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7596588684683568182L;

	/** 
	 * 类目信息
	 */
	@ApiListField("categories")
	@ApiField("lm_category_v_o")
	private List<LmCategoryVO> categories;

	public void setCategories(List<LmCategoryVO> categories) {
		this.categories = categories;
	}
	public List<LmCategoryVO> getCategories( ) {
		return this.categories;
	}

}
