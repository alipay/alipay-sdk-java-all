package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗商品库标签查询
 *
 * @author auto create
 * @since 1.0, 2022-08-11 18:46:11
 */
public class AlipayPcreditHuabeiGoodsTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6774836359557711428L;

	/**
	 * 识别标识码
	 */
	@ApiField("biz_src")
	private String bizSrc;

	public String getBizSrc() {
		return this.bizSrc;
	}
	public void setBizSrc(String bizSrc) {
		this.bizSrc = bizSrc;
	}

}
