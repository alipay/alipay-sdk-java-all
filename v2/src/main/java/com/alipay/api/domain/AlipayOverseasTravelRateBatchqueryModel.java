package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游汇率批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:49:41
 */
public class AlipayOverseasTravelRateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5475964158443818271L;

	/**
	 * 货币代码列表，货币代码遵循ISO标准alpha- 3币种代码，用英文半角逗号分隔，支持的币种可以联系支付宝技术支持。
	 */
	@ApiListField("currencies")
	@ApiField("string")
	private List<String> currencies;

	/**
	 * 业务扩展参数,用于商户的特 定业务信息的传递,json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCurrencies() {
		return this.currencies;
	}
	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
