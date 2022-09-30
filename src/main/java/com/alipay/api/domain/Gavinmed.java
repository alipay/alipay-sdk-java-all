package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试新增复杂类型
 *
 * @author auto create
 * @since 1.0, 2019-03-05 09:50:29
 */
public class Gavinmed extends AlipayObject {

	private static final long serialVersionUID = 4874286352516965229L;

	/**
	 * 复杂类型嵌入
	 */
	@ApiListField("meds")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> meds;

	/**
	 * 退换货
	 */
	@ApiField("str")
	private String str;

	public List<GavintestNewLeveaOne> getMeds() {
		return this.meds;
	}
	public void setMeds(List<GavintestNewLeveaOne> meds) {
		this.meds = meds;
	}

	public String getStr() {
		return this.str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
