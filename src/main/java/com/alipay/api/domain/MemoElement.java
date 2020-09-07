package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义备注元素
 *
 * @author auto create
 * @since 1.0, 2020-06-19 10:21:52
 */
public class MemoElement extends AlipayObject {

	private static final long serialVersionUID = 1617427558875963976L;

	/**
	 * 是否是常量，默认常量
	 */
	@ApiField("constant")
	private Boolean constant;

	/**
	 * 字段替换的key，DEBIT_ACCOUNT_NO/CREDIT_ACCOUNT_NO/DEBIT_INST_ID/CREDIT_INST_ID/TRANS_TIME/BIZ_NO
付款账号/收款账号/付款账户机构id/收款账户机构id/交易时间/业务单号
	 */
	@ApiField("key")
	private String key;

	public Boolean getConstant() {
		return this.constant;
	}
	public void setConstant(Boolean constant) {
		this.constant = constant;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
