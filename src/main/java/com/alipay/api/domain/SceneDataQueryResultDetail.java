package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车金融数据查询返回值
 *
 * @author auto create
 * @since 1.0, 2017-10-17 17:33:41
 */
public class SceneDataQueryResultDetail extends AlipayObject {

	private static final long serialVersionUID = 1727636523378132115L;

	/**
	 * 网商银行申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 机构需要查询的订单数据，
	 */
	@ApiField("result")
	private String result;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
