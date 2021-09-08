package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MarketResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.market.multibundle.consult response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-03 14:40:13
 */
public class AlipayOpenMiniMarketMultibundleConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5247683796525139486L;

	/** 
	 * 端ID
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/** 
	 * 不同场景命中的营销信息列表
	 */
	@ApiListField("market_result_list")
	@ApiField("market_result")
	private List<MarketResult> marketResultList;

	/** 
	 * 商户小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public String getBundleId( ) {
		return this.bundleId;
	}

	public void setMarketResultList(List<MarketResult> marketResultList) {
		this.marketResultList = marketResultList;
	}
	public List<MarketResult> getMarketResultList( ) {
		return this.marketResultList;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
