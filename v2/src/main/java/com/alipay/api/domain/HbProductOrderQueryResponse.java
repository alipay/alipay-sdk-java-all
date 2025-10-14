package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘系商家合约订购查询返回模型
 *
 * @author auto create
 * @since 1.0, 2020-07-01 09:43:41
 */
public class HbProductOrderQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 2274427883414415583L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 合约订购列表
	 */
	@ApiListField("product_order_list")
	@ApiField("product_order_d_t_o")
	private List<ProductOrderDTO> productOrderList;

	/**
	 * 业务是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<ProductOrderDTO> getProductOrderList() {
		return this.productOrderList;
	}
	public void setProductOrderList(List<ProductOrderDTO> productOrderList) {
		this.productOrderList = productOrderList;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
