package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营概况小程序效果列表
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:32:53
 */
public class AlipayCloudCloudpromoAnalysisoverviewApplistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3417359166692678259L;

	/**
	 * 经营分析、经营概况模块公用入参
	 */
	@ApiField("common_request")
	private OpenApiAnalysisCommonRequest commonRequest;

	/**
	 * 经营概况模块, 多端分析中支付宝端的小程序app_id
	 */
	@ApiField("hit_app_id")
	private String hitAppId;

	/**
	 * 服务商实际下，会有多个商户及其小程序app列表，可以选择传入商户ID进行过滤查看某一个商户及其小程序app列表
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public OpenApiAnalysisCommonRequest getCommonRequest() {
		return this.commonRequest;
	}
	public void setCommonRequest(OpenApiAnalysisCommonRequest commonRequest) {
		this.commonRequest = commonRequest;
	}

	public String getHitAppId() {
		return this.hitAppId;
	}
	public void setHitAppId(String hitAppId) {
		this.hitAppId = hitAppId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
