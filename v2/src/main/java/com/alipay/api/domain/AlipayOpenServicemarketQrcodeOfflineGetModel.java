package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成线下推广二维码
 *
 * @author auto create
 * @since 1.0, 2023-12-15 14:26:19
 */
public class AlipayOpenServicemarketQrcodeOfflineGetModel extends AlipayObject {

	private static final long serialVersionUID = 2814115781345276285L;

	/**
	 * 小程序名称，该字段非必传字段，用于表示此次参与交易的小程序具体是什么
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 商家回调地址，该字段是商家扫码后，跳转的地址url，比如商品详情页的url
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 服务id，该字段由调用方传入，是生成线下推广二维码的必要参数，该值是支付宝生成，可以在支付宝p站我的服务中查询对应的服务id
	 */
	@ApiField("merchandise_id")
	private String merchandiseId;

	/**
	 * 用于扩展信息，该值可以传入服务商想要扩展的信息，将会与其它参数一起存入码值信息中。
	 */
	@ApiField("ticket")
	private String ticket;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getCallback() {
		return this.callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getMerchandiseId() {
		return this.merchandiseId;
	}
	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	public String getTicket() {
		return this.ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

}
