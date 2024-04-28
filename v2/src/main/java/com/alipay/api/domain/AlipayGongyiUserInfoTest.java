package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公奕测试
 *
 * @author auto create
 * @since 1.0, 2020-06-10 10:14:01
 */
public class AlipayGongyiUserInfoTest extends AlipayObject {

	private static final long serialVersionUID = 2725481682181488344L;

	/**
	 * 地址信息
	 */
	@ApiField("address")
	private AlipayGongyiAddressTest address;

	/**
	 * 10
	 */
	@ApiField("age")
	private Long age;

	/**
	 * 1912-12-12
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 上海，杭州
	 */
	@ApiListField("citys")
	@ApiField("string")
	private List<String> citys;

	/**
	 * 1001
	 */
	@ApiField("code")
	private String code;

	/**
	 * zhangsan
	 */
	@ApiField("name")
	private String name;

	/**
	 * 学校地址列表
	 */
	@ApiListField("school_list")
	@ApiField("alipay_gongyi_address_test")
	private List<AlipayGongyiAddressTest> schoolList;

	public AlipayGongyiAddressTest getAddress() {
		return this.address;
	}
	public void setAddress(AlipayGongyiAddressTest address) {
		this.address = address;
	}

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public List<String> getCitys() {
		return this.citys;
	}
	public void setCitys(List<String> citys) {
		this.citys = citys;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<AlipayGongyiAddressTest> getSchoolList() {
		return this.schoolList;
	}
	public void setSchoolList(List<AlipayGongyiAddressTest> schoolList) {
		this.schoolList = schoolList;
	}

}
