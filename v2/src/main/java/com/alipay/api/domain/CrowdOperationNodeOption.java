package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群操作节点选项
 *
 * @author auto create
 * @since 1.0, 2023-11-09 19:22:08
 */
public class CrowdOperationNodeOption extends AlipayObject {

	private static final long serialVersionUID = 2582565843962197222L;

	/**
	 * 节点编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 节点id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 节点值名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 平铺展开的选项值ID
	 */
	@ApiField("option_id_list")
	private String optionIdList;

	/**
	 * 值列表
	 */
	@ApiListField("option_list")
	@ApiField("crowd_operation_node_option_detail")
	private List<CrowdOperationNodeOptionDetail> optionList;

	/**
	 * 平铺展开的选项中文值
	 */
	@ApiField("option_text_list")
	private String optionTextList;

	/**
	 * 平铺展开的选项值
	 */
	@ApiField("option_value_list")
	private String optionValueList;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOptionIdList() {
		return this.optionIdList;
	}
	public void setOptionIdList(String optionIdList) {
		this.optionIdList = optionIdList;
	}

	public List<CrowdOperationNodeOptionDetail> getOptionList() {
		return this.optionList;
	}
	public void setOptionList(List<CrowdOperationNodeOptionDetail> optionList) {
		this.optionList = optionList;
	}

	public String getOptionTextList() {
		return this.optionTextList;
	}
	public void setOptionTextList(String optionTextList) {
		this.optionTextList = optionTextList;
	}

	public String getOptionValueList() {
		return this.optionValueList;
	}
	public void setOptionValueList(String optionValueList) {
		this.optionValueList = optionValueList;
	}

}
