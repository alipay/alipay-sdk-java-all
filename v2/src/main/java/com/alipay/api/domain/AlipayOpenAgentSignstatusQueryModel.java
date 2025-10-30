package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv查询商户某个产品的签约状态
 *
 * @author auto create
 * @since 1.0, 2025-09-08 14:21:21
 */
public class AlipayOpenAgentSignstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4461627116553415266L;

	/**
	 * isv要查询签约状态的商户账号，可以是支付宝账号pid（2088开头），也可以是商户的登录账号（邮箱或手机号）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识。目前支持查询产品及产品码详情参见 <a href="https://opendocs.alipay.com/isv/04eh3g">获取商家产品开通状态</a>。
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
