package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品属性信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:37:02
 */
public class PunchoutAccessProductAttrValueDto extends AlipayObject {

	private static final long serialVersionUID = 7524533113564687641L;

	/**
	 * attr_desc,用于punchout模式产品同步
	 */
	@ApiField("attr_desc")
	private String attrDesc;

	/**
	 * attr_en_name，用于punchout模式产品同步
	 */
	@ApiField("attr_en_name")
	private String attrEnName;

	/**
	 * attr_en_value_name_list，用于punchout模式产品同步
	 */
	@ApiListField("attr_en_value_name_list")
	@ApiField("string")
	private List<String> attrEnValueNameList;

	/**
	 * attr_name，用于punchout模式产品同步
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * attr_value_name_list，用于punchout模式产品同步
	 */
	@ApiListField("attr_value_name_list")
	@ApiField("string")
	private List<String> attrValueNameList;

	/**
	 * is_key,用于punchout模式产品同步
	 */
	@ApiField("is_key")
	private String isKey;

	public String getAttrDesc() {
		return this.attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}

	public String getAttrEnName() {
		return this.attrEnName;
	}
	public void setAttrEnName(String attrEnName) {
		this.attrEnName = attrEnName;
	}

	public List<String> getAttrEnValueNameList() {
		return this.attrEnValueNameList;
	}
	public void setAttrEnValueNameList(List<String> attrEnValueNameList) {
		this.attrEnValueNameList = attrEnValueNameList;
	}

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public List<String> getAttrValueNameList() {
		return this.attrValueNameList;
	}
	public void setAttrValueNameList(List<String> attrValueNameList) {
		this.attrValueNameList = attrValueNameList;
	}

	public String getIsKey() {
		return this.isKey;
	}
	public void setIsKey(String isKey) {
		this.isKey = isKey;
	}

}
