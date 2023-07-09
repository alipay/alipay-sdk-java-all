package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链池融资借据信息查询
 *
 * @author auto create
 * @since 1.0, 2020-09-15 10:34:30
 */
public class AnttechBlockchainFinancePfIouQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7335736285494384812L;

	/**
	 * 客户号
	 */
	@ApiField("client_no")
	private String clientNo;

	/**
	 * 借据号
	 */
	@ApiField("debit_id")
	private String debitId;

	/**
	 * 支用Id
	 */
	@ApiField("financing_id")
	private String financingId;

	/**
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/**
	 * 平台Id
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getClientNo() {
		return this.clientNo;
	}
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getDebitId() {
		return this.debitId;
	}
	public void setDebitId(String debitId) {
		this.debitId = debitId;
	}

	public String getFinancingId() {
		return this.financingId;
	}
	public void setFinancingId(String financingId) {
		this.financingId = financingId;
	}

	public String getParm() {
		return this.parm;
	}
	public void setParm(String parm) {
		this.parm = parm;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
