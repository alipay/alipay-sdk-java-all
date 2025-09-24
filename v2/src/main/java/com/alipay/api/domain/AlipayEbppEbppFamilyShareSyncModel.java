package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭共享权益流程同步
 *
 * @author auto create
 * @since 1.0, 2025-04-24 13:42:30
 */
public class AlipayEbppEbppFamilyShareSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6367469772111294962L;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 共享权益的失效时间
	 */
	@ApiField("share_expired")
	private Date shareExpired;

	/**
	 * 被分享人支付share_open_id
	 */
	@ApiField("share_open_id")
	private String shareOpenId;

	/**
	 * 共享处理过程的失效时间
	 */
	@ApiField("share_sku_expired")
	private Date shareSkuExpired;

	/**
	 * 被分享人账号, 如被分享人账号是手机号则为11位手机号
	 */
	@ApiField("share_target")
	private String shareTarget;

	/**
	 * 被共享权益的失效时间
	 */
	@ApiField("share_target_expire")
	private Date shareTargetExpire;

	/**
	 * 分享主账号类型
	 */
	@ApiField("share_target_type")
	private String shareTargetType;

	/**
	 * 被分享人支付宝UID
	 */
	@ApiField("share_uid")
	private String shareUid;

	/**
	 * 共享权益的商品SKUID
	 */
	@ApiField("sku")
	private String sku;

	/**
	 * 分享状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 主购买人支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getShareExpired() {
		return this.shareExpired;
	}
	public void setShareExpired(Date shareExpired) {
		this.shareExpired = shareExpired;
	}

	public String getShareOpenId() {
		return this.shareOpenId;
	}
	public void setShareOpenId(String shareOpenId) {
		this.shareOpenId = shareOpenId;
	}

	public Date getShareSkuExpired() {
		return this.shareSkuExpired;
	}
	public void setShareSkuExpired(Date shareSkuExpired) {
		this.shareSkuExpired = shareSkuExpired;
	}

	public String getShareTarget() {
		return this.shareTarget;
	}
	public void setShareTarget(String shareTarget) {
		this.shareTarget = shareTarget;
	}

	public Date getShareTargetExpire() {
		return this.shareTargetExpire;
	}
	public void setShareTargetExpire(Date shareTargetExpire) {
		this.shareTargetExpire = shareTargetExpire;
	}

	public String getShareTargetType() {
		return this.shareTargetType;
	}
	public void setShareTargetType(String shareTargetType) {
		this.shareTargetType = shareTargetType;
	}

	public String getShareUid() {
		return this.shareUid;
	}
	public void setShareUid(String shareUid) {
		this.shareUid = shareUid;
	}

	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
