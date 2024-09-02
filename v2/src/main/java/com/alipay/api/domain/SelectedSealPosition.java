package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 印章用印信息
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:28
 */
public class SelectedSealPosition extends AlipayObject {

	private static final long serialVersionUID = 8174239623251787818L;

	/**
	 * 用印对齐类型
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 正文章页码，页
	 */
	@ApiField("main_body_page")
	private Long mainBodyPage;

	/**
	 * 签署区横坐标，px
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标，px
	 */
	@ApiField("pos_y")
	private Long posY;

	/**
	 * 签章区域
	 */
	@ApiField("position_type")
	private Long positionType;

	/**
	 * 印模高度，毫米
	 */
	@ApiField("seal_height")
	private Long sealHeight;

	/**
	 * 印模宽度，毫米
	 */
	@ApiField("seal_width")
	private Long sealWidth;

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getMainBodyPage() {
		return this.mainBodyPage;
	}
	public void setMainBodyPage(Long mainBodyPage) {
		this.mainBodyPage = mainBodyPage;
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

	public Long getPositionType() {
		return this.positionType;
	}
	public void setPositionType(Long positionType) {
		this.positionType = positionType;
	}

	public Long getSealHeight() {
		return this.sealHeight;
	}
	public void setSealHeight(Long sealHeight) {
		this.sealHeight = sealHeight;
	}

	public Long getSealWidth() {
		return this.sealWidth;
	}
	public void setSealWidth(Long sealWidth) {
		this.sealWidth = sealWidth;
	}

}
