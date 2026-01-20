package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区信息
 *
 * @author auto create
 * @since 1.0, 2023-05-15 09:39:16
 */
public class SignfieldInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6619439594569781715L;

	/**
	 * 文件ID,调用文件上传接口返回的fileId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 是否为自由签署区(自由签署区可拖动)，自由签署区时，不可填写xy坐标
	 */
	@ApiField("free_sign")
	private Boolean freeSign;

	/**
	 * 普通签署区为签署页码，骑缝签署区为起始页码
	 */
	@ApiField("pos_page")
	private Long posPage;

	/**
	 * 普通签署区为空，骑缝签署区为结束页码
	 */
	@ApiField("pos_page_end")
	private Long posPageEnd;

	/**
	 * 签署区位置横坐标，骑缝签署区为空，普通签署区必填
	 */
	@ApiField("pos_x")
	private Long posX;

	/**
	 * 签署区位置纵坐标
	 */
	@ApiField("pos_y")
	private Long posY;

	/**
	 * 签署位置类型，1-普通，2-骑缝，默认1
	 */
	@ApiField("position_type")
	private Long positionType;

	/**
	 * 签署区类型，1-系统签署，2-手动签署
	 */
	@ApiField("sign_area_type")
	private String signAreaType;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public Boolean getFreeSign() {
		return this.freeSign;
	}
	public void setFreeSign(Boolean freeSign) {
		this.freeSign = freeSign;
	}

	public Long getPosPage() {
		return this.posPage;
	}
	public void setPosPage(Long posPage) {
		this.posPage = posPage;
	}

	public Long getPosPageEnd() {
		return this.posPageEnd;
	}
	public void setPosPageEnd(Long posPageEnd) {
		this.posPageEnd = posPageEnd;
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

	public String getSignAreaType() {
		return this.signAreaType;
	}
	public void setSignAreaType(String signAreaType) {
		this.signAreaType = signAreaType;
	}

}
