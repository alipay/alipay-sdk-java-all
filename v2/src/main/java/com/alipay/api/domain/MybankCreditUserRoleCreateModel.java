package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建网商会员
 *
 * @author auto create
 * @since 1.0, 2023-01-11 16:49:27
 */
public class MybankCreditUserRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2477372621618892281L;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("entity_code_open_id")
	private String entityCodeOpenId;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 扩展数据（map转换为json字符串）
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 业务场景，7-代表网商贷在开放平台对外开放
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityCodeOpenId() {
		return this.entityCodeOpenId;
	}
	public void setEntityCodeOpenId(String entityCodeOpenId) {
		this.entityCodeOpenId = entityCodeOpenId;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
