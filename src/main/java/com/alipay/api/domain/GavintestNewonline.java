package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2019-04-11 16:28:13
 */
public class GavintestNewonline extends AlipayObject {

	private static final long serialVersionUID = 5392387294149126661L;

	/**
	 * 1
	 */
	@ApiListField("dem")
	@ApiField("string")
	private List<String> dem;

	/**
	 * 21
	 */
	@ApiField("string")
	private GavintestNewLeveaOne string;

	public List<String> getDem() {
		return this.dem;
	}
	public void setDem(List<String> dem) {
		this.dem = dem;
	}

	public GavintestNewLeveaOne getString() {
		return this.string;
	}
	public void setString(GavintestNewLeveaOne string) {
		this.string = string;
	}

}
