package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SceneCategoryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.scenecategory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 09:10:42
 */
public class AlipayMerchantSolcreditserviceprodScenecategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2636576195242659814L;

	/** 
	 * 场景类目信息列表
	 */
	@ApiListField("scene_category_list")
	@ApiField("scene_category_d_t_o")
	private List<SceneCategoryDTO> sceneCategoryList;

	public void setSceneCategoryList(List<SceneCategoryDTO> sceneCategoryList) {
		this.sceneCategoryList = sceneCategoryList;
	}
	public List<SceneCategoryDTO> getSceneCategoryList( ) {
		return this.sceneCategoryList;
	}

}
