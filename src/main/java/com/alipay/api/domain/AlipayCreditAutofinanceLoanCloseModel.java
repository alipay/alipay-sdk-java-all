package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销订单
 *
 * @author auto create
 * @since 1.0, 2016-10-17 16:44:44
 */
public class AlipayCreditAutofinanceLoanCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4416875598633319937L;

	/**
	 * 汽车金融内部订单号
	 */
	@ApiField("applyno")
	private String applyno;

	/**
	 * 机构编号
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	/**
	 * 关闭原因
	 */
	@ApiField("reson")
	private String reson;

	/**
	 * 关闭类型
1.	CLOSE_USER_CANCEL(用户主动放弃贷款)
2.	CLOSE_TD_REJECT(同盾校验失败)
3.	CLOSE_OTHER(其他情况)
	 */
	@ApiField("type")
	private String type;

	public String getApplyno() {
		return this.applyno;
	}
	public void setApplyno(String applyno) {
		this.applyno = applyno;
	}

	public String getOrgcode() {
		return this.orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getOutorderno() {
		return this.outorderno;
	}
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

	public String getReson() {
		return this.reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
