package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店得分结果信息
 *
 * @author auto create
 * @since 1.0, 2023-07-14 17:21:58
 */
public class ShopScoreResultInfo extends AlipayObject {

	private static final long serialVersionUID = 1236775476559957839L;

	/**
	 * 品类卖力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("cat_sale_score")
	private Long catSaleScore;

	/**
	 * 居住地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("home_user_score")
	private Long homeUserScore;

	/**
	 * 全店卖力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("poi_sale_score")
	private Long poiSaleScore;

	/**
	 * 常驻地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("resident_user_score")
	private Long residentUserScore;

	/**
	 * 工作地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("work_user_score")
	private Long workUserScore;

	public Long getCatSaleScore() {
		return this.catSaleScore;
	}
	public void setCatSaleScore(Long catSaleScore) {
		this.catSaleScore = catSaleScore;
	}

	public Long getHomeUserScore() {
		return this.homeUserScore;
	}
	public void setHomeUserScore(Long homeUserScore) {
		this.homeUserScore = homeUserScore;
	}

	public Long getPoiSaleScore() {
		return this.poiSaleScore;
	}
	public void setPoiSaleScore(Long poiSaleScore) {
		this.poiSaleScore = poiSaleScore;
	}

	public Long getResidentUserScore() {
		return this.residentUserScore;
	}
	public void setResidentUserScore(Long residentUserScore) {
		this.residentUserScore = residentUserScore;
	}

	public Long getWorkUserScore() {
		return this.workUserScore;
	}
	public void setWorkUserScore(Long workUserScore) {
		this.workUserScore = workUserScore;
	}

}
