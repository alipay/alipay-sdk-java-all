package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息批量查询详细
 *
 * @author auto create
 * @since 1.0, 2023-07-07 14:07:36
 */
public class ShopDataDetail extends AlipayObject {

	private static final long serialVersionUID = 4834332527472827225L;

	/**
	 * 高德poi或蚂蚁poi等，有则传，用于精准匹配，可扩展其他poi
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 门店得分结果
	 */
	@ApiField("score_result")
	private ScoreResultInfo scoreResult;

	/**
	 * 门店地址
	 */
	@ApiField("shop_address")
	private String shopAddress;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public ScoreResultInfo getScoreResult() {
		return this.scoreResult;
	}
	public void setScoreResult(ScoreResultInfo scoreResult) {
		this.scoreResult = scoreResult;
	}

	public String getShopAddress() {
		return this.shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
