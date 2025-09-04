package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专户账单查询
 *
 * @author auto create
 * @since 1.0, 2024-06-25 20:25:18
 */
public class AlipayCommerceEcTransBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3896865936717186313L;

	/**
	 * 资金专户账号ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该资金专户的业务场景码 当前字段已废弃(入参中scene易理解，使用资金专户ID（account_book_id）替代)
	 */
	@ApiField("scene")
	@Deprecated
	private String scene;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
