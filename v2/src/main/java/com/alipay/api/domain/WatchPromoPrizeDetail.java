package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童手表营销活动发奖详情
 *
 * @author auto create
 * @since 1.0, 2024-12-20 16:51:10
 */
public class WatchPromoPrizeDetail extends AlipayObject {

	private static final long serialVersionUID = 6377957554491759872L;

	/**
	 * 发奖单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 跳转支付宝链接，领奖链接
	 */
	@ApiField("jump_alipay_url")
	private String jumpAlipayUrl;

	/**
	 * CLAIMED-已领取，UNCLAIMED-待领取
	 */
	@ApiField("prize_state")
	private String prizeState;

	/**
	 * 奖品类型，RED_PACKET-红包，SKIN-皮肤
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 非必填(红包)/必填(皮肤)，皮肤id
	 */
	@ApiField("skin_id")
	private String skinId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getJumpAlipayUrl() {
		return this.jumpAlipayUrl;
	}
	public void setJumpAlipayUrl(String jumpAlipayUrl) {
		this.jumpAlipayUrl = jumpAlipayUrl;
	}

	public String getPrizeState() {
		return this.prizeState;
	}
	public void setPrizeState(String prizeState) {
		this.prizeState = prizeState;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getSkinId() {
		return this.skinId;
	}
	public void setSkinId(String skinId) {
		this.skinId = skinId;
	}

}
