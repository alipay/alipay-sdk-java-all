package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 前台产品信息模型
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:28:30
 */
public class FrontProductVO extends AlipayObject {

	private static final long serialVersionUID = 8373133685244421291L;

	/**
	 * 产品包含的权限集列表
	 */
	@ApiListField("permission_set_list")
	@ApiField("permission_set_v_o")
	private List<PermissionSetVO> permissionSetList;

	/**
	 * 服务商代运营基础包
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 服务商代运营基础包
	 */
	@ApiField("product_name")
	private String productName;

	public List<PermissionSetVO> getPermissionSetList() {
		return this.permissionSetList;
	}
	public void setPermissionSetList(List<PermissionSetVO> permissionSetList) {
		this.permissionSetList = permissionSetList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
