package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 证券协议授权订阅
 *
 * @author auto create
 * @since 1.0, 2022-12-07 19:54:50
 */
public class AlipayFinanceQuotationProtocolAuthorizeCheckModel extends AlipayObject {

	private static final long serialVersionUID = 6267445975996249897L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 与蚂蚁业务方约定的类型，同时约定$orgCode值
	 */
	@ApiListField("protocol_type_list")
	@ApiField("string")
	private List<String> protocolTypeList;

	/**
	 * 订阅个股还是全部，ALL表示全部，SYMBOL表示个股，都写表示全查
	 */
	@ApiListField("sign_content_list")
	@ApiField("string")
	private List<String> signContentList;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getProtocolTypeList() {
		return this.protocolTypeList;
	}
	public void setProtocolTypeList(List<String> protocolTypeList) {
		this.protocolTypeList = protocolTypeList;
	}

	public List<String> getSignContentList() {
		return this.signContentList;
	}
	public void setSignContentList(List<String> signContentList) {
		this.signContentList = signContentList;
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
