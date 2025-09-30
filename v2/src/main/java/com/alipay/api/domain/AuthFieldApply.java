package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息申请请求模型
 *
 * @author auto create
 * @since 1.0, 2024-08-30 11:28:36
 */
public class AuthFieldApply extends AlipayObject {

	private static final long serialVersionUID = 1542928651469394799L;

	/**
	 * 接口英文名称，通过alipay.open.app.api.query接口查询获得。
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 贵公司是否有自己的客服渠道，能及时响应和处理舆情数量是多少？
	 */
	@ApiField("customer_answer")
	private String customerAnswer;

	/**
	 * 字段英文名称，通过alipay.open.app.api.query接口查询获得。
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 功能code，通过alipay.open.app.api.query接口查询获得
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 接入后一年内预计接口秒级调用量峰值是多少？（最高峰值：1000QPS）
	 */
	@ApiField("qps_answer")
	private String qpsAnswer;

	/**
	 * 场景code，alipay.open.app.api.scene.query 接口查询获得
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 当为使用使用模板的小程序申请时可传入所使用的小程序模板id
	 */
	@ApiField("tiny_app_template_id")
	private String tinyAppTemplateId;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getCustomerAnswer() {
		return this.customerAnswer;
	}
	public void setCustomerAnswer(String customerAnswer) {
		this.customerAnswer = customerAnswer;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getQpsAnswer() {
		return this.qpsAnswer;
	}
	public void setQpsAnswer(String qpsAnswer) {
		this.qpsAnswer = qpsAnswer;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTinyAppTemplateId() {
		return this.tinyAppTemplateId;
	}
	public void setTinyAppTemplateId(String tinyAppTemplateId) {
		this.tinyAppTemplateId = tinyAppTemplateId;
	}

}
