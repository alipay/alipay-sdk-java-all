package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝订阅的协议结果
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:57:50
 */
public class SubProtocolResult extends AlipayObject {

	private static final long serialVersionUID = 6784934643229251332L;

	/**
	 * 与蚂蚁业务方约定的类型，同时约定$orgCode值
	 */
	@ApiField("protocol_type")
	private String protocolType;

	/**
	 * 业务请求结果
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 订阅个股还是全部，ALL表示全部，SYMBOL表示个股
	 */
	@ApiField("sign_content")
	private String signContent;

	/**
	 * 股票市场上的代码+市场组合的代码
	 */
	@ApiListField("symbols")
	@ApiField("string")
	private List<String> symbols;

	public String getProtocolType() {
		return this.protocolType;
	}
	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getSignContent() {
		return this.signContent;
	}
	public void setSignContent(String signContent) {
		this.signContent = signContent;
	}

	public List<String> getSymbols() {
		return this.symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}

}
