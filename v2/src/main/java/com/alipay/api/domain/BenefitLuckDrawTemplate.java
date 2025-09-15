package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益召回模板
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:55
 */
public class BenefitLuckDrawTemplate extends AlipayObject {

	private static final long serialVersionUID = 6291557897543361639L;

	/**
	 * 参与标识。有流水为true，反之为false。
	 */
	@ApiField("have_participated")
	private Boolean haveParticipated;

	/**
	 * 抽发奖流水，返回最近一笔发奖记录
	 */
	@ApiField("play_luck_draw_order_info")
	private BenefitOrderInfo playLuckDrawOrderInfo;

	/**
	 * 抽发奖玩法模板信息
	 */
	@ApiField("play_luck_draw_template_info")
	private BenefitPlayLuckDrawTemplateInfo playLuckDrawTemplateInfo;

	public Boolean getHaveParticipated() {
		return this.haveParticipated;
	}
	public void setHaveParticipated(Boolean haveParticipated) {
		this.haveParticipated = haveParticipated;
	}

	public BenefitOrderInfo getPlayLuckDrawOrderInfo() {
		return this.playLuckDrawOrderInfo;
	}
	public void setPlayLuckDrawOrderInfo(BenefitOrderInfo playLuckDrawOrderInfo) {
		this.playLuckDrawOrderInfo = playLuckDrawOrderInfo;
	}

	public BenefitPlayLuckDrawTemplateInfo getPlayLuckDrawTemplateInfo() {
		return this.playLuckDrawTemplateInfo;
	}
	public void setPlayLuckDrawTemplateInfo(BenefitPlayLuckDrawTemplateInfo playLuckDrawTemplateInfo) {
		this.playLuckDrawTemplateInfo = playLuckDrawTemplateInfo;
	}

}
