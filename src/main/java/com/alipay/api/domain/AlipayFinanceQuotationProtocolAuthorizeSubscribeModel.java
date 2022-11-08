package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构协议授权订阅
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:58:19
 */
public class AlipayFinanceQuotationProtocolAuthorizeSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 2117149175728561217L;

	/**
	 * 与蚂蚁业务方约定的类型，同时约定$orgCode值
	 */
	@ApiListField("protocol_type_list")
	@ApiField("string")
	private List<String> protocolTypeList;

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

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getProtocolTypeList() {
		return this.protocolTypeList;
	}
	public void setProtocolTypeList(List<String> protocolTypeList) {
		this.protocolTypeList = protocolTypeList;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
