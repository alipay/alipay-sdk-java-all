package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间禁言和解除禁言
 *
 * @author auto create
 * @since 1.0, 2025-07-09 21:31:21
 */
public class AlipayContentLiveLiveroomCommentsbannedModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7475314922862163857L;

	/**
	 * 加密后的直播ID，在直播间操作禁言或者解除禁言的时候传此参数，非直播间操作禁言或者解除禁言可以不传此参数
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 主播生活号ID
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 加密后的被操作禁言或者解除禁言的对象的生活号ID，这个数据信息支付宝用户在直播间评论并同步到外部直播间时会一起同步过去，可以从评论中获取该信息
	 */
	@ApiField("operate_object_public_id")
	private String operateObjectPublicId;

	/**
	 * 操作类型，1表示禁言，2表示解除禁言
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public String getOperateObjectPublicId() {
		return this.operateObjectPublicId;
	}
	public void setOperateObjectPublicId(String operateObjectPublicId) {
		this.operateObjectPublicId = operateObjectPublicId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
