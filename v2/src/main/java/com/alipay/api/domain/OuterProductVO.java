package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对外产品
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:43
 */
public class OuterProductVO extends AlipayObject {

	private static final long serialVersionUID = 8713246828479916935L;

	/**
	 * 模块列表
	 */
	@ApiListField("module_items")
	@ApiField("module_v_o")
	private List<ModuleVO> moduleItems;

	/**
	 * 对外产品code
	 */
	@ApiField("outer_product_code")
	private String outerProductCode;

	/**
	 * 对外产品id
	 */
	@ApiField("outer_product_id")
	private String outerProductId;

	public List<ModuleVO> getModuleItems() {
		return this.moduleItems;
	}
	public void setModuleItems(List<ModuleVO> moduleItems) {
		this.moduleItems = moduleItems;
	}

	public String getOuterProductCode() {
		return this.outerProductCode;
	}
	public void setOuterProductCode(String outerProductCode) {
		this.outerProductCode = outerProductCode;
	}

	public String getOuterProductId() {
		return this.outerProductId;
	}
	public void setOuterProductId(String outerProductId) {
		this.outerProductId = outerProductId;
	}

}
