package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多媒体OCR行驶证识别
 *
 * @author auto create
 * @since 1.0, 2017-12-13 10:47:42
 */
public class AlipayMsaasMediarecogAftsCertIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7494539159323135466L;

	/**
	 * 扩展入参
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 高
	 */
	@ApiField("h")
	private Long h;

	/**
	 * 车牌号
	 */
	@ApiField("plate_number")
	private String plateNumber;

	/**
	 * 传入资源URL或djangoid或aftsid
	 */
	@ApiField("url")
	private String url;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 宽
	 */
	@ApiField("w")
	private Long w;

	/**
	 * 左上角x
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 左上角y
	 */
	@ApiField("y")
	private Long y;

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public Long getH() {
		return this.h;
	}
	public void setH(Long h) {
		this.h = h;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getW() {
		return this.w;
	}
	public void setW(Long w) {
		this.w = w;
	}

	public Long getX() {
		return this.x;
	}
	public void setX(Long x) {
		this.x = x;
	}

	public Long getY() {
		return this.y;
	}
	public void setY(Long y) {
		this.y = y;
	}

}
