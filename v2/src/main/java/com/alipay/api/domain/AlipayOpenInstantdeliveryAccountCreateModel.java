package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时配送商家账户创建
 *
 * @author auto create
 * @since 1.0, 2022-09-14 20:30:50
 */
public class AlipayOpenInstantdeliveryAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3297421922965935369L;

	/**
	 * 配送公司编码
	 */
	@ApiListField("logistics_codes")
	@ApiField("string")
	private List<String> logisticsCodes;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<String> getLogisticsCodes() {
		return this.logisticsCodes;
	}
	public void setLogisticsCodes(List<String> logisticsCodes) {
		this.logisticsCodes = logisticsCodes;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
