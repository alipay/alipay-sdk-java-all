package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动销数据
 *
 * @author auto create
 * @since 1.0, 2025-03-13 14:46:01
 */
public class SnsTradeDataResult extends AlipayObject {

	private static final long serialVersionUID = 7835728782298877352L;

	/**
	 * 渠道编码
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 用于返回截止当前日期的动销数量
	 */
	@ApiField("trd_count")
	private String trdCount;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getTrdCount() {
		return this.trdCount;
	}
	public void setTrdCount(String trdCount) {
		this.trdCount = trdCount;
	}

}
