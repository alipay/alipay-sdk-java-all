package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务特征查询数据产品
 *
 * @author auto create
 * @since 1.0, 2025-12-24 15:12:41
 */
public class ZhimaCreditEpBusinessIndicatorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3134987687456114676L;

	/**
	 * 授权编号
	 */
	@ApiField("auth_id")
	private String authId;

	/**
	 * 业务关键词
	 */
	@ApiField("business_key")
	private String businessKey;

	/**
	 * 手机号，可密文
	 */
	@ApiField("cell")
	private String cell;

	/**
	 * 姓名，可密文
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAuthId() {
		return this.authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getBusinessKey() {
		return this.businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getCell() {
		return this.cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
