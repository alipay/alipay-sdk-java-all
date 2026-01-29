package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 座椅加热档位信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 17:58:39
 */
public class RoboCurrentLevel extends AlipayObject {

	private static final long serialVersionUID = 4561779117162353258L;

	/**
	 * 左侧座椅加热档位，0是未设置，1，2，3档
	 */
	@ApiField("left")
	private Long left;

	/**
	 * 右侧座椅加热档位，0是未设置，1，2，3档
	 */
	@ApiField("right")
	private Long right;

	public Long getLeft() {
		return this.left;
	}
	public void setLeft(Long left) {
		this.left = left;
	}

	public Long getRight() {
		return this.right;
	}
	public void setRight(Long right) {
		this.right = right;
	}

}
