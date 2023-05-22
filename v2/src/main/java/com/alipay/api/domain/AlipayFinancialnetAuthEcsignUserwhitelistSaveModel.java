package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签呗电子签约用户白名单信息保存服务
 *
 * @author auto create
 * @since 1.0, 2023-05-22 09:48:06
 */
public class AlipayFinancialnetAuthEcsignUserwhitelistSaveModel extends AlipayObject {

	private static final long serialVersionUID = 1785316591415616242L;

	/**
	 * 回跳页面类型
	 */
	@ApiField("back_type")
	private String backType;

	/**
	 * 回跳页面地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 用户手机号码，用于短信使用，可为空。
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 外部订单号由外部系统传入
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 解决方案码由运营平台生成
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 合同模板列表
	 */
	@ApiListField("template_vo_list")
	@ApiField("contract_template_open_v_o")
	private List<ContractTemplateOpenVO> templateVoList;

	/**
	 * 第三方平台，签约后跳回外部app
	 */
	@ApiField("third_part_schema")
	private String thirdPartSchema;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBackType() {
		return this.backType;
	}
	public void setBackType(String backType) {
		this.backType = backType;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBindedMobile() {
		return this.bindedMobile;
	}
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public List<ContractTemplateOpenVO> getTemplateVoList() {
		return this.templateVoList;
	}
	public void setTemplateVoList(List<ContractTemplateOpenVO> templateVoList) {
		this.templateVoList = templateVoList;
	}

	public String getThirdPartSchema() {
		return this.thirdPartSchema;
	}
	public void setThirdPartSchema(String thirdPartSchema) {
		this.thirdPartSchema = thirdPartSchema;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
