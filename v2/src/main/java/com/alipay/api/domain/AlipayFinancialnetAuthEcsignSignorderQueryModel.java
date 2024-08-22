package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签呗电子签约单查询服务
 *
 * @author auto create
 * @since 1.0, 2024-04-29 20:14:15
 */
public class AlipayFinancialnetAuthEcsignSignorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5676453246154264691L;

	/**
	 * 签约请求代理模式，说明被代理的对象，其中proxiedPid是被代理的商户的PID，非UID
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 签约产品码
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/**
	 * 签约方案码
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getSignProductId() {
		return this.signProductId;
	}
	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
