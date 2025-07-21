package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-02-09 13:32:38
 */
public class OrderExtendParams extends AlipayObject {

	private static final long serialVersionUID = 3498261111359392711L;

	/**
	 * 收银台结果页面回跳地址
	 */
	@ApiField("cashier_result_render_url")
	private String cashierResultRenderUrl;

	/**
	 * 外部场景端业务订单
	 */
	@ApiField("out_scene_biz_no")
	private String outSceneBizNo;

	/**
	 * 平台方案合约号
	 */
	@ApiField("platform_scheme_ar_no")
	private String platformSchemeArNo;

	/**
	 * 卖家方案合约号
	 */
	@ApiField("seller_scheme_ar_no")
	private String sellerSchemeArNo;

	public String getCashierResultRenderUrl() {
		return this.cashierResultRenderUrl;
	}
	public void setCashierResultRenderUrl(String cashierResultRenderUrl) {
		this.cashierResultRenderUrl = cashierResultRenderUrl;
	}

	public String getOutSceneBizNo() {
		return this.outSceneBizNo;
	}
	public void setOutSceneBizNo(String outSceneBizNo) {
		this.outSceneBizNo = outSceneBizNo;
	}

	public String getPlatformSchemeArNo() {
		return this.platformSchemeArNo;
	}
	public void setPlatformSchemeArNo(String platformSchemeArNo) {
		this.platformSchemeArNo = platformSchemeArNo;
	}

	public String getSellerSchemeArNo() {
		return this.sellerSchemeArNo;
	}
	public void setSellerSchemeArNo(String sellerSchemeArNo) {
		this.sellerSchemeArNo = sellerSchemeArNo;
	}

}
