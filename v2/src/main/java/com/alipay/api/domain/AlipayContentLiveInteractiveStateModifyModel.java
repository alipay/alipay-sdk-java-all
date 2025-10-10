package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间互动状态更改
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:58:41
 */
public class AlipayContentLiveInteractiveStateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8414243768296511335L;

	/**
	 * 脱敏后的支付宝直播间ID
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 互动玩法的状态：0初始化，1开启，2关闭
	 */
	@ApiField("interactive_status")
	private Long interactiveStatus;

	/**
	 * 互动类型，用于区分当前是哪个互动玩法
	 */
	@ApiField("interactive_type")
	private String interactiveType;

	/**
	 * 通用字段，用于做互动类型对应的跳转链接
例如类型为MEDICAL_ASK_DOCTOR时，那这个值代表的就是问医生的跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 通用字段，用于做互动类型对应的数量展示（单位为个数）
例如类型为MEDICAL_POCKET时，那这个值代表的就是医疗小蓝车的商品数量
	 */
	@ApiField("show_num")
	private Long showNum;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public Long getInteractiveStatus() {
		return this.interactiveStatus;
	}
	public void setInteractiveStatus(Long interactiveStatus) {
		this.interactiveStatus = interactiveStatus;
	}

	public String getInteractiveType() {
		return this.interactiveType;
	}
	public void setInteractiveType(String interactiveType) {
		this.interactiveType = interactiveType;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public Long getShowNum() {
		return this.showNum;
	}
	public void setShowNum(Long showNum) {
		this.showNum = showNum;
	}

}
