package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 检测详情
 *
 * @author auto create
 * @since 1.0, 2023-06-29 18:07:44
 */
public class ApmobileDetectDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4263386991366845939L;

	/**
	 * 检测项详情
	 */
	@ApiListField("detect_item_list")
	@ApiField("apmobile_detect_item_d_t_o")
	private List<ApmobileDetectItemDTO> detectItemList;

	/**
	 * 有问题的检测子项数
	 */
	@ApiField("detect_item_problem_num")
	private String detectItemProblemNum;

	/**
	 * 检测大项内的检测子项数量
	 */
	@ApiField("detect_item_sum")
	private String detectItemSum;

	/**
	 * 检测大项名称
	 */
	@ApiField("detect_item_type")
	private String detectItemType;

	public List<ApmobileDetectItemDTO> getDetectItemList() {
		return this.detectItemList;
	}
	public void setDetectItemList(List<ApmobileDetectItemDTO> detectItemList) {
		this.detectItemList = detectItemList;
	}

	public String getDetectItemProblemNum() {
		return this.detectItemProblemNum;
	}
	public void setDetectItemProblemNum(String detectItemProblemNum) {
		this.detectItemProblemNum = detectItemProblemNum;
	}

	public String getDetectItemSum() {
		return this.detectItemSum;
	}
	public void setDetectItemSum(String detectItemSum) {
		this.detectItemSum = detectItemSum;
	}

	public String getDetectItemType() {
		return this.detectItemType;
	}
	public void setDetectItemType(String detectItemType) {
		this.detectItemType = detectItemType;
	}

}
