package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OPENAPI测试
 *
 * @author auto create
 * @since 1.0, 2025-01-22 17:42:05
 */
public class AlipayDataDataserviceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7514617438754918665L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 金额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 车钥匙数量
	 */
	@ApiField("car_keys")
	private Long carKeys;

	/**
	 * {"key":"value"};
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * helle
	 */
	@ApiField("hello_hq")
	private HelloHq helloHq;

	/**
	 * 3
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 座位数
	 */
	@ApiField("seats")
	private String seats;

	/**
	 * 注意事项
	 */
	@ApiListField("test_g_one")
	@ApiField("string")
	private List<String> testGOne;

	/**
	 * 总额
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 重量
	 */
	@ApiField("weight")
	private String weight;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Long getCarKeys() {
		return this.carKeys;
	}
	public void setCarKeys(Long carKeys) {
		this.carKeys = carKeys;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public HelloHq getHelloHq() {
		return this.helloHq;
	}
	public void setHelloHq(HelloHq helloHq) {
		this.helloHq = helloHq;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSeats() {
		return this.seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}

	public List<String> getTestGOne() {
		return this.testGOne;
	}
	public void setTestGOne(List<String> testGOne) {
		this.testGOne = testGOne;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
