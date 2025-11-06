package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析商品的不同指标排行
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:34:28
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommodityrankingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7546997763579753724L;

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
	 * 要查看的指标类型，访问人数Top、销量Top、支付金额Top、退款金额Top
访问人数:VISITOR_CNT
销量:SALE_CNT
支付金额:PAYMENT_AMT
退款金额:REFUND_CNT
	 */
	@ApiField("indicator_top")
	private String indicatorTop;

	/**
	 * 商品ID，查询品类指标趋势数据的主要依据
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品名称, 在指标排行列表中查看其商品趋势数据时，如果有商品名称可以传入
	 */
	@ApiField("spu_name")
	private String spuName;

	/**
	 * 对于指标排行列表的某个品类需要查询其趋势数据，则需要设置为true,且搭配 spu_cat 、spu_cat_id、spu_name、spu_id 使用
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

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuName() {
		return this.spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}

	public Boolean getTrend() {
		return this.trend;
	}
	public void setTrend(Boolean trend) {
		this.trend = trend;
	}

}
