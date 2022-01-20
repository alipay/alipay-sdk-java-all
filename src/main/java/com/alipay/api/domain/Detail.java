package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * E签宝附件列表
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class Detail extends AlipayObject {

	private static final long serialVersionUID = 4615385136621879629L;

	/**
	 * 英文描述（collectAttachement值为true时必填）
以下是系统固定code,对上传的图片做相应的校验。
身份证校验情况：
身份证正面照片：ESIGN_IDCARD
身份证背面照片：ESIGN_BACK_IDCARD
	 */
	@ApiField("code")
	private String code;

	/**
	 * 请上传手机正面照
	 */
	@ApiField("description")
	private String description;

	/**
	 * 顺序（collectAttachement值为true时必填）
	 */
	@ApiField("order")
	private Long order;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

}
