package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析品类交易详情
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:37:51
 */
public class AlipayCloudCloudpromoAnalysiscommodityCategorytradedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2694224125847249824L;

	/**
	 * 品类名称, 在品类交易详情列表数据中对品类名称进行过滤和筛选
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

}
