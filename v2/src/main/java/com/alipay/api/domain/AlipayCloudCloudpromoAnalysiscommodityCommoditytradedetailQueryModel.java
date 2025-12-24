package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析商品分析商品交易详情列表
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:38:19
 */
public class AlipayCloudCloudpromoAnalysiscommodityCommoditytradedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8613675413477815668L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 品类名称, 在商品详情列表数据需要对品类名称进行筛选过滤时 可以传入此参数
	 */
	@ApiField("spu_cat_name")
	private String spuCatName;

	/**
	 * 商品ID，在商品详情列表数据中对商品ID 进行过滤和筛选
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 商品名称, 在商品详情列表数据中，对商品名称进行筛选过滤。
	 */
	@ApiField("spu_name")
	private String spuName;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getSpuCatName() {
		return this.spuCatName;
	}
	public void setSpuCatName(String spuCatName) {
		this.spuCatName = spuCatName;
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

}
