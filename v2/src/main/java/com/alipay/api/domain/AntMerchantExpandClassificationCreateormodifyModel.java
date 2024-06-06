package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁商家标签单条保存
 *
 * @author auto create
 * @since 1.0, 2022-11-29 10:36:47
 */
public class AntMerchantExpandClassificationCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 5826453164737765549L;

	/**
	 * 标签Key（英文标识），不存在的Key是无法执行的
	 */
	@ApiField("classification_key")
	private String classificationKey;

	/**
	 * 标签值
	 */
	@ApiField("classification_value")
	private String classificationValue;

	/**
	 * 可选：商户PID、间连SMID、店铺ShopID，具体根据target_type入参值决定
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 决定target_id的类型
target_type取值为0，target_id为间连SMID
target_type取值为2，target_id为商户PID
target_type取值为5，target_id为店铺ShopID
	 */
	@ApiField("target_type")
	private String targetType;

	public String getClassificationKey() {
		return this.classificationKey;
	}
	public void setClassificationKey(String classificationKey) {
		this.classificationKey = classificationKey;
	}

	public String getClassificationValue() {
		return this.classificationValue;
	}
	public void setClassificationValue(String classificationValue) {
		this.classificationValue = classificationValue;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
