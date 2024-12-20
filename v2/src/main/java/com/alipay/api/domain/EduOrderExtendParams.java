package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2023-06-07 09:57:50
 */
public class EduOrderExtendParams extends AlipayObject {

	private static final long serialVersionUID = 4546885535272557443L;

	/**
	 * 银行备注信息
	 */
	@ApiField("bank_memo")
	private String bankMemo;

	/**
	 * 系统商编号
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	public String getBankMemo() {
		return this.bankMemo;
	}
	public void setBankMemo(String bankMemo) {
		this.bankMemo = bankMemo;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
