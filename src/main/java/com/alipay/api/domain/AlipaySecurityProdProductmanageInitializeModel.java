package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品管理服务初始化接口
 *
 * @author auto create
 * @since 1.0, 2019-06-28 10:50:59
 */
public class AlipaySecurityProdProductmanageInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6882941461273461474L;

	/**
	 * 用户证件类型，需传入英文枚举常量，当前支持：IDCARD(大陆身份证)
	 */
	@ApiField("account_cert_type")
	private String accountCertType;

	/**
	 * 用户ID（支付宝租户访问，等同于userId）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 初始化请求动作，枚举定义见 VerifyProductManagerType
	 */
	@ApiField("action")
	private String action;

	/**
	 * 业务摘要ID，标识单笔业务唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用户证件号码
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品管理场景码，标识唯一业务场景，统一分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 租户ID，金融云租户：FINCLOUD
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAccountCertType() {
		return this.accountCertType;
	}
	public void setAccountCertType(String accountCertType) {
		this.accountCertType = accountCertType;
	}

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
