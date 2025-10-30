package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童手表营销活动发奖详情
 *
 * @author auto create
 * @since 1.0, 2025-04-09 21:32:53
 */
public class WatchPromoPrizeDetail extends AlipayObject {

	private static final long serialVersionUID = 2189515278716614226L;

	/**
	 * 不同奖品类型返回不能的结果数据，例如10卡路里，兑换10g蚂蚁森林能量
	 */
	@ApiField("biz_data")
	private String bizData;

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

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

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
