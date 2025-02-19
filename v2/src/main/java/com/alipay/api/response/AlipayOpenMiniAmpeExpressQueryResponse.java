package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeExpressQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.express.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 17:42:02
 */
public class AlipayOpenMiniAmpeExpressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4779247612389996352L;

	/** 
	 * 包裹状态分类后的统计结果
	 */
	@ApiListField("data")
	@ApiField("ampe_express_query_response")
	private List<AmpeExpressQueryResponse> data;

	/** 
	 * logo
	 */
	@ApiField("logo")
	private String logo;

	/** 
	 * 跳转链接，通过AMPE打开
	 */
	@ApiField("merchant_detail_url")
	private String merchantDetailUrl;

	/** 
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setData(List<AmpeExpressQueryResponse> data) {
		this.data = data;
	}
	public List<AmpeExpressQueryResponse> getData( ) {
		return this.data;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo( ) {
		return this.logo;
	}

	public void setMerchantDetailUrl(String merchantDetailUrl) {
		this.merchantDetailUrl = merchantDetailUrl;
	}
	public String getMerchantDetailUrl( ) {
		return this.merchantDetailUrl;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
