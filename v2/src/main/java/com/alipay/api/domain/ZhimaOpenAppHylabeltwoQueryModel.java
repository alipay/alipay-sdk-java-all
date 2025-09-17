package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业二级分类预测
 *
 * @author auto create
 * @since 1.0, 2021-03-22 10:27:13
 */
public class ZhimaOpenAppHylabeltwoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3369743967827364414L;

	/**
	 * 公司名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 经营范围
	 */
	@ApiField("opr_scope")
	private String oprScope;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOprScope() {
		return this.oprScope;
	}
	public void setOprScope(String oprScope) {
		this.oprScope = oprScope;
	}

}
