package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签组发过滤单个条件
 *
 * @author auto create
 * @since 1.0, 2016-12-02 17:04:34
 */
public class LabelFilter extends AlipayObject {

	private static final long serialVersionUID = 2587224246584793671L;

	/**
	 * 标签组名，商户自定义的标签固定为label_id_list，支付宝开放的标签详见<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/FirstPartOfTagsFromAlipay.xlsx">支付宝开放标签</a>
	 */
	@ApiField("column_name")
	private String columnName;

	/**
	 * 操作符，支持=、!=、in三个操作符；其中in表示是某几个标签中的一个
	 */
	@ApiField("op")
	private String op;

	/**
	 * 标签数组，用于组装最后的表达式
	 */
	@ApiListField("values")
	@ApiField("string")
	private List<String> values;

	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getOp() {
		return this.op;
	}
	public void setOp(String op) {
		this.op = op;
	}

	public List<String> getValues() {
		return this.values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}

}
