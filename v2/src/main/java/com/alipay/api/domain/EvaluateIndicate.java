package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 评估指标
 *
 * @author auto create
 * @since 1.0, 2024-04-02 20:51:15
 */
public class EvaluateIndicate extends AlipayObject {

	private static final long serialVersionUID = 5197591962192724475L;

	/**
	 * 子指标id列表
	 */
	@ApiListField("children_ids")
	@ApiField("evalute_indicate_id")
	private List<EvaluteIndicateId> childrenIds;

	/**
	 * 评分指标列表
	 */
	@ApiListField("grade_indicates")
	@ApiField("evaluate_indicate_grade")
	private List<EvaluateIndicateGrade> gradeIndicates;

	/**
	 * 商户指标描述
	 */
	@ApiField("isv_indicate_desc")
	private String isvIndicateDesc;

	/**
	 * 商户指标id
	 */
	@ApiField("isv_indicate_id")
	private String isvIndicateId;

	/**
	 * 商户指标图片
	 */
	@ApiField("isv_indicate_img")
	private String isvIndicateImg;

	/**
	 * 商户指标名称
	 */
	@ApiField("isv_indicate_name")
	private String isvIndicateName;

	public List<EvaluteIndicateId> getChildrenIds() {
		return this.childrenIds;
	}
	public void setChildrenIds(List<EvaluteIndicateId> childrenIds) {
		this.childrenIds = childrenIds;
	}

	public List<EvaluateIndicateGrade> getGradeIndicates() {
		return this.gradeIndicates;
	}
	public void setGradeIndicates(List<EvaluateIndicateGrade> gradeIndicates) {
		this.gradeIndicates = gradeIndicates;
	}

	public String getIsvIndicateDesc() {
		return this.isvIndicateDesc;
	}
	public void setIsvIndicateDesc(String isvIndicateDesc) {
		this.isvIndicateDesc = isvIndicateDesc;
	}

	public String getIsvIndicateId() {
		return this.isvIndicateId;
	}
	public void setIsvIndicateId(String isvIndicateId) {
		this.isvIndicateId = isvIndicateId;
	}

	public String getIsvIndicateImg() {
		return this.isvIndicateImg;
	}
	public void setIsvIndicateImg(String isvIndicateImg) {
		this.isvIndicateImg = isvIndicateImg;
	}

	public String getIsvIndicateName() {
		return this.isvIndicateName;
	}
	public void setIsvIndicateName(String isvIndicateName) {
		this.isvIndicateName = isvIndicateName;
	}

}
