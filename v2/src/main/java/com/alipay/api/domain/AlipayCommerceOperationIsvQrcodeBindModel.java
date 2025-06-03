package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微信公众号绑定跳转url接口
 *
 * @author auto create
 * @since 1.0, 2023-04-18 20:22:25
 */
public class AlipayCommerceOperationIsvQrcodeBindModel extends AlipayObject {

	private static final long serialVersionUID = 2436754557549763569L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务扩展参数
	 */
	@ApiField("business_params")
	private QrCodeBusinessParam businessParams;

	/**
	 * 小程序类型
	 */
	@ApiField("mini_type")
	private String miniType;

	/**
	 * 目标跳转页面
	 */
	@ApiField("page")
	private String page;

	/**
	 * 微信公众号二维码码
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public QrCodeBusinessParam getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(QrCodeBusinessParam businessParams) {
		this.businessParams = businessParams;
	}

	public String getMiniType() {
		return this.miniType;
	}
	public void setMiniType(String miniType) {
		this.miniType = miniType;
	}

	public String getPage() {
		return this.page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
