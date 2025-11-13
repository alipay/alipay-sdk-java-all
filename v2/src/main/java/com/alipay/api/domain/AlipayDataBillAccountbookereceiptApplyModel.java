package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请子账本电子回单(incubating)
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:43:17
 */
public class AlipayDataBillAccountbookereceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8743986746662962593L;

	/**
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 明细凭证，传入流水号（转账接口查询结果）。汇总凭证，传入起止时间，格式yyyy-MM-dd_yyyy-MM-dd。
	 */
	@ApiField("key")
	private String key;

	/**
	 * 子账本号，或者子账本名称。模糊查询
	 */
	@ApiField("store_no")
	private String storeNo;

	/**
	 * 申请的类型。可传入：FUND_PLATFORM_DETAIL - 资金明细证明，FUND_PLATFORM_SUM - 资金汇总证明
	 */
	@ApiField("type")
	private String type;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
