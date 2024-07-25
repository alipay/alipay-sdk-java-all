package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店得分结果信息
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:39:03
 */
public class ShopScoreResultInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6856478264224297167L;

	/**
	 * 品类卖力值，客户请求入参获取分数类型（score_type），如获取该卖力值会返回，对应0-100分的6位小数
	 */
	@ApiField("cat_sale_score")
	private String catSaleScore;

	/**
	 * 品类笔单价指数，客户请求入参获取分数类型（score_type），如获取该品类笔单价指数会返回
	 */
	@ApiField("cat_trd_amt_per_trd_score")
	private String catTrdAmtPerTrdScore;

	/**
	 * 居住地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分的6位小数
	 */
	@ApiField("home_user_score")
	private String homeUserScore;

	/**
	 * 全店卖力值，客户请求入参获取分数类型（score_type），如获取该卖力值会返回，对应0-100分的6位小数
	 */
	@ApiField("poi_sale_score")
	private String poiSaleScore;

	/**
	 * 常驻地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分的6位小数
	 */
	@ApiField("resident_user_score")
	private String residentUserScore;

	/**
	 * 笔单价指数，客户请求入参获取分数类型（score_type），如获取该笔单价指数会返回
	 */
	@ApiField("trd_amt_per_trd_score")
	private String trdAmtPerTrdScore;

	/**
	 * 工作地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分的6位小数
	 */
	@ApiField("work_user_score")
	private String workUserScore;

	public String getCatSaleScore() {
		return this.catSaleScore;
	}
	public void setCatSaleScore(String catSaleScore) {
		this.catSaleScore = catSaleScore;
	}

	public String getCatTrdAmtPerTrdScore() {
		return this.catTrdAmtPerTrdScore;
	}
	public void setCatTrdAmtPerTrdScore(String catTrdAmtPerTrdScore) {
		this.catTrdAmtPerTrdScore = catTrdAmtPerTrdScore;
	}

	public String getHomeUserScore() {
		return this.homeUserScore;
	}
	public void setHomeUserScore(String homeUserScore) {
		this.homeUserScore = homeUserScore;
	}

	public String getPoiSaleScore() {
		return this.poiSaleScore;
	}
	public void setPoiSaleScore(String poiSaleScore) {
		this.poiSaleScore = poiSaleScore;
	}

	public String getResidentUserScore() {
		return this.residentUserScore;
	}
	public void setResidentUserScore(String residentUserScore) {
		this.residentUserScore = residentUserScore;
	}

	public String getTrdAmtPerTrdScore() {
		return this.trdAmtPerTrdScore;
	}
	public void setTrdAmtPerTrdScore(String trdAmtPerTrdScore) {
		this.trdAmtPerTrdScore = trdAmtPerTrdScore;
	}

	public String getWorkUserScore() {
		return this.workUserScore;
	}
	public void setWorkUserScore(String workUserScore) {
		this.workUserScore = workUserScore;
	}

}
