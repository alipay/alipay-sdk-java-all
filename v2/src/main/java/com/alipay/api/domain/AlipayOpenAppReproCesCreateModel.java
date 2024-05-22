package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试线上数据
 *
 * @author auto create
 * @since 1.0, 2022-07-08 19:53:59
 */
public class AlipayOpenAppReproCesCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3551861316723238753L;

	/**
	 * 测试
	 */
	@ApiListField("comp")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> comp;

	/**
	 * 测试
	 */
	@ApiField("nam")
	private Gavinmed nam;

	/**
	 * 21
	 */
	@ApiListField("str")
	@ApiField("string")
	private List<String> str;

	public List<GavintestNewLeveaOne> getComp() {
		return this.comp;
	}
	public void setComp(List<GavintestNewLeveaOne> comp) {
		this.comp = comp;
	}

	public Gavinmed getNam() {
		return this.nam;
	}
	public void setNam(Gavinmed nam) {
		this.nam = nam;
	}

	public List<String> getStr() {
		return this.str;
	}
	public void setStr(List<String> str) {
		this.str = str;
	}

}
