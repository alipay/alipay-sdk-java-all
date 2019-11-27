package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2017-11-14 22:53:19
 */
public class AlipayOpenAuthTestTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6249157454789673829L;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否22唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("aaa")
	private String aaa;

	public String getAaa() {
		return this.aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}
