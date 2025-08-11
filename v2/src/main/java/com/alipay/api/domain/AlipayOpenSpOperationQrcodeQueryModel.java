package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询代运营授权或者账号绑定二维码
 *
 * @author auto create
 * @since 1.0, 2025-06-17 15:53:57
 */
public class AlipayOpenSpOperationQrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2853466522894186195L;

	/**
	 * 接入的产品编号。
操作类型为绑定的，填OPENAPI_BIND_DEFAULT;
操作类型为授权的，填OPENAPI_AUTH_DEFAULT
	 */
	@ApiField("access_product_code")
	private String accessProductCode;

	/**
	 * 支付宝登录账号。通常为手机号或者邮箱。
若被代运营者是间连商户，该字段无需填写。
若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 场景授权列表结构结构：场景codeA:权限code1,权限code2;场景codeB:权限code1,权限code2;
	 */
	@ApiField("isv_scene_permissions")
	private String isvScenePermissions;

	/**
	 * 支付宝商户号。注意仅支持 2088 开头的间连商户。
若被代运营者是间连商户，则 merchant_no 必填；
若为直连商户，则 merchant_no 和 alipay_account 不能同时为空，都有值优先取 merchant_no。
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 代运营操作类型。取值如下：
* ACCOUNT_BIND：账号绑定，仅支持间连商户。
* OPERATION_AUTH：代运营授权，支持间连、直连商户。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部操作流水，由服务商自定义，需确保每次操作唯一。仅支持数字、字母、下划线组合。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getAccessProductCode() {
		return this.accessProductCode;
	}
	public void setAccessProductCode(String accessProductCode) {
		this.accessProductCode = accessProductCode;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getIsvScenePermissions() {
		return this.isvScenePermissions;
	}
	public void setIsvScenePermissions(String isvScenePermissions) {
		this.isvScenePermissions = isvScenePermissions;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
