package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证券展位准入VO
 *
 * @author auto create
 * @since 1.0, 2021-09-18 09:37:29
 */
public class StockPositionVO extends AlipayObject {

	private static final long serialVersionUID = 7217481389353428269L;

	/**
	 * 若返回结果为true表示用户准入该展位，可以展示对应的内容，反之不可以展示对应内容。
	 */
	@ApiField("is_show")
	private Boolean isShow;

	/**
	 * 小程序展位ID，由蚂蚁端指定建立分配
	 */
	@ApiField("position_code")
	private String positionCode;

	public Boolean getIsShow() {
		return this.isShow;
	}
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

}
