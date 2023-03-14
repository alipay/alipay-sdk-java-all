package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车金融数据查询返回值
 *
 * @author auto create
 * @since 1.0, 2023-01-05 14:20:12
 */
public class SceneDataQueryResultDetail extends AlipayObject {

	private static final long serialVersionUID = 8585978648791217136L;

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
