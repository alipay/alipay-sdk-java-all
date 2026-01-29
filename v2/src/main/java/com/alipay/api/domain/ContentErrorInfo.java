package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容品检错误信息
 *
 * @author auto create
 * @since 1.0, 2024-09-23 10:33:34
 */
public class ContentErrorInfo extends AlipayObject {

	private static final long serialVersionUID = 5577911752443652362L;

	/**
	 * 内容品检错误的数量
	 */
	@ApiField("error_amount")
	private Long errorAmount;

	/**
	 * 内容品检错误详情
	 */
	@ApiListField("error_details")
	@ApiField("content_error_detai")
	private List<ContentErrorDetai> errorDetails;

	public Long getErrorAmount() {
		return this.errorAmount;
	}
	public void setErrorAmount(Long errorAmount) {
		this.errorAmount = errorAmount;
	}

	public List<ContentErrorDetai> getErrorDetails() {
		return this.errorDetails;
	}
	public void setErrorDetails(List<ContentErrorDetai> errorDetails) {
		this.errorDetails = errorDetails;
	}

}
