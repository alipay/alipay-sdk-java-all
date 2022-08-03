package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游汇率币种批量查询
 *
 * @author auto create
 * @since 1.0, 2020-03-25 11:37:54
 */
public class AlipayOverseasTravelRateCurrencyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2234614187159518628L;

	/**
	 * 业务类型:
1.MBARCODE（支持境外当面付的币种）；
2.CLASS_RATE（支持分级汇率的币种）；
3.为空时默认查询所有的币种；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

}
