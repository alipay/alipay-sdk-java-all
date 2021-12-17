package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约主体信息，例如个人签约者，企业签约者
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class SignTask extends AlipayObject {

	private static final long serialVersionUID = 2452538447628793322L;

	/**
	 * 业务扩展参数 {"key1":"value2"}
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务流水号，保证唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 定义签约流程结束后回调方式，必传，枚举值，由签约平台定义。
1. call_back_url。支付宝签约流程结束后，通过http协议回调业务系统页面或外部应用。
2. close。 支付宝签约流程结束后，关闭流程，不做跳转。
	 */
	@ApiField("cb_type")
	private String cbType;

	/**
	 * 回调外部业务系统的地址
	 */
	@ApiField("cb_url")
	private String cbUrl;

	/**
	 * 1 - 云签
2 - 移动签
	 */
	@ApiField("cert_sign_type")
	private Long certSignType;

	/**
	 * 签约跳转方式，格式说明：业务入口形态_2_支付宝签约方式。
'NONEED'  // 无需支付宝认证
'h5_2_alipay'  // 支付宝内部H5页面，通过Url跳转支付宝钱包H5签约流程
'app_2_alipay' // 支付宝外部APP，通过schema协议跳转支付宝钱包H5签约流程
'qrcode_2_alipay' // 请求一个签约二维码入口，通过支付宝钱包二维码扫一扫，跳转H5签约流程
'pc_2_pc'  // PC签约流程，通过Url跳转支付宝PC签约流程
	 */
	@ApiField("enter_type")
	private String enterType;

	/**
	 * 签约操作者列表
	 */
	@ApiListField("principal_list")
	@ApiField("principal")
	private List<Principal> principalList;

	/**
	 * 签约主体类型。
individual   //个人认证
entreprise  //企业认证
	 */
	@ApiField("signer_type")
	private String signerType;

	/**
	 * 签约任务有效时长，单位秒。可有外部系统控制时长，如果不传系统会赋予默认值。
	 */
	@ApiField("task_expire")
	private String taskExpire;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCbType() {
		return this.cbType;
	}
	public void setCbType(String cbType) {
		this.cbType = cbType;
	}

	public String getCbUrl() {
		return this.cbUrl;
	}
	public void setCbUrl(String cbUrl) {
		this.cbUrl = cbUrl;
	}

	public Long getCertSignType() {
		return this.certSignType;
	}
	public void setCertSignType(Long certSignType) {
		this.certSignType = certSignType;
	}

	public String getEnterType() {
		return this.enterType;
	}
	public void setEnterType(String enterType) {
		this.enterType = enterType;
	}

	public List<Principal> getPrincipalList() {
		return this.principalList;
	}
	public void setPrincipalList(List<Principal> principalList) {
		this.principalList = principalList;
	}

	public String getSignerType() {
		return this.signerType;
	}
	public void setSignerType(String signerType) {
		this.signerType = signerType;
	}

	public String getTaskExpire() {
		return this.taskExpire;
	}
	public void setTaskExpire(String taskExpire) {
		this.taskExpire = taskExpire;
	}

}
