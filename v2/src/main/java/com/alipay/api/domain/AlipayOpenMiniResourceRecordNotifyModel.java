package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给淘联盟备案信息接口01
 *
 * @author auto create
 * @since 1.0, 2020-09-14 10:21:18
 */
public class AlipayOpenMiniResourceRecordNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2462794186376757343L;

	/**
	 * 媒体唤起时传入的支付宝id
	 */
	@ApiField("author_id")
	private String authorId;

	/**
	 * 支付宝appid，代表一个小程序的唯一标识
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 媒体唤起时提供的额外参数值列表，这里可能有多个值，打平以后拼入。即url_decode(authcbparams)
	 */
	@ApiField("params")
	private String params;

	/**
	 * 回调的siteid 淘宝账号唯一
	 */
	@ApiField("site_id")
	private String siteId;

	/**
	 * 媒体来源，标识调用方
	 */
	@ApiField("source")
	private String source;

	/**
	 * 淘宝id
	 */
	@ApiField("taobao_id")
	private String taobaoId;

	/**
	 * 淘宝昵称
	 */
	@ApiField("taobao_nick")
	private String taobaoNick;

	public String getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getSiteId() {
		return this.siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTaobaoId() {
		return this.taobaoId;
	}
	public void setTaobaoId(String taobaoId) {
		this.taobaoId = taobaoId;
	}

	public String getTaobaoNick() {
		return this.taobaoNick;
	}
	public void setTaobaoNick(String taobaoNick) {
		this.taobaoNick = taobaoNick;
	}

}
