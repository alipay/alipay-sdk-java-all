package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户申请请求
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:18:12
 */
public class ApplySubAccountAndBindOrder extends AlipayObject {

	private static final long serialVersionUID = 7895485722824598969L;

	/**
	 * 机构ID，如ZL6、ZL7
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 商户结算pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 上游申请请求单号，source + outBizNo 用于幂等。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 来源，通常为业务系统名，source + outBizNo 用于幂等。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 财资业务识别码。用于财资识别需要使用的主账户。由财资预先分配。联系周丹
	 */
	@ApiField("treasury_business_type")
	private String treasuryBusinessType;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTreasuryBusinessType() {
		return this.treasuryBusinessType;
	}
	public void setTreasuryBusinessType(String treasuryBusinessType) {
		this.treasuryBusinessType = treasuryBusinessType;
	}

}
