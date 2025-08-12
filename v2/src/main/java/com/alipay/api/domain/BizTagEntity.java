package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * name	String	人群标签名称
extParams	Map<String,String>	扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-01-03 15:35:53
 */
public class BizTagEntity extends AlipayObject {

	private static final long serialVersionUID = 5195784498516938657L;

	/**
	 * 标签扩展参数
	 */
	@ApiField("biz_tag_ext_params")
	private BizTagExtParams bizTagExtParams;

	/**
	 * 前置准入咨询标签
	 */
	@ApiField("name")
	private String name;

	public BizTagExtParams getBizTagExtParams() {
		return this.bizTagExtParams;
	}
	public void setBizTagExtParams(BizTagExtParams bizTagExtParams) {
		this.bizTagExtParams = bizTagExtParams;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
