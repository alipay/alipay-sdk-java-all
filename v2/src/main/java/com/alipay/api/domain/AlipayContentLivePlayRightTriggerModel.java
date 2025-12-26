package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发直播间领取权益
 *
 * @author auto create
 * @since 1.0, 2025-12-04 13:44:44
 */
public class AlipayContentLivePlayRightTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4175864372839359194L;

	/**
	 * 支付宝直播间id
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 主播生活号id
	 */
	@ApiField("anchor_public_id")
	private String anchorPublicId;

	/**
	 * 直播奖品id，通过直播奖品系统配置获取
	 */
	@ApiField("award_id")
	private String awardId;

	/**
	 * 权益发放形式
	 */
	@ApiField("deliver_type")
	private String deliverType;

	/**
	 * 行业标识
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 外部业务id，由调用方传入
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 权益详情数据
	 */
	@ApiField("right_detail")
	private LivePlayRightDetail rightDetail;

	/**
	 * 权益类型
	 */
	@ApiField("right_type")
	private String rightType;

	/**
	 * 用户生活号id
	 */
	@ApiField("user_public_id")
	private String userPublicId;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getAnchorPublicId() {
		return this.anchorPublicId;
	}
	public void setAnchorPublicId(String anchorPublicId) {
		this.anchorPublicId = anchorPublicId;
	}

	public String getAwardId() {
		return this.awardId;
	}
	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}

	public String getDeliverType() {
		return this.deliverType;
	}
	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public LivePlayRightDetail getRightDetail() {
		return this.rightDetail;
	}
	public void setRightDetail(LivePlayRightDetail rightDetail) {
		this.rightDetail = rightDetail;
	}

	public String getRightType() {
		return this.rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
	}

	public String getUserPublicId() {
		return this.userPublicId;
	}
	public void setUserPublicId(String userPublicId) {
		this.userPublicId = userPublicId;
	}

}
