package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv查询商户某个产品的签约状态
 *
 * @author auto create
 * @since 1.0, 2019-10-18 16:57:34
 */
public class AlipayOpenAgentSignstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1222258686417556146L;

	/**
	 * isv要查询签约状态的商户账号，是支付宝账号pid（2088开头）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
