package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopScoreInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.data.score.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiShopDataScoreBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1825664135721921672L;

	/** 
	 * 店铺分数信息
	 */
	@ApiListField("score_info")
	@ApiField("shop_score_info")
	private List<ShopScoreInfo> scoreInfo;

	/** 
	 * 分数标题
	 */
	@ApiField("score_title")
	private String scoreTitle;

	public void setScoreInfo(List<ShopScoreInfo> scoreInfo) {
		this.scoreInfo = scoreInfo;
	}
	public List<ShopScoreInfo> getScoreInfo( ) {
		return this.scoreInfo;
	}

	public void setScoreTitle(String scoreTitle) {
		this.scoreTitle = scoreTitle;
	}
	public String getScoreTitle( ) {
		return this.scoreTitle;
	}

}
