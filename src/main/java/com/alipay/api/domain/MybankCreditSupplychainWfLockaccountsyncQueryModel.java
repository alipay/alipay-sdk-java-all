package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 锁户同步接口
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:43:38
 */
public class MybankCreditSupplychainWfLockaccountsyncQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4673133274785583489L;

	/**
	 * 锁户同步
	 */
	@ApiListField("lockaccountsyncs")
	@ApiField("lockaccountsync")
	private List<Lockaccountsync> lockaccountsyncs;

	/**
	 * 幂等id
	 */
	@ApiField("requestid")
	private String requestid;

	public List<Lockaccountsync> getLockaccountsyncs() {
		return this.lockaccountsyncs;
	}
	public void setLockaccountsyncs(List<Lockaccountsync> lockaccountsyncs) {
		this.lockaccountsyncs = lockaccountsyncs;
	}

	public String getRequestid() {
		return this.requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

}
