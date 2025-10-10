package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪萌表情包接口响应明细
 *
 * @author auto create
 * @since 1.0, 2025-06-16 20:05:27
 */
public class FunImageWeshineItemDetail extends AlipayObject {

	private static final long serialVersionUID = 5117771659631857538L;

	/**
	 * 闪萌表情包查询接口返回的表情包gif图片地址
	 */
	@ApiField("gif")
	private String gif;

	/**
	 * 闪萌表情包图片宽度
	 */
	@ApiField("h")
	private Long h;

	/**
	 * 闪萌表情包图片宽度
	 */
	@ApiField("w")
	private Long w;

	/**
	 * 闪萌表情包webp格式链接
	 */
	@ApiField("webp")
	private String webp;

	public String getGif() {
		return this.gif;
	}
	public void setGif(String gif) {
		this.gif = gif;
	}

	public Long getH() {
		return this.h;
	}
	public void setH(Long h) {
		this.h = h;
	}

	public Long getW() {
		return this.w;
	}
	public void setW(Long w) {
		this.w = w;
	}

	public String getWebp() {
		return this.webp;
	}
	public void setWebp(String webp) {
		this.webp = webp;
	}

}
