package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放疲劳度配置
 *
 * @author auto create
 * @since 1.0, 2023-02-27 14:03:21
 */
public class DeliveryFatigue extends AlipayObject {

	private static final long serialVersionUID = 8655391983831821463L;

	/**
	 * 用户动作，点击/曝光
	 */
	@ApiField("action")
	private String action;

	/**
	 * 展位内容疲劳度
	 */
	@ApiField("content_fatigue")
	private DeliveryFatigueContent contentFatigue;

	/**
	 * 展位创意疲劳度
	 */
	@ApiField("creativity_fatigue")
	private CreativityFatigue creativityFatigue;

	/**
	 * 展位代码
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 展位内容埋点信息
	 */
	@ApiField("scm")
	private String scm;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public DeliveryFatigueContent getContentFatigue() {
		return this.contentFatigue;
	}
	public void setContentFatigue(DeliveryFatigueContent contentFatigue) {
		this.contentFatigue = contentFatigue;
	}

	public CreativityFatigue getCreativityFatigue() {
		return this.creativityFatigue;
	}
	public void setCreativityFatigue(CreativityFatigue creativityFatigue) {
		this.creativityFatigue = creativityFatigue;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getScm() {
		return this.scm;
	}
	public void setScm(String scm) {
		this.scm = scm;
	}

}
