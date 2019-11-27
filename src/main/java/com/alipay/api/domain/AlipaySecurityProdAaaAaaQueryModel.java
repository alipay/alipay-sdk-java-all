package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 我了个
 *
 * @author auto create
 * @since 1.0, 2018-03-14 11:06:32
 */
public class AlipaySecurityProdAaaAaaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5716552347733952889L;

	/**
	 * fdasf
	 */
	@ApiField("is_new")
	private Boolean isNew;

	/**
	 * 描述
	 */
	@ApiField("name")
	private BoxiuTestDSTwo name;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("test")
	private String test;

	public Boolean getIsNew() {
		return this.isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public BoxiuTestDSTwo getName() {
		return this.name;
	}
	public void setName(BoxiuTestDSTwo name) {
		this.name = name;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
