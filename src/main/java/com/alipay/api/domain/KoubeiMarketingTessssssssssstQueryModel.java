package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tessssssssssst
 *
 * @author auto create
 * @since 1.0, 2019-10-29 14:43:41
 */
public class KoubeiMarketingTessssssssssstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4236614617462133944L;

	/**
	 * tset
	 */
	@ApiField("age")
	private Long age;

	/**
	 * test
	 */
	@ApiField("height")
	private String height;

	/**
	 * test
	 */
	@ApiField("object")
	private SpiInputObject object;

	/**
	 * test
	 */
	@ApiField("params")
	private AccessParams params;

	/**
	 * test
	 */
	@ApiField("x_name")
	private String xName;

	public Long getAge() {
		return this.age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public SpiInputObject getObject() {
		return this.object;
	}
	public void setObject(SpiInputObject object) {
		this.object = object;
	}

	public AccessParams getParams() {
		return this.params;
	}
	public void setParams(AccessParams params) {
		this.params = params;
	}

	public String getxName() {
		return this.xName;
	}
	public void setxName(String xName) {
		this.xName = xName;
	}

}
