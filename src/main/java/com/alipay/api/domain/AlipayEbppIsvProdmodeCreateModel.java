package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品模型创建接口
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:54:13
 */
public class AlipayEbppIsvProdmodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6685413993165367122L;

	/**
	 * 参数内容包含：ISV录入产品模型相关信息，具体分类如下：1.销账机构信息
2.对账配置信息
3.清算配置信息
4.产品模型和出账机构信息
5.机构拓展信息
	 */
	@ApiField("biz_data")
	private String bizData;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

}
