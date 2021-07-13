package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用印申请信息，包括印章id，用印位置，用印对齐方式，印章旋转角度等
 *
 * @author auto create
 * @since 1.0, 2019-12-26 14:23:27
 */
public class SealRequestInfo extends AlipayObject {

	private static final long serialVersionUID = 8525265654133479959L;

	/**
	 * 图章对齐位置的x坐标自
	 */
	@ApiField("axis_x")
	private Long axisX;

	/**
	 * 图章用印位置的y坐标
	 */
	@ApiField("axis_y")
	private Long axisY;

	/**
	 * 电子图章对齐方式，目前只支持TOP_LEFT，在此顶一下图章用印位置的取值方式为，图章左上角相对原点（PDF左上角）的坐标
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 图章旋转角度，取值范围为-360到360，正数为顺时针旋转，负数为逆时针旋转
	 */
	@ApiField("rotate_angle")
	private Long rotateAngle;

	/**
	 * 需要使用的印章id，需要与法务中台技术确认值
	 */
	@ApiField("seal_id")
	private Long sealId;

	public Long getAxisX() {
		return this.axisX;
	}
	public void setAxisX(Long axisX) {
		this.axisX = axisX;
	}

	public Long getAxisY() {
		return this.axisY;
	}
	public void setAxisY(Long axisY) {
		this.axisY = axisY;
	}

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getRotateAngle() {
		return this.rotateAngle;
	}
	public void setRotateAngle(Long rotateAngle) {
		this.rotateAngle = rotateAngle;
	}

	public Long getSealId() {
		return this.sealId;
	}
	public void setSealId(Long sealId) {
		this.sealId = sealId;
	}

}
