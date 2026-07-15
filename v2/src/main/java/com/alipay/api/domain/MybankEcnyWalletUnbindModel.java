package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解绑钱包
 *
 * @author auto create
 * @since 1.0, 2026-05-13 13:54:27
 */
public class MybankEcnyWalletUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5652471362332817933L;

	/**
	 * 绑定场景
	 */
	@ApiField("bind_scene")
	private String bindScene;

	/**
	 * 标识一次单独的接口调用，用于接口幂等处理和问题排查的索引
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 钱包编号
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getBindScene() {
		return this.bindScene;
	}
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
