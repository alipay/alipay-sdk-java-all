package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试新增sdl地址
 *
 * @author auto create
 * @since 1.0, 2024-07-12 13:47:39
 */
public class AlipayDataDataserviceDdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1488729878721561858L;

	/**
	 * 金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 测试
	 */
	@ApiListField("qwe")
	@ApiField("string")
	private List<String> qwe;

	/**
	 * 测试
	 */
	@ApiField("test_openid")
	private String testOpenid;

	/**
	 * 总金额 单位元
	 */
	@ApiField("total")
	private String total;

	/**
	 * 重量
	 */
	@ApiField("weight")
	private String weight;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<String> getQwe() {
		return this.qwe;
	}
	public void setQwe(List<String> qwe) {
		this.qwe = qwe;
	}

	public String getTestOpenid() {
		return this.testOpenid;
	}
	public void setTestOpenid(String testOpenid) {
		this.testOpenid = testOpenid;
	}

	public String getTotal() {
		return this.total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
