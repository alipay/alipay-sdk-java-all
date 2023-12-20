package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放内容，数组，内为条目对象
 *
 * @author auto create
 * @since 1.0, 2022-12-20 13:42:18
 */
public class ItemPlanContentDO extends AlipayObject {

	private static final long serialVersionUID = 2672232532525315359L;

	/**
	 * 对应服务库编码
	 */
	@ApiListField("codes")
	@ApiField("string")
	private List<String> codes;

	/**
	 * 条目类型，必须， 商品：ITEM
	 */
	@ApiField("type")
	private String type;

	public List<String> getCodes() {
		return this.codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
