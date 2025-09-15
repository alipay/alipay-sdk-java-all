package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 棋盘圈选标签模型
 *
 * @author auto create
 * @since 1.0, 2024-06-03 16:16:05
 */
public class OpenCrowdOperationTag extends AlipayObject {

	private static final long serialVersionUID = 8255629339669484498L;

	/**
	 * 标签所有必须的圈选项列表
	 */
	@ApiListField("operation_option_list")
	@ApiField("open_crowd_operation_option")
	private List<OpenCrowdOperationOption> operationOptionList;

	/**
	 * 棋盘人群圈选标签的唯一编码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 棋盘人群圈选标签的描述性信息
	 */
	@ApiField("tag_desc")
	private String tagDesc;

	/**
	 * 棋盘人群圈选标签名称
	 */
	@ApiField("tag_name")
	private String tagName;

	public List<OpenCrowdOperationOption> getOperationOptionList() {
		return this.operationOptionList;
	}
	public void setOperationOptionList(List<OpenCrowdOperationOption> operationOptionList) {
		this.operationOptionList = operationOptionList;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

	public String getTagDesc() {
		return this.tagDesc;
	}
	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
