package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部平台获取汽车金融授信相关数据
 *
 * @author auto create
 * @since 1.0, 2016-09-12 11:50:02
 */
public class AlipayCreditAutofinanceDataGetModel extends AlipayObject {

	private static final long serialVersionUID = 6214599642184236313L;

	/**
	 * 获取数据的类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 数据类型对应的参数
	 */
	@ApiField("requstjson")
	private String requstjson;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getRequstjson() {
		return this.requstjson;
	}
	public void setRequstjson(String requstjson) {
		this.requstjson = requstjson;
	}

}
