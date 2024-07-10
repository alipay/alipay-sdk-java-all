package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度申请一签相关参数
1. signProductId：签约产品码，必传，蚂蚁签约中心分配
2. partnerId：机构ID，必传，蚂蚁签约中心分配
3. solutionCode：签约方案码，必传，蚂蚁签约中心分配
4. signerName：签约人姓名，必传
5. backUrl要跳转的页面url，如url有参数，先encode处理
6. extInfo: 用于传输协议渲染所需内容
 *
 * @author auto create
 * @since 1.0, 2021-05-21 10:14:04
 */
public class SignInfo extends AlipayObject {

	private static final long serialVersionUID = 1363668464764674292L;

	/**
	 * 要跳转的页面url，如url有参数，先encode处理
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 用于传输协议渲染所需内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 签约中心机构ID，蚂蚁签约中心分配
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 签约产品码，蚂蚁签约中心分配
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/**
	 * 签约人姓名
	 */
	@ApiField("signer_name")
	private String signerName;

	/**
	 * 签约方案码，蚂蚁签约中心分配
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getSignProductId() {
		return this.signProductId;
	}
	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}

	public String getSignerName() {
		return this.signerName;
	}
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
