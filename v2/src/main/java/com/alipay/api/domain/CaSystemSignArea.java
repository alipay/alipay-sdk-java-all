package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区域信息（包括印模信息）
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:00:38
 */
public class CaSystemSignArea extends AlipayObject {

	private static final long serialVersionUID = 5688969686694624651L;

	/**
	 * 骑缝章信息
	 */
	@ApiField("ca_system_cross_page")
	private CaSystemCrossPage caSystemCrossPage;

	/**
	 * 正文章信息
	 */
	@ApiField("ca_system_main_body")
	private CaSystemMainBody caSystemMainBody;

	/**
	 * 指定外部印章类型的预设位置
	 */
	@ApiField("external_seal_type")
	private String externalSealType;

	/**
	 * 用印对齐类型
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 1代表正文章，2代表骑缝章
	 */
	@ApiField("position_type")
	private Long positionType;

	/**
	 * 章的旋转角度，单位是度（°）
	 */
	@ApiField("rotate_angle")
	private Long rotateAngle;

	/**
	 * 印章高度，单位mm
	 */
	@ApiField("seal_height")
	private Long sealHeight;

	/**
	 * 印章id
	 */
	@ApiField("seal_id")
	private String sealId;

	/**
	 * sealId，sealPicAddr二选一
	 */
	@ApiField("seal_pic_addr")
	private String sealPicAddr;

	/**
	 * 印章宽度，单位mm
	 */
	@ApiField("seal_width")
	private Long sealWidth;

	public CaSystemCrossPage getCaSystemCrossPage() {
		return this.caSystemCrossPage;
	}
	public void setCaSystemCrossPage(CaSystemCrossPage caSystemCrossPage) {
		this.caSystemCrossPage = caSystemCrossPage;
	}

	public CaSystemMainBody getCaSystemMainBody() {
		return this.caSystemMainBody;
	}
	public void setCaSystemMainBody(CaSystemMainBody caSystemMainBody) {
		this.caSystemMainBody = caSystemMainBody;
	}

	public String getExternalSealType() {
		return this.externalSealType;
	}
	public void setExternalSealType(String externalSealType) {
		this.externalSealType = externalSealType;
	}

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getPositionType() {
		return this.positionType;
	}
	public void setPositionType(Long positionType) {
		this.positionType = positionType;
	}

	public Long getRotateAngle() {
		return this.rotateAngle;
	}
	public void setRotateAngle(Long rotateAngle) {
		this.rotateAngle = rotateAngle;
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

	public String getSealPicAddr() {
		return this.sealPicAddr;
	}
	public void setSealPicAddr(String sealPicAddr) {
		this.sealPicAddr = sealPicAddr;
	}

	public Long getSealWidth() {
		return this.sealWidth;
	}
	public void setSealWidth(Long sealWidth) {
		this.sealWidth = sealWidth;
	}

}
