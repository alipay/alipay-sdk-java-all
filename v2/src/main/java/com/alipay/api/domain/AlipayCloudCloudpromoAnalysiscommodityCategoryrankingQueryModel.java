package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析品类不同指标排行
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:03
 */
public class AlipayCloudCloudpromoAnalysiscommodityCategoryrankingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6656214956274772193L;

	/**
	 * 品类ID，查询品类指标趋势数据的主要依据
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 品类名称, 在指标排行列表中查看其品类趋势数据时，如果有品类名称可以传入
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 目前仅支持品类、商品排行模块使用
	 */
	@ApiField("indicator_top")
	private String indicatorTop;

	/**
	 * 对于指标排行列表的某个品类需要查询其趋势数据，则需要设置为true,且搭配 spu_cat 和spu_cat_id使用
	 */
	@ApiField("trend")
	private Boolean trend;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

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

	public String getIndicatorTop() {
		return this.indicatorTop;
	}
	public void setIndicatorTop(String indicatorTop) {
		this.indicatorTop = indicatorTop;
	}

	public Boolean getTrend() {
		return this.trend;
	}
	public void setTrend(Boolean trend) {
		this.trend = trend;
	}

}
