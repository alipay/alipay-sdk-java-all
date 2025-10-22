package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生产环境测试接口
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:17:20
 */
public class AlipayDataDataserviceProdtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2564658178797894214L;

	/**
	 * date测试
	 */
	@ApiField("date_test")
	private Date dateTest;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * null
	 */
	@ApiListField("test_array")
	@ApiField("api_scheame_one")
	private List<ApiScheameOne> testArray;

	public Date getDateTest() {
		return this.dateTest;
	}
	public void setDateTest(Date dateTest) {
		this.dateTest = dateTest;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<ApiScheameOne> getTestArray() {
		return this.testArray;
	}
	public void setTestArray(List<ApiScheameOne> testArray) {
		this.testArray = testArray;
	}

}
