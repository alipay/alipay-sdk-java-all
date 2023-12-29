package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业融资数据采集平台对外的数据提交接口
 *
 * @author auto create
 * @since 1.0, 2023-05-29 17:41:44
 */
public class AlipayCreditCreditriskDataPutModel extends AlipayObject {

	private static final long serialVersionUID = 7621819846518544679L;

	/**
	 * 数据类别,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的数据模型的类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 外部机构编码(ISV注册成为网商银行的会员，ISV在网商的会员ID)
	 */
	@ApiField("dataorgid")
	private String dataorgid;

	/**
	 * 数据提供者,ISV注册成为网商银行的会员，达成数据合作服务，约定数据模型，由网商分配给ISV的机构代号
	 */
	@ApiField("dataprovider")
	private String dataprovider;

	/**
	 * 实体编码(ISV客户的支付宝数字ID)
	 */
	@ApiField("entitycode")
	private String entitycode;

	/**
	 * 实体名(ISV客户的支付宝登录号)
	 */
	@ApiField("entityname")
	private String entityname;

	/**
	 * 实体类型(固定为ALIPAY)
	 */
	@ApiField("entitytype")
	private String entitytype;

	/**
	 * 为满足网商银行数据跨域输出的合规要求，β计划中预付融资、赊呗、采购贷、池融资、网商贷等产品相关场景进行合规确权改造，确权方案中需在业务接口入参中加入auth_scene_code（授权场景码）和auth_token（授权令牌，用于鉴权）两个字段供调用方传入字段值
	 */
	@ApiField("mybk_auth_scene_code")
	private String mybkAuthSceneCode;

	/**
	 * 为满足网商银行数据跨域输出的合规要求，β计划中预付融资、赊呗、采购贷、池融资、网商贷等产品相关场景进行合规确权改造，确权方案中需在业务接口入参中加入auth_scene_code（授权场景码）和auth_token（授权令牌，用于鉴权）两个字段供调用方传入字段值
	 */
	@ApiField("mybk_auth_token")
	private String mybkAuthToken;

	/**
	 * Json格式,数据内容,ISV注册成为网商银行的会员，达成数据合作服务，约定json串字段和内容,ISV将数据给到网商，网商按照约定解析Json内容
	 */
	@ApiField("objectcontent")
	private String objectcontent;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 采集任务ID
	 */
	@ApiField("taskid")
	private String taskid;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDataorgid() {
		return this.dataorgid;
	}
	public void setDataorgid(String dataorgid) {
		this.dataorgid = dataorgid;
	}

	public String getDataprovider() {
		return this.dataprovider;
	}
	public void setDataprovider(String dataprovider) {
		this.dataprovider = dataprovider;
	}

	public String getEntitycode() {
		return this.entitycode;
	}
	public void setEntitycode(String entitycode) {
		this.entitycode = entitycode;
	}

	public String getEntityname() {
		return this.entityname;
	}
	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}

	public String getEntitytype() {
		return this.entitytype;
	}
	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public String getMybkAuthSceneCode() {
		return this.mybkAuthSceneCode;
	}
	public void setMybkAuthSceneCode(String mybkAuthSceneCode) {
		this.mybkAuthSceneCode = mybkAuthSceneCode;
	}

	public String getMybkAuthToken() {
		return this.mybkAuthToken;
	}
	public void setMybkAuthToken(String mybkAuthToken) {
		this.mybkAuthToken = mybkAuthToken;
	}

	public String getObjectcontent() {
		return this.objectcontent;
	}
	public void setObjectcontent(String objectcontent) {
		this.objectcontent = objectcontent;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getTaskid() {
		return this.taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

}
