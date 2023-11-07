package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取公网上传文件链接
 *
 * @author auto create
 * @since 1.0, 2023-07-17 19:29:54
 */
public class AlipayDigitalmgmtAppUrlforuploadQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7559178369939139496L;

	/**
	 * 外部用户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 来源站点
	 */
	@ApiField("source")
	private String source;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
