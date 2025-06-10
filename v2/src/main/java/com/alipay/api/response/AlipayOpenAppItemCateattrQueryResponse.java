package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryAttributeInfoVO;
import com.alipay.api.domain.ControlRuleVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.cateattr.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-31 19:57:27
 */
public class AlipayOpenAppItemCateattrQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7814465671331345231L;

	/** 
	 * null
	 */
	@ApiListField("cat_attr_list")
	@ApiField("category_attribute_info_v_o")
	private List<CategoryAttributeInfoVO> catAttrList;

	/** 
	 * null
	 */
	@ApiListField("control_rule")
	@ApiField("control_rule_v_o")
	private List<ControlRuleVO> controlRule;

	public void setCatAttrList(List<CategoryAttributeInfoVO> catAttrList) {
		this.catAttrList = catAttrList;
	}
	public List<CategoryAttributeInfoVO> getCatAttrList( ) {
		return this.catAttrList;
	}

	public void setControlRule(List<ControlRuleVO> controlRule) {
		this.controlRule = controlRule;
	}
	public List<ControlRuleVO> getControlRule( ) {
		return this.controlRule;
	}

}
