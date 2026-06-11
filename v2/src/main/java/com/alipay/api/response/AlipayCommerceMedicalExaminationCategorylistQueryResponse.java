package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExaminationCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.examination.categorylist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class AlipayCommerceMedicalExaminationCategorylistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3225545451998336364L;

	/** 
	 * null
	 */
	@ApiListField("category_info_list")
	@ApiField("examination_category_info")
	private List<ExaminationCategoryInfo> categoryInfoList;

	public void setCategoryInfoList(List<ExaminationCategoryInfo> categoryInfoList) {
		this.categoryInfoList = categoryInfoList;
	}
	public List<ExaminationCategoryInfo> getCategoryInfoList( ) {
		return this.categoryInfoList;
	}

}
