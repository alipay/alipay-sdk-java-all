package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 骑缝章信息
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:00:38
 */
public class CaSystemCrossPage extends AlipayObject {

	private static final long serialVersionUID = 2631462525251843451L;

	/**
	 * 默认骑缝章页数
	 */
	@ApiField("default_cross_page")
	private Long defaultCrossPage;

	/**
	 * 是否采取系统默认骑缝章用印规则
	 */
	@ApiField("default_cross_page_rule")
	private Boolean defaultCrossPageRule;

	/**
	 * 签署结束页码
	 */
	@ApiField("pos_page_end")
	private Long posPageEnd;

	/**
	 * 签署开始页码
	 */
	@ApiField("pos_page_start")
	private Long posPageStart;

	/**
	 * 签署区位置横坐标，单位点（point）
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标，单位点（point）
	 */
	@ApiField("pos_y")
	private Long posY;

	/**
	 * 用印次数
	 */
	@ApiField("seal_times")
	private Long sealTimes;

	public Long getDefaultCrossPage() {
		return this.defaultCrossPage;
	}
	public void setDefaultCrossPage(Long defaultCrossPage) {
		this.defaultCrossPage = defaultCrossPage;
	}

	public Boolean getDefaultCrossPageRule() {
		return this.defaultCrossPageRule;
	}
	public void setDefaultCrossPageRule(Boolean defaultCrossPageRule) {
		this.defaultCrossPageRule = defaultCrossPageRule;
	}

	public Long getPosPageEnd() {
		return this.posPageEnd;
	}
	public void setPosPageEnd(Long posPageEnd) {
		this.posPageEnd = posPageEnd;
	}

	public Long getPosPageStart() {
		return this.posPageStart;
	}
	public void setPosPageStart(Long posPageStart) {
		this.posPageStart = posPageStart;
	}

	public Long getPosX() {
		return this.posX;
	}
	public void setPosX(Long posX) {
		this.posX = posX;
	}

	public Long getPosY() {
		return this.posY;
	}
	public void setPosY(Long posY) {
		this.posY = posY;
	}

	public Long getSealTimes() {
		return this.sealTimes;
	}
	public void setSealTimes(Long sealTimes) {
		this.sealTimes = sealTimes;
	}

}
