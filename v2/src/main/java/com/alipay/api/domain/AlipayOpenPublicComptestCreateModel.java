package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文档发布验证
 *
 * @author auto create
 * @since 1.0, 2019-06-16 11:46:55
 */
public class AlipayOpenPublicComptestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8333392792959112528L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 测试
	 */
	@ApiListField("string")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> string;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<GavintestNewLeveaOne> getString() {
		return this.string;
	}
	public void setString(List<GavintestNewLeveaOne> string) {
		this.string = string;
	}

}
