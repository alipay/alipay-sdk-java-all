package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 骑缝章用印信息
 *
 * @author auto create
 * @since 1.0, 2024-08-14 15:48:28
 */
public class SignedCrossResult extends AlipayObject {

	private static final long serialVersionUID = 1245461964796519931L;

	/**
	 * 骑缝章签署区位置横坐标，px
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 骑缝章签署区位置纵坐标，px
	 */
	@ApiField("pos_y")
	private Long posY;

	/**
	 * 印模高度，毫米
	 */
	@ApiField("seal_height")
	private Long sealHeight;

	/**
	 * 印模id
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * 印模osskey
	 */
	@ApiField("seal_impression")
	private String sealImpression;

	/**
	 * 印模宽度，毫米
	 */
	@ApiField("seal_width")
	private Long sealWidth;

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

	public Long getSealHeight() {
		return this.sealHeight;
	}
	public void setSealHeight(Long sealHeight) {
		this.sealHeight = sealHeight;
	}

	public String getSealId() {
		return this.sealId;
	}
	public void setSealId(String sealId) {
		this.sealId = sealId;
	}

	public String getSealImpression() {
		return this.sealImpression;
	}
	public void setSealImpression(String sealImpression) {
		this.sealImpression = sealImpression;
	}

	public Long getSealWidth() {
		return this.sealWidth;
	}
	public void setSealWidth(Long sealWidth) {
		this.sealWidth = sealWidth;
	}

}
