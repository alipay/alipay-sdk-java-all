package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商客户打标-增加或修改标签
 *
 * @author auto create
 * @since 1.0, 2019-09-25 09:59:53
 */
public class MybankPaymentTradeUserclassificationCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2861876444385967675L;

	/**
	 * 用户分类类别
	 */
	@ApiField("classification_name")
	private String classificationName;

	/**
	 * 客户分类打标值,1:准入;0:取消
	 */
	@ApiField("classification_value")
	private String classificationValue;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getClassificationName() {
		return this.classificationName;
	}
	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}

	public String getClassificationValue() {
		return this.classificationValue;
	}
	public void setClassificationValue(String classificationValue) {
		this.classificationValue = classificationValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
