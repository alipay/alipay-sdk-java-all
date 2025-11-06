package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 礼物状态同步
 *
 * @author auto create
 * @since 1.0, 2025-04-10 11:41:58
 */
public class AlipayTradeGiftStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2242313412479159381L;

	/**
	 * 状态用于驱动礼物卡片展示的变化(accepted-已收下驱动高亮变灰、overdueNotReceived已过期驱动高亮变灰且提示过期未领取)
	 */
	@ApiField("gift_status")
	private String giftStatus;

	/**
	 * 用于标记支付宝送礼用户在应用下的唯一标识
	 */
	@ApiField("giver_open_id")
	private String giverOpenId;

	/**
	 * 用于标记送礼用户在淘宝应用下的唯一标识
	 */
	@ApiField("giver_tb_open_id")
	private String giverTbOpenId;

	/**
	 * 送礼人淘宝用户id
	 */
	@ApiField("giver_tb_user_id")
	private String giverTbUserId;

	/**
	 * 送礼用户支付宝的userId。
	 */
	@ApiField("giver_user_id")
	private String giverUserId;

	/**
	 * 会话id Base64编码
	 */
	@ApiField("present_session_id")
	private String presentSessionId;

	/**
	 * 用于标记支付宝收礼用户在应用下的唯一标识
	 */
	@ApiField("recipient_open_id")
	private String recipientOpenId;

	/**
	 * 收礼用户支付宝的userId。
	 */
	@ApiField("recipient_user_id")
	private String recipientUserId;

	/**
	 * 关联订单组id,一送多收的场景
	 */
	@ApiField("tb_og_id")
	private String tbOgId;

	/**
	 * 淘宝订单id
	 */
	@ApiField("tb_order_id")
	private String tbOrderId;

	/**
	 * 淘宝埋点参数
	 */
	@ApiField("ut_sk")
	private String utSk;

	/**
	 * 淘宝前端SDK版本生成消息卡片的时候需要带给会话
	 */
	@ApiField("wx_js_min_version")
	private String wxJsMinVersion;

	public String getGiftStatus() {
		return this.giftStatus;
	}
	public void setGiftStatus(String giftStatus) {
		this.giftStatus = giftStatus;
	}

	public String getGiverOpenId() {
		return this.giverOpenId;
	}
	public void setGiverOpenId(String giverOpenId) {
		this.giverOpenId = giverOpenId;
	}

	public String getGiverTbOpenId() {
		return this.giverTbOpenId;
	}
	public void setGiverTbOpenId(String giverTbOpenId) {
		this.giverTbOpenId = giverTbOpenId;
	}

	public String getGiverTbUserId() {
		return this.giverTbUserId;
	}
	public void setGiverTbUserId(String giverTbUserId) {
		this.giverTbUserId = giverTbUserId;
	}

	public String getGiverUserId() {
		return this.giverUserId;
	}
	public void setGiverUserId(String giverUserId) {
		this.giverUserId = giverUserId;
	}

	public String getPresentSessionId() {
		return this.presentSessionId;
	}
	public void setPresentSessionId(String presentSessionId) {
		this.presentSessionId = presentSessionId;
	}

	public String getRecipientOpenId() {
		return this.recipientOpenId;
	}
	public void setRecipientOpenId(String recipientOpenId) {
		this.recipientOpenId = recipientOpenId;
	}

	public String getRecipientUserId() {
		return this.recipientUserId;
	}
	public void setRecipientUserId(String recipientUserId) {
		this.recipientUserId = recipientUserId;
	}

	public String getTbOgId() {
		return this.tbOgId;
	}
	public void setTbOgId(String tbOgId) {
		this.tbOgId = tbOgId;
	}

	public String getTbOrderId() {
		return this.tbOrderId;
	}
	public void setTbOrderId(String tbOrderId) {
		this.tbOrderId = tbOrderId;
	}

	public String getUtSk() {
		return this.utSk;
	}
	public void setUtSk(String utSk) {
		this.utSk = utSk;
	}

	public String getWxJsMinVersion() {
		return this.wxJsMinVersion;
	}
	public void setWxJsMinVersion(String wxJsMinVersion) {
		this.wxJsMinVersion = wxJsMinVersion;
	}

}
